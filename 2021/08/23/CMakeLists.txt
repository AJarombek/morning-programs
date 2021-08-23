# C project to run the power of four program.
# Author: Andrew Jarombek
# Date: 8/23/2021

cmake_minimum_required(VERSION 3.9)
project(c C)

set(CMAKE_C_STANDARD 99)

add_executable(c powerOfFour.c)