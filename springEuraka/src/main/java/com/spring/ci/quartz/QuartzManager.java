package com.spring.ci.quartz;

import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： h3c-bj-park
 * @Date : 2019/2/14 9:49
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
@Service
public class QuartzManager {
    @Autowired
    private SchedulerFactoryBean schedulerFactoryBean;

    private static final Logger LOGGER = LoggerFactory.getLogger(QuartzManager.class);

    public void addJobTask(Class<? extends Job> clazz, String name, String group, String cron) {
        JobDetail jobDetail = JobBuilder.newJob(clazz).withIdentity(name, group).build();
        jobDetail.getJobDataMap().put("jobName", name);
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule(cron);
        CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity(name, group)
                .withSchedule(cronScheduleBuilder).build();
        try {
            schedulerFactoryBean.getScheduler().scheduleJob(jobDetail, cronTrigger);
            schedulerFactoryBean.getScheduler().start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }

    }

    /**
     * 获取Job信息
     *
     * @param name  Job姓名
     * @param group Job分组
     * @return 时间, 状态
     * @throws SchedulerException Exception
     */
    public String getJobInfo(String name, String group) throws SchedulerException {
        TriggerKey triggerKey = new TriggerKey(name, group);
        CronTrigger cronTrigger = (CronTrigger) schedulerFactoryBean.getScheduler().getTrigger(triggerKey);
        return String.format("time:%s,state:%s", cronTrigger.getCronExpression(),
                schedulerFactoryBean.getScheduler().getTriggerState(triggerKey).name());
    }

    public void modifyJobTime(String name, String group, String cron) {
        try {
            TriggerKey triggerKey = TriggerKey.triggerKey(name, group);
            CronTrigger trigger = (CronTrigger) schedulerFactoryBean.getScheduler().getTrigger(triggerKey);
            if (trigger == null) {
                throw new NullPointerException();
            }
            String oldTime = trigger.getCronExpression();
            if (!oldTime.equalsIgnoreCase(cron)) {
                // 触发器
                TriggerBuilder<Trigger> triggerBuilder = TriggerBuilder.newTrigger();
                // 触发器名,触发器组
                triggerBuilder.withIdentity(name, group);
                triggerBuilder.startNow();
                // 触发器时间设定
                triggerBuilder.withSchedule(CronScheduleBuilder.cronSchedule(cron));
                // 创建Trigger对象
                trigger = (CronTrigger) triggerBuilder.build();
                // 方式一 ：修改一个任务的触发时间
                schedulerFactoryBean.getScheduler().rescheduleJob(triggerKey, trigger);
            }
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    /**
     * 暂停所有任务
     *
     * @throws SchedulerException Exception
     */
    public void pauseAllJob() throws SchedulerException {
        schedulerFactoryBean.getScheduler().pauseAll();
    }

    /**
     * 暂停某个任务
     *
     * @param name  任务名
     * @param group 任务组
     * @throws SchedulerException Exception
     */
    public void pauseJob(String name, String group) {
        JobKey jobKey = new JobKey(name, group);
        JobDetail jobDetail = null;
        try {
            jobDetail = schedulerFactoryBean.getScheduler().getJobDetail(jobKey);
            if (jobDetail == null)
                return;
            schedulerFactoryBean.getScheduler().pauseJob(jobKey);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    /**
     * 恢复某个任务
     *
     * @param name  任务名
     * @param group 任务组
     * @throws SchedulerException Exception
     */
    public void resumeJob(String name, String group) throws SchedulerException {
        JobKey jobKey = new JobKey(name, group);
        JobDetail jobDetail = schedulerFactoryBean.getScheduler().getJobDetail(jobKey);
        if (jobDetail == null)
            return;
        schedulerFactoryBean.getScheduler().resumeJob(jobKey);
    }

    /**
     * 恢复所有任务
     *
     * @throws SchedulerException Exception
     */
    public void resumeAllJob() throws SchedulerException {
        schedulerFactoryBean.getScheduler().resumeAll();
    }

    /**
     * 删除某个任务
     *
     * @param name  任务名
     * @param group 任务组
     */
    public void deleteJob(String name, String group) {
        JobKey jobKey = new JobKey(name, group);
        JobDetail jobDetail = null;
        try {
            jobDetail = schedulerFactoryBean.getScheduler().getJobDetail(jobKey);
            if (jobDetail == null)
                return;
            schedulerFactoryBean.getScheduler().deleteJob(jobKey);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

//    public static String generaterCron(String type, int time) {
//        String cron = null;
//        switch (type) {
//            case "hour":
//                if (time > 23 || time < 1) {
//                    throw BizException.of(ErrorCode.TIME_EXCEED_ERROR);
//                }
//                cron = "0 0 0/" + time + " * * ?";
//                break;
//            case "minute":
//                if (time > 59 || time < 1) {
//                    throw BizException.of(ErrorCode.TIME_EXCEED_ERROR);
//                }
//                cron = "0 0/" + time + " * * * ?";
//                break;
//            case "second":
//                if (time > 59 || time < 1) {
//                    throw BizException.of(ErrorCode.TIME_EXCEED_ERROR);
//                }
//                cron = "0/" + time + " * * * * ?";
//                break;
//            default:
//                break;
//        }
//        return cron;
//    }
}
