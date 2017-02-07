#!/bin/bash

printf "\n" >> /home/vagrant/.bashrc
echo 'export PS1="\[\e[01;34m\]\u\[\e[0m\]\[\e[01;37m\]:\H:\w\[\e[0m\]\[\e[00;37m\]\n\\$ \[\e[0m\]"' >> /home/vagrant/.bashrc
printf "\n" >> /home/vagrant/.bashrc

sudo mv maven.sh /etc/profile.d/maven.sh

#  install the consumer server



## Install Java 8
curl -L -b "oraclelicense=a" http://download.oracle.com/otn-pub/java/jdk/8u111-b14/jdk-8u111-linux-x64.rpm -O
sudo yum localinstall jdk-8u111-linux-x64.rpm
rm jdk-8u111-linux-x64.rpm

### Crear archivo /etc/profile.d/java.sh
echo -e "JAVA_HOME=/usr/java/latest\nPLUGIN_HOME=$JAVA_HOME/jre/plugin\n\nexport JAVA_HOME PLUGIN_HOME" >> sudo /etc/profile.d/java.sh

### Crear liga java.csh
sudo ln -s /etc/profile.d/java.sh /etc/profile.d/java.csh

## Install Maven

curl http://www-us.apache.org/dist/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.tar.gz > apache-maven-3.3.9-bin.tar.gz

sudo mv apache-maven-3.3.9-bin.tar.gz /opt


sudo tar xzf /opt/apache-maven-3.3.9-bin.tar.gz -C /opt
sudo ln -s /opt/apache-maven-3.3.9 /opt/maven

source /etc/profile.d/maven.sh


## Install Git

