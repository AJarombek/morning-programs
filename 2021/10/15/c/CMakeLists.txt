# C project to run the remove element program.
# Author: Andrew Jarombek
# Date: 10/15/2021

cmake_minimum_required(VERSION 3.9)
project(c C)

set(CMAKE_C_STANDARD 99)

add_executable(c remove_element.c)