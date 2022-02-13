# Make the C++ project to run te Str Str program.
# Author: Andrew Jarombek
# Date: 2/13/2022

cmake_minimum_required(VERSION 3.9)
project(cpp)

set(CMAKE_CXX_STANDARD 17)

add_executable(cpp strStr.cpp searchInsertPosition.cpp searchInsertPosition.h maxSubArray.cpp maxSubArray.h lengthOfLastWord.cpp lengthOfLastWord.h)