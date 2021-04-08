# Data Structures and Algorithms

See [setup instructions](https://codefellows.github.io/setup-guide/code-301/3-code-challenges), in the Code 301 Setup Guide.

## Repository Quick Tour and Usage

### 301 Code Challenges

Under the `data-structures-and-algorithms` repository, at the top level is a folder called `code-challenges`

Each day, you'll add one new file to this folder to do your work for the day's assigned code challenge

# 401 Data Structures, Code Challenges

## Reverse an Array

### Challenge

Reverse the order of a given array

### Approach & Efficiency

Created a function that returns the array in reverse order. This returned statement is then printed.

### Solution

[Code Challenge 1 WhiteBoard](assets/code_challenge_1.PNG)

## Array Shift

### Challenge Description

Add a given value to the middle index of an array

### Approach & Efficiency

Created a function that uses a for loop to loop through the array and insert a value at the middle index of the array.

### Solution

[Code Challenge 2 WhiteBoard](assets/code_challenge_2.PNG)

## Binary Serarch

### Challenge Description

Search for a value in an array and return its index

### Approach & Efficiency

Using binary search, the process of finding a value within an array becomes much easier. If the value at the middle index of array is equal to the given value then return the index. If the value at the middle index is greater than or less than the value then call the function with the appropriate parameters.

### Solution

[Code Challenge 3 WhiteBoard](assets/code_challenge_3.PNG)

# Singly Linked List
A linked list that goes in one direction

## Challenge
Create a linked list from scratch

## Approach & Efficiency
Create two classes, one for linked list and the other for node. Each time a user inserts a value into the list, make that value the new head of the list and set the next value to be the previous head value.
## API

Insert function

If the head is null, it will make the head and current values of the list equal to the given value. Otherwise, it will make the current value equal to the head value and then change the value of the head to be the value given. It will also set the next node to be the previous head node.

Includes function

Checks if a given value is included in the list by iterating over the list using a while function. If the current value is not null, it evaluates the value and then makes the current value equal to the next value.

GetFirstValue function

Returns the first value or the head value

GetValues function

Returns an array of all the values in the list

