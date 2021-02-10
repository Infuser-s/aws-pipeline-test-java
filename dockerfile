From tomcat:8

# Maintainer
MAINTAINER "vijaybirru" 

# copy war file on to container 
COPY ./target/*.jar /usr/local/tomcat/webapps
