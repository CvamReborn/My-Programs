import java.util.Arrays;
class MyStackClassException extends Exception {
    MyStackClassException(String message) {
        super(message);
    }
}
public class MyStack {
    public static void main(String[] args) throws MyStackClassException {
        MyStack stack = new MyStack(5);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.toString());
        System.out.println(stack.pop());
        System.out.println(stack.toString());
    }

    MyStack(int size) {
        this.size = size;
        this.ptr = -1;
        stackArray = new int[size];
    }

    private final int size;
    private int ptr;
    private final int[] stackArray;

    public void push(int value) throws MyStackClassException {
        if (ptr == size) throw new MyStackClassException("Stack is already full!!");
        ptr++;
        stackArray[ptr] = value;
    }

    public int pop() throws MyStackClassException {
        if (ptr == -1) throw new MyStackClassException("Stack is already empty!!");
        int deletedElement = stackArray[ptr];
        stackArray[ptr] = -1;
        ptr--;
        return deletedElement;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean isFull() {
        return ptr == size;
    }

    public String toString() {
        if(ptr==-1) try {
            throw new MyStackClassException("Nothing to print!!");
        } catch (MyStackClassException e) {
            throw new RuntimeException(e);
        }
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        int i=0;
        for(i=0;i<ptr-1;i++)
        {
            sb.append(stackArray[i]);
            sb.append(", ");
        }
        sb.append(stackArray[i]);
        sb.append("]");
        return sb.toString();
    }
}
