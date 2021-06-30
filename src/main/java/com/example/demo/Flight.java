package com.example.demo;

public class Flight {

    double price;

    public Flight() {
        this.price = 0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static class Person{
        public Person(String fistName, String lastName) {
            this.fistName = fistName;
            this.lastName = lastName;
        }

        public String getFistName() {
            return fistName;
        }

        public void setFistName(String fistName) {
            this.fistName = fistName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        String fistName;
        String lastName;
    }

}
