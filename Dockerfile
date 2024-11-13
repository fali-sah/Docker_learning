# Use an OpenJDK base image
FROM openjdk:8-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot JAR file into the container
COPY target/springboot_docker.jar .

# Expose the port your Spring Boot app is running on (default is 8080)
EXPOSE 8091

# Define the command to run the Spring Boot application
CMD ["java", "-jar", "/app/springboot_docker.jar"]

