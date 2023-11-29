FROM maven:3.9-amazoncorretto-17 as builder

LABEL "Maintainer"="Mathias Dollenbacher <hello@mdollenbacher.net>"
WORKDIR /usr/app/src

COPY . .

RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-alpine

WORKDIR /app

COPY --from=builder /usr/app/src/core/target/student-application-0.0.1-SNAPSHOT.jar /app/service.jar

CMD java -jar /app/service.jar
