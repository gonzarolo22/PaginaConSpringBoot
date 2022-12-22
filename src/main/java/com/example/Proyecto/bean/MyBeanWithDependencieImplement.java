package com.example.Proyecto.bean;

public class MyBeanWithDependencieImplement implements MyBeanWithDependencie{
   private MyOperation myOperation;

    public MyBeanWithDependencieImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }


    @Override
    public void printWithDependency() {
        int numero=1;
        System.out.println(myOperation.sum(numero));
        System.out.println("hola desde la implementacion con dependencia");
    }
}
