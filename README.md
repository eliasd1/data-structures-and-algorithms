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

### Challenge (Code challenge 26)

Sort an array using insertion sort method

### Approach & Efficiency

- Loop through the array where i =1
- Define j which is equal to i -1
- Save value at index i to temp variable
- Check if temp is less than value at specific index previous to it 
- Check that j is positive
- Move value at j index by one index
- Subtract j with 1
- Repeat the above procedures until one of the conditions is false
- Add temp to index j+1

Time complexity -> O(N^2), nested loops
Space complexity -> O(1)

### Solution

- [Code Challenge 26 whiteboard](./assets/code_challenge_26_whiteboard.PNG)
- [Blog - Code Challenge 26](./blogs/code-challenge-26/BLOG-26.md)

## Quick Sort

A method that sorts a given array

### Challenge

Sort an array using the quick sort method

### Approach & Efficiency

Pick a pivot (last number in an array)and compare it with values at each index. Declare a variable called low that is equal to -1. If a value is less than the pivot value, increment low and replace that value with low +1.

### Solution
[Code Challenge 28 whiteboard](assets/code_challenge_28_whiteboard.PNG)

## Repeated Words

Find the first repeated word in a string

### Challenge

Find the repeated word without using any built-in functions

### Approach & Efficiency

First, create a linkedlist. Add a method that iterates over the given string and adds wordds to the linkedlist, and if a word already exists in the linkedlist, return the word.

### Challenge

Write a method that left joins two hashmap into a single data structure

### Approach & Efficiency

- Define a list
- Loop through each key in the left hashtable
- Create an inner list
- Save the key, the value, and if right has a value at the same key add that to the innerlist
- Return list
Time complexity - O(N) (Loop through every key in the left key (n) in the hashtable)
Space complexity - O(N) (the number of keys that exists in the hashtable)

### Challenge

Given a graph and a list of city names, check if a direct path flight is possible and if so return the total cost of the flight.

### Approach & Efficiency

