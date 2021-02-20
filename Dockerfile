FROM java
ADD ./target/aws-pipeline-0.0.1-SNAPSHOT.jar /aws-pipeline-0.0.1-SNAPSHOT.jar
ADD ./run.sh /run.sh
RUN chmod a+x /run.sh
CMD /run.sh
