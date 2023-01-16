FROM maven:3.8.6-openjdk-18-slim

ADD target/match-svc.jar match-svc.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","/match-svc.jar"]
