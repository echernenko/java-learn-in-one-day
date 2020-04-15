FROM tomcat:8.0
MAINTAINER Eugene Chernenko <chernenko@gmail.com>
EXPOSE 8080
RUN rm -fr /usr/local/tomcat/webapps/ROOT
COPY target/Alias-1.0-SNAPSHOT /usr/local/tomcat/webapps/ROOT
