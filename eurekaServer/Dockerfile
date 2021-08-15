FROM openjdk:11.0.12-jre-slim-buster
ARG JAR_FILE=build/libs/eurekaServer-trial.jar
COPY ${JAR_FILE} eurekaServer-trial.jar
EXPOSE 11000
ENTRYPOINT ["java","-jar","/eurekaServer-trial.jar"]