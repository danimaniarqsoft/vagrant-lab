#!/bin/bash

printf "\n" >> /home/vagrant/.bashrc
echo 'export PS1="\[\e[01;34m\]\u\[\e[0m\]\[\e[01;37m\]:\H:\w\[\e[0m\]\[\e[00;37m\]\n\\$ \[\e[0m\]"' >> /home/vagrant/.bashrc
printf "\n" >> /home/vagrant/.bashrc

# Actualización SO

sudo yum clean all
sudo yum -y update


# Instalación Java

curl -L -b "oraclelicense=a" http://download.oracle.com/otn-pub/java/jdk/8u111-b14/jdk-8u111-linux-x64.tar.gz -O

sudo mkdir /usr/java

sudo tar zxf jdk-8u111-linux-x64.tar.gz -C /usr/java
sudo ln -s /usr/java/jdk1.8.0_111 /usr/java/jdk8
sudo ln -s /usr/java/jdk8 /usr/java/current

sudo update-alternatives --install /usr/bin/java java /usr/java/jdk8/bin/java 2000 \
  --slave /usr/bin/jar jar /usr/java/jdk8/bin/jar \
  --slave /usr/bin/javac javac /usr/java/jdk8/bin/javac \
  --slave /usr/bin/javaws javaws /usr/java/jdk8/bin/javaws \
  --slave /usr/bin/unpack200 unpack200 /usr/java/jdk8/bin/unpack200 \
  --slave /usr/bin/orbd orbd /usr/java/jdk8/bin/orbd \
  --slave /usr/bin/rmid rmid /usr/java/jdk8/bin/rmid \
  --slave /usr/bin/rmiregistry rmiregistry /usr/java/jdk8/bin/rmiregistry \
  --slave /usr/bin/servertool servertool /usr/java/jdk8/bin/servertool \
  --slave /usr/bin/policytool policytool /usr/java/jdk8/bin/policytool \
  --slave /usr/bin/pack200 pack200 /usr/java/jdk8/bin/pack200 \
  --slave /usr/bin/java_vm java_vm /usr/java/jdk8/jre/bin/java_vm \
  --slave /usr/bin/jcontrol jcontrol /usr/java/jdk8/bin/jcontrol \
  --slave /usr/bin/tnameserv tnameserv /usr/java/jdk8/bin/tnameserv \
  --slave /usr/bin/keytool keytool /usr/java/jdk8/bin/keytool

sudo update-alternatives --set java /usr/java/jdk8/bin/java

sudo echo -e "JAVA_HOME=/usr/java/current\nPLUGIN_HOME=$JAVA_HOME/jre/plugin\n\nexport JAVA_HOME PLUGIN_HOME" >> /etc/profile.d/java.sh
sudo ln -s /etc/profile.d/java.sh /etc/profile.d/java.csh

rm jdk-8u111-linux-x64.tar.gz

# Instalación de Tomcat 8

curl http://www-us.apache.org/dist/tomcat/tomcat-8/v8.0.39/bin/apache-tomcat-8.0.39.tar.gz > apache-tomcat-8.0.39.tar.gz

sudo mkdir /usr/local/tomcat
sudo tar zxf apache-tomcat-8.0.39.tar.gz -C /usr/local/tomcat
sudo ln -s /usr/local/tomcat/apache-tomcat-8.0.39 /usr/local/tomcat/current
cd /usr/local/tomcat/current/webapps
sudo rm -rf docs examples ROOT
sudo rm -f /usr/local/tomcat/current/bin/*.bat

sudo useradd -r -d /usr/local/tomcat/current tomcat
sudo chown -R tomcat:tomcat /usr/local/tomcat/apache-tomcat-*

## Aquí se debe crear el archivo tomcat.service y copiar en /usr/lib/systemd/system/

sudo cp /vagrant/tomcat.service /user/lib/systemd/system 
sudo systemctl daemon-reload
sudo systemctl enable tomcat

sudo systemctl start tomcat
sudo systemctl -l status tomcat


# Instalación Apache

sudo yum -y install httpd
sudo systemctl start firewalld.service

## Configuración Firewall

sudo firewall-cmd --permanent --add-port=80/tcp
sudo firewall-cmd --permanent --add-port=443/tcp
sudo firewall-cmd --zone=public --add-port=8080/tcp --permanent
sudo firewall-cmd --reload

## Habilitar Apache

sudo systemctl start httpd
sudo systemctl enable httpd
