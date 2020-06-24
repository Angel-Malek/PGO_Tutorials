package com.company;

import java.util.Random;

public class Client extends User {


    private BankAccount clientAccount;
    private Random id = new Random(9999999);

    public Client(String name, String surname, BankAccount clientAccount, Random id) {
        super(name, surname);
        this.clientAccount = clientAccount;
        this.id = id;
    }

private void pay (double amount, BankAccount transactionFrom ) throws AccountOperationExeption {this.clientAccount.makePayment(amount,transactionFrom); }
private void transfer (double amount, BankAccount transactionFrom, BankAccount transactionTo) throws AccountOperationExeption {this.clientAccount.makeTransfer(amount,transactionTo,transactionFrom);}

}
