// main class contains main method
public class Main {

    // main method called by jvm
    public static void main(String[] args) {
        // test stack
        Stack stk = new Stack(5);
        // push
        for (int i = 0; i < 5; i++) {
            stk.push(i);
        }

        // pop - pop will be in reverse order of push
        for (int i = 0; i < 5; i++) {
            System.out.println("Item in stack ==> " + stk.pop());
        }
    }
}

// create a box class
class Box {

    // length of the box
    int length;

    // width of the box
    int width;

    // height of the box
    int height;

    // constructor to initialize a box
    Box(int l, int w, int h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    //  return the volume of the box
    int volume() {
        return length * width * height;
    }
}

// let's create a stack class
class Stack {

    // underlying data structure to save data
    int[] array;

    // top of stack
    int tos;

    // constructor to initialize
    Stack(int size) {
        array = new int[size];
        tos = -1;
    }

    // behavior of stack push and pop

    // push item into stack
    void push(int item) {
        // if stack is full we can't push
        if (array.length - 1 == tos) {
            System.out.println("Stack is full");
        } else {
            // push item into stack, first we need to increment tos
            tos = tos + 1;
            array[tos] = item;
        }
    }

    // pop item from stack
    int pop() {
        // if stack is empty we can't pop anything
        if (tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        // remove item from stack, decrement tos and return
        int item = array[tos];
        tos = tos - 1;
        return item;
    }
}



