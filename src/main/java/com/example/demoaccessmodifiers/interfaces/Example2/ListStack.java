package com.example.demoaccessmodifiers.interfaces.Example2;

import java.util.List;

public class ListStack implements Stack{

    int[] arr;
    int topIndex;

    public ListStack(){
        arr = new int[100005];
        topIndex = -1;
    }


    @Override
    public void push(int x) {
        topIndex++;
        arr[topIndex] = x;
    }

    @Override
    public int pop() {
        int value = arr[topIndex];
        topIndex--;
        return value;
    }

    @Override
    public int top() {
        return arr[topIndex];
    }

    @Override
    public boolean isEmpty() {
        return topIndex >= 0;
    }
}
