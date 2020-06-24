package com.company;

import java.util.Random;

public class Transaction {

    private Random id = new Random(999999);
    private static int TransactionID = 0;
    private double transactionValue;
    private BankAccount TransactionFrom;
    private BankAccount TransactionTo;

    public Transaction(double transactionValue, BankAccount transactionFrom, BankAccount transactionTo) {
        this.id = id;
        this.TransactionID++;
        this.transactionValue = transactionValue;
        TransactionFrom = transactionFrom;
        TransactionTo = transactionTo;
    }

    public Transaction(double amount, BankAccount transactionFrom) {
    }


    public Random getId() {
        return id;
    }

    public void setId(Random id) {
        this.id = id;
    }

    public int getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(int transactionID) {
        this.TransactionID = transactionID;
    }

    public double getTransactionValue() {
        return transactionValue;
    }

    public void setTransactionValue(double transactionValue) {
        this.transactionValue = transactionValue;
    }

    public BankAccount getTransactionFrom() {
        return TransactionFrom;
    }

    public void setTransactionFrom(BankAccount transactionFrom) {
        TransactionFrom = transactionFrom;
    }

    public BankAccount getTransactionTo() {
        return TransactionTo;
    }

    public void setTransactionTo(BankAccount transactionTo) {
        TransactionTo = transactionTo;
    }
}
