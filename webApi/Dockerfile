FROM openjdk:11.0.12-jre-slim-buster
ARG JAR_FILE=build/libs/webApi-trial.jar
COPY ${JAR_FILE} webApi-trial.jar
EXPOSE 11100
ENTRYPOINT ["java","-jar","/webApi-trial.jar"]