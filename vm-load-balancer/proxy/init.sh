#!/bin/bash

printf "\n" >> /home/vagrant/.bashrc
echo 'export PS1="\[\e[01;34m\]proxy\[\e[0m\]\[\e[01;37m\]:\w\[\e[0m\]\[\e[00;37m\]\n\\$ \[\e[0m\]"' >> /home/vagrant/.bashrc
printf "\n" >> /home/vagrant/.bashrc

sudo yum clean all
sudo yum -y update

yum repolist

# Install Apache Server
sudo yum -y install httpd
sudo curl -o /etc/httpd/conf.d/default-site.conf https://gist.githubusercontent.com/danimaniarqsoft/177b6c8cb579f0cac87b8d13d74e886c/raw/269fd25d6049adeecc63cb47f837eabb367fc01d/default-site.conf
sudo systemctl start httpd.service
sudo systemctl enable httpd.service

## htop

sudo yum -y install epel-release
sudo yum -y install htop

