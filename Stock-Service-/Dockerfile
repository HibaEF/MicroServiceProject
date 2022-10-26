FROM openjdk:8-jdk-alpine
EXPOSE 8082
ADD /target/stock-service-0.0.1-SNAPSHOT.jar stock-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "stock-service-0.0.1-SNAPSHOT.jar"]