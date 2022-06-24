FROM openjdk:17

ENV ENVIRONMENT=prod

ADD backend/target/spring-boot-react-bundle-backend-0.0.1-SNAPSHOT.jar app.jar

CMD [ "sh", "-c", "java -jar /app.jar" ]