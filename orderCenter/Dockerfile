FROM openjdk:11.0.12-jre-slim-buster
ARG JAR_FILE=build/libs/orderCenter-trial.jar
COPY ${JAR_FILE} orderCenter-trial.jar
EXPOSE 11300
ENTRYPOINT ["java","-jar","/orderCenter-trial.jar"]