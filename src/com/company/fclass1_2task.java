package com.company;

public class fclass1_2task {

    public static void main(String[] args) {
        fclass2_2task test = new fclass2_2task("Маршала-Говорова", 11);
        test.displayInfo();
    }

}

class fclass2_2task {
    protected String street;
    private int number;

    protected fclass2_2task(String street, int number) {
        this.street = street;
        this.number = number;
    }

    protected void displayInfo() {
        System.out.println("Улица: " + street + "\nНомер: " + number);
    }
}