#!/bin/sh
mvn clean package && docker build -t dev.ui/jsfimpl .
docker rm -f jsfimpl || true && docker run -d -p 8080:8080 -p 4848:4848 --name jsfimpl dev.ui/jsfimpl 
