#!/bin/bash
set -e
ant 
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file  -Dfile=gaeimg.jar \
                                                                              -DgroupId=gea \
                                                                              -DartifactId=imaging \
                                                                              -Dversion=1.0-SNAPSHOT \
                                                                              -Dpackaging=jar 
