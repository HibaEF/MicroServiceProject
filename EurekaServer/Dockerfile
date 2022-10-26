FROM openjdk:8-jdk-alpine
EXPOSE 8761
ADD /target/EurekaServer-0.0.1-SNAPSHOT.jar EurekaServer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "EurekaServer-0.0.1-SNAPSHOT.jar"]