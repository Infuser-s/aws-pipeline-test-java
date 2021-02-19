From openjdk:8

# Maintainer
MAINTAINER "vijaybirru" 

# copy war file on to container 
COPY target/*.jar *.jar
CMD ["java","-jar","*.jar"]
