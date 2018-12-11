package com.company;

public class fclass1 {

    private void method() {
        System.out.println("В этом классе содержится метод main()");
    }

    public static void fclass1(String[] args) {
        new fclass1().method();
        new fclass2().method();
        new fclass3().method();
    }
}

class fclass3 extends fclass1 {
    protected void method(){
        System.out.println("Этот класс наследуется от класса fclass1");
    }
}

class fclass2 extends fclass3 {
    public void method() {
        System.out.println("Этот класс наследуется от класса fclass3");
    }
}