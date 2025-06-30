# Use an official JDK image
FROM openjdk:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the jar
COPY target/todo-app-0.0.1-SNAPSHOT.jar app.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
