FROM openjdk:17
COPY target/short-links.jar short-links.jar
ENTRYPOINT ["java","-jar","/short-links.jar"]