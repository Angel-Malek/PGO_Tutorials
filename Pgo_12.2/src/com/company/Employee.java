package com.company;

import java.util.Random;

public class Employee extends User  {
    private Random id = new Random(99999);

    public Employee(String name, String surname) {
        super(name, surname);
        this.id = id;
    }


    public Client addClient( String name, String surname, double accountBalance){
        BankAccount b = new BankAccount(accountBalance,null);

        BankAccount newBankAccount = new BankAccount();
        Client newClient = new Client(name,surname, newBankAccount,id );
        return newClient;
    }

    public void acceptTransfer (double amount, BankAccount transactionFrom, BankAccount transactionTo ) throws AccountOperationExeption {
        transactionFrom.makeTransfer(amount,transactionTo,transactionFrom);
    }

    public void acceptPayment(double amount, BankAccount transactionFrom) throws AccountOperationExeption {
        transactionFrom.makePayment(amount,transactionFrom);
    }





}
