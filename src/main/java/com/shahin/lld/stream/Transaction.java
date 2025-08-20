package com.shahin.lld.stream;


public class Transaction{
    private String date;
    private Double amount;

    public Transaction(String date, Double amount){
        this.date = date;
        this.amount = amount;
    }

    // Getter for date
    public String getDate() {
        return date;
    }

    // Setter for date
    public void setDate(String date) {
        this.date = date;
    }

    // Getter for amount
    public Double getAmount() {
        return amount;
    }

    // Setter for amount
    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
