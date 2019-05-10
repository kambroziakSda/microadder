FROM jboss/wildfly:10.0.0.Final

ADD ./target/microadder.war /opt/jboss/wildfly/standalone/deployments/
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0"]
