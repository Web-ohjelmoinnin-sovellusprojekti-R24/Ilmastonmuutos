FROM openjdk:19
MAINTAINER myname
COPY ./webproject-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]