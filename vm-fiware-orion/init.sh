#!/bin/bash

printf "\n" >> /home/vagrant/.bashrc
echo 'export PS1="\[\e[01;34m\]\u\[\e[0m\]\[\e[01;37m\]:\H:\w\[\e[0m\]\[\e[00;37m\]\n\\$ \[\e[0m\]"' >> /home/vagrant/.bashrc
printf "\n" >> /home/vagrant/.bashrc


# install dockers

sudo yum -y check-update

sudo yum -y install vim

sudo systemctl start firewalld.service
sudo systemctl enable firewalld.service

curl -fsSL https://get.docker.com/ | sh

sudo systemctl start docker
sudo systemctl status docker
sudo systemctl enable docker
sudo usermod -aG docker vagrant

# install dockers-composed

sudo yum install -y epel-release
sudo yum install -y python-pip
sudo pip install --upgrade pip
sudo pip install backports.ssl_match_hostname --upgrade
sudo pip install docker-compose
sudo yum -y upgrade python*

