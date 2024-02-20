FROM openjdk:8-jdk-alpine
WORKDIR /opt/app

ARG WAR_FILE=target/spring-boot-web.war
EXPOSE 9000
# cp spring-boot-web.jar /opt/app/app.jar
COPY ${WAR_FILE} app.war

# java -jar /opt/app/app.war
ENTRYPOINT ["java","-jar","app.war"]


