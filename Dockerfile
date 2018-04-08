FROM openjdk:8-jdk-alpine
COPY ./target/FirstDocker-1.0.jar /usr/src/balu/
WORKDIR /usr/src/balu/
EXPOSE 2222
CMD ["java", "-jar", "FirstDocker-1.0.jar"]