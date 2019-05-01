FROM openjdk:8
#ADD target/docker1-spring-boot docker1-spring-boot.jar
COPY target/docker1-spring-boot.jar .
EXPOSE 8085
#ENTRYPOINT ["java" "-jar", "docker1-spring-boot.jar"]
CMD exec java -jar "docker1-spring-boot.jar"