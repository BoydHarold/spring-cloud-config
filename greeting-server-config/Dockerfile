FROM openjdk:8-jdk-alpine

EXPOSE 8080

##### CONFIGURE ENVIRONMENT #####
COPY  ./target/greeting-server-config-0.0.1-SNAPSHOT.jar  /home/greeting-server-config-0.0.1-SNAPSHOT.jar

ENTRYPOINT   java -jar /home/greeting-server-config-0.0.1-SNAPSHOT.jar 
