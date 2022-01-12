#!/usr/bin/env bash

# https://leetcode.com/problems/valid-phone-numbers/
# Author: Andrew Jarombek
# Date: 1/11/2021

# One Liner
while read line; do [[ $line =~ (^\([0-9]{3}\) [0-9]{3}-[0-9]{4}$|^[0-9]{3}-[0-9]{3}-[0-9]{4}$) ]] && echo $BASH_REMATCH; done < file.txt

# Multiline Equivalent
while read line; do
    if [[ $line =~ (^\([0-9]{3}\) [0-9]{3}-[0-9]{4}$|^[0-9]{3}-[0-9]{3}-[0-9]{4}$) ]]
    then
      echo $BASH_REMATCH
    fi
done < file.txt