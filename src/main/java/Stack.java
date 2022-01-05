class Stack {
    private int mSize;
    private int[] stackArray;
    private int top;

    public Stack(int m) {
        this.mSize = m;
        stackArray = new int[mSize];
        top = -1;

    }

    public void addElement(int element) {
        if (isFull()) {
            System.out.println("Стек полон!!!");
        } else {
            stackArray[++top] = element;
        }
    }

    public int deleteElement() {
        if (isEmpty()) {
            System.out.println("Стек пуст!!!");
            return -9999;
        } else {
            return stackArray[top--];
        }
    }


    public int readTop() {
        return stackArray[top];

    }

    public boolean isEmpty() {
        return (top == -1);

    }

    public boolean isFull() {
        return (top == mSize - 1);
    }
}

class AwesomeStack {
    public static void main(String[] args) {
        Stack mStack = new Stack(10);
        mStack.addElement(79);
        mStack.addElement(59);
        mStack.addElement(35);
        mStack.addElement(24);

        mStack.deleteElement();

        System.out.print("Стек: ");
        while (!mStack.isEmpty()) {
            int value = mStack.deleteElement();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}


