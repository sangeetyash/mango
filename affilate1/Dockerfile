FROM ubuntu:18.04

USER root
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk
RUN apt-get install -y maven
RUN apt-get install -y wget
RUN apt-get install -y unzip
RUN apt-get update && apt-get install -y gnupg2
RUN apt-get install ca-certificates
RUN apt-get install libglib2.0.0

# ChromeDriver
ARG CHROME_DRIVER_VERSION=80.0.3987.106
RUN wget -q -O /tmp/chromedriver.zip https://chromedriver.storage.googleapis.com/$CHROME_DRIVER_VERSION/chromedriver_linux64.zip \
	&& unzip /tmp/chromedriver.zip -d /opt \
	&& rm /tmp/chromedriver.zip \
	&& mv /opt/chromedriver /opt/chromedriver-$CHROME_DRIVER_VERSION \
	&& chmod 755 /opt/chromedriver-$CHROME_DRIVER_VERSION \
	&& ln -s /opt/chromedriver-$CHROME_DRIVER_VERSION /usr/bin/chromedriver


# Google Chrome
RUN wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
RUN dpkg -i google-chrome-stable_current_amd64.deb; apt-get -fy install

# To create a Chrme driver image with JDK + Maven
#docker build  -t cd_cucmber .