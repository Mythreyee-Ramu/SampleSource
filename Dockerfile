FROM openjdk:8-jdk-alpine

MAINTAINER MYTHREYEE 

ADD /target/*.jar consumer-0.0.1-SNAPSHOT.jar

ENTRYPOINT [ "java", "-jar", "/consumer-0.0.1-SNAPSHOT.jar", --server.port=80"]


