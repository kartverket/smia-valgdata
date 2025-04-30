FROM eclipse-temurin:21-alpine@sha256:2f2f553ce09d25e2d2f0f521ab94cd73f70c9b21327a29149c23a2b63b8e29a0

RUN addgroup -S appgroup && adduser -S appuser -G appgroup

WORKDIR /app

COPY build/libs/*.jar app.jar

EXPOSE 8080

RUN chown -R appuser:appgroup /app

USER appuser

ENTRYPOINT ["java", "-jar", "app.jar"]

