#!/bin/bash
sed "s/tagVersion/$1/g" pods.yml > spring-boot-app-pod.yml
