# C project to run the plus_one program.
# Author: Andrew Jarombek
# Date: 1/24/2022

cmake_minimum_required(VERSION 3.9)
project(c C)

set(CMAKE_C_STANDARD 99)

add_executable(c plus_one.c)