#!/bin/bash
# Actualización SO

sudo yum clean all
sudo yum -y update


curl -L -b "oraclelicense=a" http://download.oracle.com/otn-pub/java/jdk/8u111-b14/jdk-8u111-linux-x64.rpm -O
sudo yum localinstall jdk-8u111-linux-x64.rpm
rm jdk-8u111-linux-x64.rpm

# Crear archivo /etc/profile.d/java.sh
echo -e "JAVA_HOME=/usr/java/latest\nPLUGIN_HOME=$JAVA_HOME/jre/plugin\n\nexport JAVA_HOME PLUGIN_HOME" >> sudo /etc/profile.d/java.sh

# Crear liga java.csh
sudo ln -s /etc/profile.d/java.sh /etc/profile.d/java.csh	


## TOMCAT INSTALL

### Crear el usuario tomcat
sudo groupadd tomcat
sudo useradd -M -s /bin/nologin -g tomcat -d /opt/tomcat tomcat

### Descargar TOMCAT y crear archivo /opt/tomcat
curl http://www-eu.apache.org/dist/tomcat/tomcat-8/v8.0.39/bin/apache-tomcat-8.0.39.tar.gz > apache-tomcat-8.0.39.tar.gz
sudo mkdir /opt/tomcat
sudo tar xvf apache-tomcat-8*tar.gz -C /opt/tomcat --strip-components=1

### Actualizar permisos

cd /opt/tomcat
sudo chgrp -R tomcat conf
sudo chmod g+rwx conf
sudo chmod g+r conf/*
sudo chown -R tomcat webapps/ work/ temp/ logs/

### Crear el archivo tomcat.service
sudo vi /etc/systemd/system/tomcat.service
sudo systemctl daemon-reload
sudo systemctl start tomcat
sudo systemctl enable tomcat

### Configurar Web Management Interface
sudo vi /opt/tomcat/conf/tomcat-users.xml

sudo firewall-cmd --permanent --add-port=80/tcp
sudo firewall-cmd --permanent --add-port=443/tcp
sudo firewall-cmd --zone=public --add-port=8080/tcp --permanent
sudo firewall-cmd --reload
