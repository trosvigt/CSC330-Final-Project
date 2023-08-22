package StackClass;

import java.util.ArrayList;

public class MyStack<T extends Comparable> {
  private ArrayList<T> stack;

  // No-arg constructor
  public MyStack() {
    this.stack = new ArrayList<T>();
  }

  // Initialize by passing an array
  public MyStack(T[] array) {
    // Create new stack
    this.stack = new ArrayList<T>();

    // Add each item to the stack
    for (T item : array) {
      stack.add(item);
    }
  }

  // Initialize by passing in an ArrayList
  public MyStack(ArrayList<T> stack) {
    // Assign stack
    this.stack = stack;
  }

  // Returns true if empty, otherwise false
  public boolean empty() {
    return stack.size() == 0;
  }

  // Returns the top element of the stack
  public T peek() {
    int lastIndex = stack.size() - 1;

    return stack.get(lastIndex);
  }

  // Removes the top element of the stack
  public T pop() {
    int lastIndex = stack.size() - 1;

    return stack.remove(lastIndex);
  }

  // Adds an element to the top of the stack
  public T push(T item) {
    stack.add(item);

    return item;
  }

  // Return index of searchItem or -1
  public int search(T searchItem) {
    // Linear search for searchItem
    for (int i = 0; i < stack.size(); i++) {
      // Compare current item and searchItem
      if (stack.get(i).equals(searchItem)) {
        // Found
        return i;
      }
    }

    // Not found
    return -1;
  }
}