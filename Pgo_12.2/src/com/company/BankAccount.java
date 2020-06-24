package com.company;

import java.util.ArrayList;
import java.util.List;

public class BankAccount implements AccountOperations  {
    private double accountBalance = 0;
    private List<Transaction> transactionList = new ArrayList<Transaction>();









    public BankAccount(double accountBalance, List<Transaction> transactionList) {
        this.accountBalance = accountBalance;
        this.transactionList = transactionList;
    }

    public BankAccount() {
    }


    @Override
    public void chekAccountBalance() {
        System.out.println(accountBalance);

    }

    @Override
    public void makeTransfer(double amount, BankAccount TransactionTo, BankAccount TransactionFrom) throws AccountOperationExeption {
        if (accountBalance < amount){
            throw new AccountOperationExeption();
        }else {
            TransactionFrom.accountBalance -= amount;
            TransactionTo.accountBalance += amount;
          Transaction newTransfer =  new Transaction(amount,TransactionFrom,TransactionTo);
          transactionList.add(newTransfer);
        }
    }


    @Override
    public void makePayment(double amount, BankAccount TransactionFrom) throws AccountOperationExeption {
        if (accountBalance < amount) {
            throw new AccountOperationExeption();
        } else {
            TransactionFrom.accountBalance -= amount;
            Transaction newPayment =  new Transaction(amount,TransactionFrom);
            transactionList.add(newPayment);


        }
    }

















    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }
}
