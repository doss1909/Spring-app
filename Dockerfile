FROM openjdk:17

COPY target/spring-app.jar /usr/app/Spring-app.jar

WORKDIR /usr/app

EXPOSE 8080

ENTRYPOINT [ "java","-jar","Spring-app.jar" ]