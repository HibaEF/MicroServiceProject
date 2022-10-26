FROM openjdk:8-jdk-alpine
EXPOSE 8092
ADD /target/gateway1-0.0.1-SNAPSHOT.jar gateway1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "gateway1-0.0.1-SNAPSHOT.jar"]