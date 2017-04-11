#!/bin/bash

printf "\n" >> /home/vagrant/.bashrc
echo 'export PS1="\[\e[01;34m\]proxy\[\e[0m\]\[\e[01;37m\]:\w\[\e[0m\]\[\e[00;37m\]\n\\$ \[\e[0m\]"' >> /home/vagrant/.bashrc
printf "\n" >> /home/vagrant/.bashrc

sudo yum clean all
sudo yum -y update
sudo yum -y install epel-release

# Install Nginx

# sudo yum -y install nginx
# sudo systemctl start nginx
# sudo systemctl enable nginx

## Monitoring Tools

## process - htop

sudo yum -y install htop

## Lightweight - Monitoring

sudo yum -y install monitorix

## Monitor Linux Disk I/O

sudo yum -y install iotop

## Bandwidth

sudo yum -y install nethogs

## Install glances

sudo yum -y install glances


