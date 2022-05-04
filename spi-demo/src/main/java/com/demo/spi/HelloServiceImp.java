package com.demo.spi;

public class HelloServiceImp implements HelloService{
    @Override
    public void sayHello() {
        System.out.println("hello world !");
    }
}
