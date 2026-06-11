FROM maven:3.9.11-eclipse-temurin-17 AS build

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

FROM tomcat:9.0-jdk17

RUN rm -rf /usr/local/tomcat/webapps/*

COPY --from=build /app/target/ecommerce.war \
                  /usr/local/tomcat/webapps/ecommerce.war

EXPOSE 8080

CMD ["catalina.sh", "run"]