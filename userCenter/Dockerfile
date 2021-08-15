FROM openjdk:11.0.12-jre-slim-buster
ARG JAR_FILE=build/libs/userCenter-trial.jar
COPY ${JAR_FILE} userCenter-trial.jar
EXPOSE 11200
ENTRYPOINT ["java","-jar","/userCenter-trial.jar"]