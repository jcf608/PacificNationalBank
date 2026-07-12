FROM icr.io/appcafe/websphere-liberty:24.0.0.3-full-java17-openj9

LABEL maintainer="PNB DevOps <devops@pacificnationalbank.com>"

COPY --chown=1001:0 src/main/liberty/config/server.xml /config/

RUN configure.sh
