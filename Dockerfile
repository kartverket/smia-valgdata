FROM eclipse-temurin:24-jdk-alpine@sha256:d729416b123cd50d4a70122328ae17d38adced6fa767062d0c0f134e5843deab


RUN addgroup -S appgroup && adduser -S appuser -G appgroup

WORKDIR /app

COPY build/libs/*.jar app.jar

EXPOSE 8080

RUN chown -R appuser:appgroup /app

USER appuser

ENTRYPOINT ["java", "-jar", "app.jar"]

