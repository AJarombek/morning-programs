# C project to run the singleNumber program.
# Author: Andrew Jarombek
# Date: 2/16/2022

cmake_minimum_required(VERSION 3.9)
project(c C)

set(CMAKE_C_STANDARD 99)

add_executable(c singleNumber.c)