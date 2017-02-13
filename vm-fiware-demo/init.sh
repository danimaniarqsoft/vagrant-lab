#!/bin/bash

printf "\n" >> /home/vagrant/.bashrc
echo 'export PS1="\[\e[01;34m\]demo-app\[\e[0m\]\[\e[01;37m\]:\w\[\e[0m\]\[\e[00;37m\]\n\\$ \[\e[0m\]"' >> /home/vagrant/.bashrc
printf "\n" >> /home/vagrant/.bashrc

# install dockers

sudo yum -y check-update
sudo yum -y install vim
curl -fsSL https://get.docker.com/ | sh
curl https://gist.githubusercontent.com/danimaniarqsoft/177b6c8cb579f0cac87b8d13d74e886c/raw/4429ce1de0f17e9e434d2b2f9b8ed14dba1f88a6/docker-compose-demo-app.yml > docker-compose.yml
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

