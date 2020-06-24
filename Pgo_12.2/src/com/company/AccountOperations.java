package com.company;

public interface AccountOperations {
    public void chekAccountBalance();

    public void makeTransfer(double amount, BankAccount TransactionTo,BankAccount TransactionFrom) throws AccountOperationExeption;

    public void makePayment(double amount, BankAccount TransactionFrom) throws AccountOperationExeption;
}
