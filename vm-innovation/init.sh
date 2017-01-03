#!/bin/bash

printf "\n" >> /home/vagrant/.bashrc
echo 'export PS1="\[\e[01;34m\]\u\[\e[0m\]\[\e[01;37m\]:\H:\w\[\e[0m\]\[\e[00;37m\]\n\\$ \[\e[0m\]"' >> /home/vagrant/.bashrc
printf "\n" >> /home/vagrant/.bashrc

# Actualización SO

sudo yum clean all
sudo yum -y update


#curl -L -b "oraclelicense=a" http://download.oracle.com/otn-pub/java/jdk/8u111-b14/jdk-8u111-linux-x64.rpm -O
#sudo yum localinstall jdk-8u111-linux-x64.rpm
#rm jdk-8u111-linux-x64.rpm

#echo -e "JAVA_HOME=/usr/java/latest\nPLUGIN_HOME=$JAVA_HOME/jre/plugin\n\nexport JAVA_HOME PLUGIN_HOME" >> sudo /etc/profile.d/java.sh
#sudo ln -s /etc/profile.d/java.sh /etc/profile.d/java.csh