- Define a method that traverses the graph
- Define a list
- Define a stack that will hold unvisited locations
- Keep track of locations visited
- If the location hasn't been visited, add it
to the list
- Loop through the list returned from the method and get the cost (or weight) between the nodes
- If a location has been visited, return false (meaning there's no direct path

Time complexity - O(N) (where n is the number of adjacent edges)
Space complexity - O(W) (all nodes that are stored in the stack)

### Solution

- [Code Challenge 37 whiteboard](./assets/code_challenge_37_whiteboard.PNG)

### Challenge

Use breadth first search to traverse a graph and check places visited

### Approach & Efficiency

- Define a list containing visited nodes
- Define another list that keeps track of
visited nodes
- Define a queue that queues node(s) at each 
level of the graph
- While queue is empty, dequeue and add the
dequeued node to the list if it hasn't been visited yet
- Return list

Time complexity - O(N) where n equals number of edges
Space complexity - O(N) number of edges saved in the queue

### Solution

- [Code Challenge 36 whiteboard](./assets/code_challenge_36_whiteboard.PNG)


### Challenge (Code challenge 32)

Define a method that finds an intersection between two trees.

### Approach & Efficiency

- Loop through one tree
- For each node, loop through the second tree
and find if it exists in the second tree
- If it does, add it to the list
- Return list

Time complexity -> O(N^2) code contains a nested loop
Space Complexity -> O(N)

### Solution

- [Code Challenge 32 whiteboard](./assets/code_challenge_32_whiteboard.PNG)

### Challenge (Code challenge 15)

Create a binary tree and define a method for each of the depth first traversals
Create a binary search tree

### Approach & Efficiency

- Define a list
- Basic structure of the traversal is having two recursions, one for the left node and the other for the right node
- Placing where to add a value to a list depends on the order
- Pre-order, add value at the beginning of the function
- In-order, add value inbetween root.left recursion and root.right recursion
- Post-order, add value at the end of the function
For binary search tree
- If the value is less than the root value, add it to the left node
- If the value is greater than the root value, add it to the right node
- If either a left node or right node exists, compare that value, it becomes the root node and is compared with the value
Time complexity -> O(N)
Space Complexity -> O(N)

### Solution

- [Code Challenge 15 whiteboard](./assets/code_challenge_15_whiteboard.PNG)

### Challenge (Code challenge 17)

Traverse through a tree using breadth first method

### Approach & Efficiency

- Define a list
- Define a queue
- Add root to queue
- Create a while loop that checks
if queue is empty
- Dequeue node
- Add it to list
- Add root.left and root.right to queue
- Repeat until queue is empty
- Return list
Time complexity -> O(N)
Space Complexity -> O(W)

### Solution

- [Code Challenge 17 whiteboard](./assets/code_challenge_17_whiteboard.PNG)

### Challenge (Code challenge 6)

- Append value to linkedlist
- Insert before a value in linkedlist
- Insert after a value in linkedlist

### Approach & Efficiency

Append value

- Loop through linkedlist until current.next is null
- Set current.next to equal appended value
Insert before
- Loop through linkedlist until current.next is equal to the target value
- Save current.next in a temp node
- Set current.next to be equal to the value given
- Set the new node.next to be equal to the temp node
Insert after
- Loop through linkedlist until current is equal to the target value
- Save current.next value in a temp node
- Set current.next to be equal to the value given
- Set the new node.next to be equal to the temp node

Time complexity -> O(N)
Space Complexity -> O(1)

### Solution

- [Code Challenge 6 whiteboard](./assets/code_challenge_6_Elias.PNG)

### Challenge (Code challenge 38)

Traverse a graph using pre-order depth first traversal

### Approach & Efficiency

- Define a list that will hold the nodes
- Define a list that will keep track of visited nodes
- Add root value to list
- Get root edges
- For each edge, repeat the previous function (add to list, and get edges)
- Return list

Time complexity -> O(N)
Space Complexity -> O(N)

### Solution

- [Code Challenge 38 whiteboard](./assets/code_challenge_38_whiteboard.PNG)

### Challenge (Code challenge 35)

Create a graph implementation

### Approach & Efficiency

AddNode
- Create list
- Add node to list if it list
doesn't contain node

Add Edge
- Set edge of the first node
to be the second node
- Node should have an edge variable
that is saved as a hashtable

GetNodes
- Return list

GetNeighbors
- Return edges of the node

GetSize
- Return size of list

Time complexity -> O(N)
GetNodes -> O(N)
GetNeighbors -> O(1)
Space complexity -> O(N)

### Solution

- [Code Challenge 35 whiteboard](./assets/code_challenge_35_whiteboard.PNG)

### Challenge (Code challenge 18)

Create a new tree that is filled with nodes from another tree, where each node is checked to see if it's divisible by 5 and 3 and depending on that the value could be "fizzbuzz" "fizz", or "buzz".

### Approach & Efficiency

- Define a new tree
- Get list of nodes from BST
- Loop through nodes
- If number is divisible by 5 and 3
add a node with the value of "FizzBuzz"
to the new tree
- If number is divisible by 3
add a node with the value of "Fizz"
to the new tree
- If number is divisible by 5
add a node with the value of "Buzz"
to the new tree
- Else add the add a node with the same value

Time complexity -> O(N) ,loop each node
Space complexity -> O(N) number of nodes
add to queue and list

### Solution

- [Code Challenge 18 whiteboard](./assets/code_challenge_18_whiteboard.PNG)

### Challenge (Code challenge 16)

Find the maximum value in binary tree

### Approach & Efficiency

- Define integer max
- Use BST to traverse tree
- Loop through the list
- Compare value with max number
- If value is greater than max number,
make max number equal to value
- Return max number

Time complexity -> O(N), loop through every tree node
Space complexity -> O(N), list returned from bst

### Solution

- [Code Challenge 16 whiteboard](./assets/code_challenge_16_whiteboard.PNG)

### Challenge (Code challenge 7)

Return the number that is kth from end of a linkedlist

### Approach & Efficiency

- Define a count to keep of number nodes
in linkedlist
- Loop through list
- Stop incrementing counter when current.next() is null
- Counter should be length of the list -1 
- Loop through the list until i is equal or greater than counter
- Return node.value where loop stopped

Time complexity -> O(N^2), nested loop
Space complexity -> O(1)

### Solution

- [Code Challenge 7 whiteboard](./assets/code_challenge_7_whiteboard.PNG)

### Challenge (Code challenge 26)

Sort an array using insertion sort method

### Approach & Efficiency

- Loop through the array where i =1
- Define j which is equal to i -1
- Save value at index i to temp variable
- Check if temp is less than value at specific index previous to it 
- Check that j is positive
- Move value at j index by one index
- Subtract j with 1
- Repeat the above procedures until one of the conditions is false
- Add temp to index j+1

Time complexity -> O(N^2), nested loops
Space complexity -> O(1)

### Solution

- [Code Challenge 26 whiteboard](./assets/code_challenge_26_whiteboard.PNG)
- [Blog - Code Challenge 26](./blogs/code-challenge-26/BLOG-26.md)

### Challenge (Code challenge 11)

Sort an array using insertion sort method

### Approach & Efficiency

- Define a stack
- Define a reverse stack
- If stack is not empty, pop all values
to the reverse stack
- Add the given value to the reverse stack
- Pop all values in the reverse stack to the other
stack
- Stack should now be order similar to a queue

Time complexity -> O(N), goes through a loop, traversing n elements
Space complexity -> O(N), saving n elements to a stack

### Solution

- [Code Challenge 26 whiteboard](./assets/code_challenge_26_whiteboard.PNG)