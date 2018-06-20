FROM ubuntu:18.04
MAINTAINER Mariusz Adamowicz

RUN apt-get install -qq sudo wget unzip git oracle-java8-installer

ARG INTELLIJ_LINK="https://download.jetbrains.com/idea/ideaIC-2018.1.5.tar.gz"
RUN mkdir -p /opt/intellij

ADD $INTELLIJ_LINK /tmp/intellij.tar.gz

RUN echo 'Installing intellij' && \
    tar -xzf /tmp/intellij.tar.gz --strip-components=1 -C /opt/intellij && \
    rm /tmp/intellij.tar.gz

#    tar -xzf /tmp/intellij.tar.gz --strip-components=1 -C /opt/intellij && \
#    tar -xzf idea-2018.1.5.tar.gz

#CMD /opt/intellij/bin/idea.sh
#CMD echo $HOSTNAME

