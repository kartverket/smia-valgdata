FROM eclipse-temurin:24-jdk-alpine@sha256:8fdbcb6bc6b846640cea7058e6eeb56c311fae4efaa506a213789134065c6b90


RUN addgroup -S appgroup && adduser -S appuser -G appgroup

WORKDIR /app

COPY build/libs/*.jar app.jar

EXPOSE 8080

RUN chown -R appuser:appgroup /app

USER appuser

ENTRYPOINT ["java", "-jar", "app.jar"]

