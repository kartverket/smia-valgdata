FROM eclipse-temurin:25-jdk-alpine@sha256:791d5d532c81d02d16e93d34d8546d50a641222c2a40da5fc263c8a35ba773c5


RUN addgroup -S appgroup && adduser -S appuser -G appgroup

WORKDIR /app

COPY build/libs/*.jar app.jar

EXPOSE 8080

RUN chown -R appuser:appgroup /app

USER appuser

ENTRYPOINT ["java", "-jar", "app.jar"]

