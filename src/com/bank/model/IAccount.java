package com.bank.model;

public interface IAccount {
    void withdrawMoney(double value);

    void TransferMoney(double value, IAccount destinationAccount);

    void depositMoney(double value);

    void PrintBankStatement();
}
