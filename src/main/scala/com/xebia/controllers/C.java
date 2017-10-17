package com.xebia.controllers;

interface Poly{
    int add(int a, int b);
}


class Num implements Poly{
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}

public class C{
    int i = 10;
    int start = 1;
    public static void main(){
        Num num = new Num();
        int d = num.add(10, 1);
        System.out.print(d);
    }
}
