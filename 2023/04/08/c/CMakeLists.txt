# C project to run the "ransom note" program.
# Author: Andrew Jarombek
# Date: 4/8/2023

cmake_minimum_required(VERSION 3.9)
project(c C)

set(CMAKE_C_STANDARD 17)

add_executable(c canConstruct.c)