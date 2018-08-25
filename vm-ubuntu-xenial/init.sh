#!/bin/bash

# installa java

# sudo apt-get install -y python-software-properties debconf-utils
# sudo add-apt-repository -y ppa:webupd8team/java
# sudo apt-get update
# sudo apt-get install -y oracle-java8-installer

# install node

curl -sL https://deb.nodesource.com/setup_10.x | sudo -E bash -
sudo apt-get install -y nodejs

# Install yarn

curl -sS https://dl.yarnpkg.com/debian/pubkey.gpg | sudo apt-key add -
echo "deb https://dl.yarnpkg.com/debian/ stable main" | sudo tee /etc/apt/sources.list.d/yarn.list
sudo apt-get update && sudo apt-get install yarn
echo 'export PATH=$PATH:"/home/ubuntu/.yarn/bin"' >> /home/ubuntu/.bashrc

source /home/ubuntu/.bashrc
yarn global add yo
yarn global add generator-jhipster


