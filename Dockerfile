FROM openjdk:11
COPY target/short-links.jar short-links.jar
ENTRYPOINT ["java","-jar","/short-links.jar"]