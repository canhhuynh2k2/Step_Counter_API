FROM maven:3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from==build /target/stepcounter-0.0.1-SNAPSHOT.jar stepcounter.jar
EXPOSE 8070
ENTRYPOINT ["java", "-jar", "stepcounter.jar"]