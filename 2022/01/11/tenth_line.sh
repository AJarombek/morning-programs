#!/usr/bin/env bash

# https://leetcode.com/problems/tenth-line/
# Author: Andrew Jarombek
# Date: 1/11/2021

count=1
while read line; do
    if [ $count = 10 ]; then
        echo $line
        break
    fi

    let "count = count + 1"
done < file.txt