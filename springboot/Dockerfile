FROM eclipse-temurin:21.0.4_7-jdk-alpine

RUN mkdir /opt/app
COPY ./build/libs/springboot-*.jar /opt/app/springboot.jar
CMD java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005 -jar /opt/app/springboot.jar
