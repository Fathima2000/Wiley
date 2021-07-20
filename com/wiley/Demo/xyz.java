package com.wiley.Demo;

interface Process{
    void add(int i);
}

abstract class AddProcess{
    abstract void add(int i);
}

public class xyz extends AddProcess implements Process{
    @Override
    public void add(int i) {
        System.out.println("--"+i);
    }
}