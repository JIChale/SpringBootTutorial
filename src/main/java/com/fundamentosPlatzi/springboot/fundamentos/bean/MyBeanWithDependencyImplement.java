package com.fundamentosPlatzi.springboot.fundamentos.bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{
    private MyOperation myOperation;
    private MyOperationTwo myOperationTwo;
    
    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }
    
    public MyBeanWithDependencyImplement(MyOperationTwo myOperationTwo) {
        this.myOperationTwo=myOperationTwo;
    }
    
    @Override
    public String printWhithDependency() {
        int numero = 8;
        System.out.println("Hola desde la implementacion de un bean con dependencia");
        return("La dependencia inyectada le sumara 1 a " + numero + ": " + myOperation.sum(numero));
    }
    public String printWhithDependencyResta() {
        int numero = 9;
        System.out.println("Hola desde la implementacion de un bean con dependencia");
        return("La dependencia inyectada le Restara 1 a " + numero + ": " + myOperationTwo.resta(numero));
    }
}
