public class StudentPile {
        private Student[] stack;
        private int top;

        public StudentPile(int size) {
            stack = new Student[size];
            top = -1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == stack.length - 1;
        }

        public void push(Student student) {
            if (isFull()) {
                System.out.println("Stack is full! Cannot add more students.");
                return;
            }
            stack[++top] = student;
        }

        public Student pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty! No students to remove.");
                return null;
            }
            return stack[top--];
        }

        public Student peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return null;
            }
            return stack[top];
        }

        public Student[] toArray() {
            Student[] result = new Student[top + 1];
            for (int i = 0; i <= top; i++) {
                result[i] = stack[i];
            }
            return result;
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty! No students to display.");
                return;
            }
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
            }
        }

        public int size() {
            return top + 1;
        }
    }

