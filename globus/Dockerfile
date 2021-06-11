FROM registry.gitlab.com/armdev/dockers/openjdk15

COPY target/globus.jar /opt/globus.jar
ENTRYPOINT ["java", "-jar","/opt/globus.jar"]

EXPOSE 9098



