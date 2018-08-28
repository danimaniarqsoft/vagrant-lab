#!/bin/bash

# installa java

# sudo apt-get install -y python-software-properties debconf-utils
# sudo add-apt-repository -y ppa:webupd8team/java
# sudo apt-get update
# sudo apt-get install -y oracle-java8-installer

# Install Java

sudo apt-get install -y python-software-properties debconf-utils
sudo add-apt-repository -y ppa:webupd8team/java
sudo apt-get update
echo "oracle-java8-installer shared/accepted-oracle-license-v1-1 select true" | sudo debconf-set-selections
sudo apt-get install -y oracle-java8-installer

# install node

# curl -sL https://deb.nodesource.com/setup_10.x | sudo -E bash -
curl -sL https://deb.nodesource.com/setup_8.x | sudo -E bash -
sudo apt-get install -y nodejs

# Install yarn

curl -sS https://dl.yarnpkg.com/debian/pubkey.gpg | sudo apt-key add -
echo "deb https://dl.yarnpkg.com/debian/ stable main" | sudo tee /etc/apt/sources.list.d/yarn.list
sudo apt-get update && sudo apt-get install yarn
echo 'export PATH=$PATH:"/home/ubuntu/.yarn/bin":"/home/ubuntu/consult"' >> /home/ubuntu/.bashrc

source /home/ubuntu/.bashrc
yarn global add yo
yarn global add generator-jhipster

# Install Docker

#sudo apt-get install --no-install-recommends apt-transport-https curl software-properties-common
#curl -fsSL 'https://sks-keyservers.net/pks/lookup?op=get&search=0xee6d536cf7dc86e2d7d56f59a178ac6c6238f52e' | sudo apt-key add -
#sudo add-apt-repository "deb https://packages.docker.com/1.12/apt/repo/ ubuntu-$(lsb_release -cs) main"
#sudo apt-get update
#sudo apt-get -y install docker-engine
#sudo usermod -a -G docker $USER
## Install Docker Compose

#sudo curl -L https://github.com/docker/compose/releases/download/1.22.0/docker-compose-$(uname -s)-$(uname -m) -o /usr/local/bin/docker-compose
#sudo chmod +x /usr/local/bin/docker-compose

# Install Mongodb

# sudo apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 9DA31620334BD75D9DCB49F368818C72E52529D4
# echo "deb [ arch=amd64,arm64 ] https://repo.mongodb.org/apt/ubuntu xenial/mongodb-org/4.0 multiverse" | sudo tee /etc/apt/sources.list.d/mongodb-org-4.0.list
# sudo apt-get update
# sudo apt-get install -y mongodb-org

# Tools

sudo apt install unzip

# Download consul
mkdir consult
curl https://releases.hashicorp.com/consul/1.2.2/consul_1.2.2_linux_amd64.zip > consult/consult.zip
