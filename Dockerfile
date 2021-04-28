# syntax=docker/dockerfile:1

FROM openjdk:15-alpine
RUN addgroup -S springinv && adduser -S springinv -G springinv
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]