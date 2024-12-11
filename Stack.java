class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public Stack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    // Push operation
    public void push(int item) {
        if (top == capacity - 1) { // Check if stack is full
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = item;
        System.out.println("Pushed: " + item);
    }

    // Pop operation
    public int pop() {
        if (top == -1) { // Check if stack is empty
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // Peek operation
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Main method to test the stack
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

