package com.bank.model;

public interface IAccount {
    void withdrawMoney(double value);

    void TransferMoney(double value, Account destinationAccount);

    void depositMoney(double value);
}
