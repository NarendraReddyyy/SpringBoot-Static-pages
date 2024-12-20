# Step 1: Use a base image with JDK
FROM openjdk:17-jdk-alpine

# Step 3: Copy the JAR file into the container
ADD target/springapp.jar springapp.jar

# Step 4: Expose the port used by the Spring Boot app
EXPOSE 8082

# Step 5: Specify the command to run the application
ENTRYPOINT ["java", "-jar", "springapp.jar"]
