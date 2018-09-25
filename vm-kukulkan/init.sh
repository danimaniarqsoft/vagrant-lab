#!/bin/bash

printf "\n" >> /home/vagrant/.bashrc
echo 'export PS1="\[\e[01;34m\]kukulkan\[\e[0m\]\[\e[01;37m\]:\w\[\e[0m\]\[\e[00;37m\]\n\\$ \[\e[0m\]"' >> /home/vagrant/.bashrc
printf "\n" >> /home/vagrant/.bashrc

sudo yum clean all
sudo yum -y update

#Downloading configuration files for java, maven

curl https://gist.githubusercontent.com/danimaniarqsoft/177b6c8cb579f0cac87b8d13d74e886c/raw/619c9e672496cddab49e92f44765a295b488ffb0/maven.sh > maven.sh
curl https://gist.githubusercontent.com/danimaniarqsoft/177b6c8cb579f0cac87b8d13d74e886c/raw/619c9e672496cddab49e92f44765a295b488ffb0/java.sh > java.sh


sudo mv maven.sh /etc/profile.d/
sudo mv java.sh /etc/profile.d/

yum repolist

## Install Java 8
curl -L -b "oraclelicense=a" http://download.oracle.com/otn-pub/java/jdk/8u111-b14/jdk-8u111-linux-x64.rpm -O
sudo yum -y localinstall jdk-8u111-linux-x64.rpm

### Crear liga java.csh
sudo ln -s /etc/profile.d/java.sh /etc/profile.d/java.csh

## Install Maven
curl http://www-us.apache.org/dist/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.tar.gz > apache-maven-3.3.9-bin.tar.gz
sudo mv apache-maven-3.3.9-bin.tar.gz /opt
sudo tar xzf /opt/apache-maven-3.3.9-bin.tar.gz -C /opt
sudo ln -s /opt/apache-maven-3.3.9 /opt/maven

source /etc/profile.d/maven.sh
source /etc/profile.d/java.sh
source /etc/profile.d/java.csh

## Install Git
#sudo yum -y install git

# Install NGINX
#sudo yum -y install epel-release
#sudo yum -y install nginx
#sudo systemctl start nginx

# Firawall Configuration

#sudo firewall-cmd --permanent --zone=public --add-service=http 
#sudo firewall-cmd --permanent --zone=public --add-service=https
#sudo firewall-cmd --reload

# Install DOcker 

sudo yum -y check-update
curl -fsSL https://get.docker.com/ | sh
curl sudo systemctl enable docker
sudo systemctl start docker
sudo usermod -aG docker vagrant

# Install DOcker compose

sudo yum install -y epel-release
sudo yum install -y python-pip
sudo pip install --upgrade pip
sudo pip install backports.ssl_match_hostname --upgrade
sudo pip install docker-compose
sudo yum -y upgrade python*

# Tools

## htop

#sudo yum -y install htop

## 
