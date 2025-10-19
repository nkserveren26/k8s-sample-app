FROM maven:3.9.6-eclipse-temurin-21 AS builder
WORKDIR /app

# Copy the source code and run the build.
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# ---- Run Stage ----
FROM openjdk:21-jdk-slim
WORKDIR /app

# Copy the jar file created in the builder stage.
COPY --from=builder /app/target/*.jar app.jar

# open port 8080 for a jvm app.
EXPOSE 8080

# startup a jvm app.
ENTRYPOINT ["java", "-jar", "app.jar"]