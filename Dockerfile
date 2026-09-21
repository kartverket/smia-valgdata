FROM dhi.io/eclipse-temurin:26-alpine3.23@sha256:86f11ff533f5481cac607f2ec67474806c7d6e00ae87d6ed0b121ecccfb3ee39

EXPOSE 8080
USER nonroot
COPY --chown=nonroot:nonroot build/libs/*.jar /app.jar

ENTRYPOINT ["java", "-XX:MaxRAMPercentage=70.0", "-Duser.timezone=Europe/Oslo", "-jar", "/app.jar"]

