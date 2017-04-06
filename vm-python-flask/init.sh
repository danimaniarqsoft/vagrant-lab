#!/bin/bash

printf "\n" >> /home/vagrant/.bashrc
echo 'export PS1="\[\e[01;34m\]python-lab\[\e[0m\]\[\e[01;37m\]:\w\[\e[0m\]\[\e[00;37m\]\n\\$ \[\e[0m\]"' >> /home/vagrant/.bashrc
printf "\n" >> /home/vagrant/.bashrc

sudo yum clean all
sudo yum -y update
sudo yum -y install epel-release

## Install PIP - Python

sudo yum install -y rpm-build
sudo yum install -y redhat-rpm-config
sudo yum install -y yum-utils
sudo yum groupinstall -y "Development Tools"
sudo yum-builddep -y python-2.7.11-4.fc24.src.rpm


curl "https://bootstrap.pypa.io/get-pip.py" -o "get-pip.py"
python get-pip.py
pip install virtualenv

## Install Git
sudo yum -y install git

sudo yum -y install httpd
sudo systemctl start httpd.service
sudo systemctl enable httpd.service

## Install Nginx

sudo yum -y install nginx
sudo systemctl start nginx
sudo systemctl enable nginx

# Tools

## htop

sudo yum -y install epel-release
sudo yum -y install htop
