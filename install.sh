#!/bin/bash
tcpid=`jps|grep 'Bootstrap'|awk '{print $1}'` 
if [ $tcpid ]
then
	echo "killing pid = $tcpid"
	`kill -9 $tcpid`
else
	echo "no such pid"
fi

result=`mvn clean install |grep 'Building war'|awk '{print $4}'`
if [ $result ]
then
    rm -rf ~/web/apache-tomcat-7.0.53/webapps/mapi*
    `cp $result ~/web/apache-tomcat-7.0.53/webapps/mapi.war`
    startup.sh
else
    echo "build fail"
    mvn clean install
fi