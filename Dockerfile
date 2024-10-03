FROM openjdk:11-alpine
ENTRYPOINT ["/usr/bin/Spring.sh"]

COPY Spring.sh /usr/bin/Spring.sh
COPY target/Spring.jar /usr/share/Spring/Spring.jar
