#!/bin/bash
PROJECTS=" kangaroo golden configuration-service eureka-server zuul-api-gateway"
WORKING_DIR=$PWD
for PRO in $PROJECTS; do
	cd $PRO
	echo "Building $PRO"
	sleep 1
	mvn -DskipTests clean package
	cd $WORKING_DIR
done

