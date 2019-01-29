****搭建kafka
1.运行zookeeper
docker run --name zookeeper -p 2181:2181 -d docker-id
2.运行kafka
docker run
 --name kafka -p 9092:9092
  -e KAFKA_ADVERTISED_HOST_NAME=kafka01 
  -e KAFKA_CREATE_TOPICS="test:1:1" 
  -e KAFKA_ZOOKEEPER_CONNECT=172.17.120.202:2181
  -d  wurstmeister/kafka

3.运行kafka-manager
