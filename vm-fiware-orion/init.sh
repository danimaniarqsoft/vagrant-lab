#!/bin/bash

printf "\n" >> /home/vagrant/.bashrc
echo 'export PS1="\[\e[01;34m\]orion-context-broker\[\e[0m\]\[\e[01;37m\]:\w\[\e[0m\]\[\e[00;37m\]\n\\$ \[\e[0m\]"' >> /home/vagrant/.bashrc
printf "\n" >> /home/vagrant/.bashrc



# install dockers

sudo yum -y check-update
sudo yum -y install vim
sudo yum -y install emacs-nox git nmap net-tools
curl -fsSL https://get.docker.com/ | sh
curl https://gist.githubusercontent.com/danimaniarqsoft/177b6c8cb579f0cac87b8d13d74e886c/raw/cdbdd584defb996b570ec068388405ec2f017741/docker-compose.yml > docker-compose.yml
sudo systemctl enable docker
sudo systemctl start docker
sudo usermod -aG docker vagrant

# install dockers-composed

sudo yum install -y epel-release
sudo yum install -y python-pip
sudo pip install --upgrade pip
sudo pip install backports.ssl_match_hostname --upgrade
sudo pip install docker-compose
sudo yum -y upgrade python*

sudo yum clean all

# Por bug de vagrant se forza el inicio de la interface de red
[ $(ifconfig eth1 | grep inet | wc -l) = 0 ] && ifup eth1
sudo chmod +x /etc/rc.d/rc.local
sudo echo "[ $(ifconfig eth1 | grep inet | wc -l) = 0 ]" >> /etc/rc.d/rc.local
