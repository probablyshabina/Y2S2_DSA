package Lab01_Stacks.Shab;

import java.util.*;

public class Stacks<T> {
    T type;
    private ArrayList<T> stack;
    private int top;
    private int maxSize;

    public T peek(){
        return stack.get(top);
    }

    public Stacks(int size) {
        this.maxSize = size;
        stack = new ArrayList<>(maxSize);
        top = -1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }

    public void push(T item){
        if(!(isFull())){
            stack.add(item);
            top++;
        }
        else{
            System.out.println("Stack is full");
        }
    }

    public T pop(){
        if(!(isEmpty())){
            T item = stack.get(top);
            stack.remove(top);
            top--;
            return item;
        }
        else{
            System.out.println("Stack is empty");
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("Stacks");
    }

}
