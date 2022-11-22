# Make the C++ project to run the "Binary Tree Preorder Traversal" program.
# Author: Andrew Jarombek
# Date: 11/21/2022

cmake_minimum_required(VERSION 3.9)
project(cpp)

set(CMAKE_CXX_STANDARD 17)

add_executable(
    cpp
    binaryTreePreorderTraversal.cpp
    binaryTreePostorderTraversal.cpp
    main.cpp
    treeNode.h
    binaryTreePreorderTraversal.h
    binaryTreePostorderTraversal.h
)