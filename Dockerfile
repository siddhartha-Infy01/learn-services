FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD target/learn-services-0.0.1-SNAPSHOT.jar app.jar
RUN chown -R root:root /app.jar && chmod -R g+rw /app.jar
ENTRYPOINT exec java  -jar /app.jar