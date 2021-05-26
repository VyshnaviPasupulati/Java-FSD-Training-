FROM openjdk:8
ARG JAR_FILE=target/boot-hello-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} boot-hello-0.0.1-SNAPSHOT.jar
EXPOSE 8780
ENTRYPOINT ["java","-jar","/boot-hello-0.0.1-SNAPSHOT.jar"]