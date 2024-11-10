
# Java Program to Find and Remove the Nth Node from End of a Linked List

This repository contains a Java implementation of a singly linked list that includes functionality to find and delete the nth node from the end. It demonstrates linked list operations such as node insertion, deletion, and traversal, all coded in a simple, modular structure for easy understanding and extensibility.

## Project Overview

The project consists of three main Java classes:

- **Node**: Defines the structure and properties of each node in the linked list.
- **LL (LinkedList)**: Implements linked list methods, including adding nodes, deleting nodes based on their relative position, and displaying the linked list.
- **Main**: Acts as the entry point of the program, handling user inputs and invoking linked list operations.

This project was developed in **IntelliJ IDEA**.

---

## Folder Structure

The project follows a clear and organized structure:

```plaintext
java_find_and_remove_nth_node_from_LL_from_end/
│
├── src/
│   ├── Node.java               # Defines the Node class for the linked list
│   ├── LL.java                 # Implements linked list functionalities
│   └── Main.java               # Main program for user interaction and execution
│
└── README.md                   # Project documentation
```

### Files Description

- **Node.java**: Represents a single node in the linked list, with attributes for storing data and linking to the next node.
- **LL.java**: Implements the linked list with methods for adding nodes, deleting specific nodes, and displaying the entire list.
- **Main.java**: Contains the `main` method, which handles user inputs for adding nodes, deleting a specified node from the end, and displaying the list state.

---

## Requirements

- **Java Development Kit (JDK)** 11 or higher.

---

## Setup and Execution

### Step 1: Clone the Repository
Clone the repository to your local machine using:
```bash
git clone https://github.com/itspriyambhattacharya/java_find_and_remove_nth_node_from_LL_from_end.git
```

### Step 2: Compile and Run
You can open the project in **IntelliJ IDEA** or any preferred Java IDE, then compile and run the `Main.java` file.

Alternatively, use the command line to compile and execute:
```bash
javac src/*.java
java src.Main
```

---

## Usage Instructions

1. Run the program.
2. Enter the number of nodes to insert into the list.
3. Input data values for each node; nodes will be appended to the end of the list.
4. Specify the position (from the end) of the node you wish to delete (e.g., enter `1` to delete the last node, `2` for the second-to-last node, etc.).
5. The program will display the list after deletion.

### Example

```plaintext
Enter the number of elements you want to insert in the list: 5

Enter data of the node: 10
Enter data of the node: 20
Enter data of the node: 30
Enter data of the node: 40
Enter data of the node: 50

The list is:
10 -----> 20 -----> 30 -----> 40 -----> 50 -----> null

Enter the node number to delete from the last: 2

The deleted element is 40
The list is:
10 -----> 20 -----> 30 -----> 50 -----> null
```

---

## Code Structure

### Node.java
Defines the `Node` class with:
- `int data`: Stores the data for the node.
- `Node link`: Holds the reference to the next node in the list.
- `Node(int data)`: Constructor that initializes the node with the provided data.

### LL.java
Implements the `LL` class with:
- `Node head`: Points to the head node of the linked list.
- `int size`: Maintains the size of the linked list.
- `addLast(int data)`: Appends a node with the given data at the end.
- `display()`: Prints the linked list from the head to the end.
- `getSize()`: Returns the total number of nodes in the list.
- `delete(int pos)`: Deletes a node at the specified position.

### Main.java
Handles user interaction and linked list management:
- Prompts the user to specify the number of nodes and values.
- Accepts input for the nth node from the end to delete.
- Calls methods to display the linked list before and after deletion.

---

## License

This project is licensed under the MIT License. For details, refer to the [LICENSE](LICENSE) file.

---

## Author

**Priyam Bhattacharya**  
LinkedIn: [https://www.linkedin.com/in/itspriyambhattacharya/](https://www.linkedin.com/in/yourprofile)

This project serves as an introductory example for data structure concepts, especially useful for those studying linked list operations and basic data manipulation in Java. Feedback and contributions are welcome for further improvement.
