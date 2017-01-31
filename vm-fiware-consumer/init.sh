#!/bin/bash

printf "\n" >> /home/vagrant/.bashrc
echo 'export PS1="\[\e[01;34m\]\u\[\e[0m\]\[\e[01;37m\]:\H:\w\[\e[0m\]\[\e[00;37m\]\n\\$ \[\e[0m\]"' >> /home/vagrant/.bashrc
printf "\n" >> /home/vagrant/.bashrc


#  install the consumer server

sudo yum install -y epel-release
sudo yum install -y python-pip
sudo pip install --upgrade pip
sudo pip install backports.ssl_match_hostname --upgrade
sudo pip install flask
sudo yum -y upgrade python*
curl https://raw.githubusercontent.com/telefonicaid/fiware-orion/master/scripts/accumulator-server.py > accumulator-server.py
sudo chmod a+x accumulator-server.py
sudo systemctl start firewalld.service
sudo firewall-cmd --permanent --add-port=1028/tcp
sudo firewall-cmd --reload

# execute the next command
# ./accumulator-server.py --port 1028 --url /accumulate --host 192.168.83.3 --pretty-print -v

