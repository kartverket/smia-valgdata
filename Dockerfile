FROM eclipse-temurin:25-jdk-alpine@sha256:0c4c6300cc86efdf6454702336a0d60352e227f3a862e8ae9861f393f8f1ede9


RUN addgroup -S appgroup && adduser -S appuser -G appgroup

WORKDIR /app

COPY build/libs/*.jar app.jar

EXPOSE 8080

RUN chown -R appuser:appgroup /app

USER appuser

ENTRYPOINT ["java", "-jar", "app.jar"]

