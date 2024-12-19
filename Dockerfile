# Step 1: Use a base image with JDK
FROM openjdk:17-jdk-alpine

# Step 2: Set the working directory in the container
WORKDIR /app

# Step 3: Copy the JAR file into the container
COPY /var/lib/jenkins/workspace/SpringBoot/target/static-ui-app-0.0.1-SNAPSHOT.jar /app/app.jar

# Step 4: Expose the port used by the Spring Boot app
EXPOSE 1234

# Step 5: Specify the command to run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
