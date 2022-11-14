package ru.mirea.practice.task2;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String receiveCall(String caller) {
        return "Звонок от " + caller;
    }

    public String receiveCall(String caller, String number) {
        return "Звонок от " + caller + " Номер телефона: " + number;
    }

    public void sendMessage(String... numbers) {
        for (String s : numbers) {
            System.out.print(s + " ");
        }
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        weight = 0;
    }

    public Phone() {
        number = " ";
        model = " ";
        weight = 0;
    }
}
