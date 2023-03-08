from openjdk:8
expose 8080
ADD target/javaspringapp-naveen.jar javaspringapp-naveen.jar
ENTRYPOINT ["java","-jar","/javaspringapp-naveen.jar"]
