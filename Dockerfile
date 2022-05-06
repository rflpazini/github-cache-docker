FROM eclipse-temurin:17-jre
WORKDIR /opt/app

EXPOSE 8080

COPY build/libs/*-all.jar demo.jar

ENTRYPOINT exec java -jar /opt/app/demo.jar