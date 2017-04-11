#!/bin/bash

printf "\n" >> /home/vagrant/.bashrc
echo 'export PS1="\[\e[01;34m\]server2\[\e[0m\]\[\e[01;37m\]:\w\[\e[0m\]\[\e[00;37m\]\n\\$ \[\e[0m\]"' >> /home/vagrant/.bashrc
printf "\n" >> /home/vagrant/.bashrc

sudo yum clean all
sudo yum -y update
yum repolist
sudo yum -y install epel-release
sudo yum -y install htop



sudo yum -y install https://centos7.iuscommunity.org/ius-release.rpm
sudo yum -y install python35u python35u-pip
sudo pip3.5 install flask



## 
