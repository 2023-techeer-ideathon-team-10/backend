# FROM adoptopenjdk/openjdk11
# CMD ["./mvnw", "clean", "package"]
# ARG JAR_FILE_PATH=target/*.jar
# COPY ${JAR_FILE_PATH} app.jar
# ENTRYPOINT ["java", "-jar", "app.jar"]

FROM openjdk:11-jre
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]