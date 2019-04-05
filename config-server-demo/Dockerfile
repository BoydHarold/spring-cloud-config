FROM openjdk:8-jdk-alpine

EXPOSE 8888

##### CONFIGURE ENVIRONMENT #####
COPY  ./target/config-server-demo-0.0.1-SNAPSHOT.jar  /home/config-server-demo-0.0.1-SNAPSHOT.jar

ENTRYPOINT   java -jar /home/config-server-demo-0.0.1-SNAPSHOT.jar