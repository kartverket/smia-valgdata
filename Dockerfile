FROM eclipse-temurin:24-jdk-alpine@sha256:da2196e2ec0d51d8c4c88c19f671952d251dd512c19381d5f6eab6d97dbd5908


RUN addgroup -S appgroup && adduser -S appuser -G appgroup

WORKDIR /app

COPY build/libs/*.jar app.jar

EXPOSE 8080

RUN chown -R appuser:appgroup /app

USER appuser

ENTRYPOINT ["java", "-jar", "app.jar"]

