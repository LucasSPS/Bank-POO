package com.bank.model;

import lombok.Getter;

@Getter
public abstract class Account implements IAccount{
    private String agencyNum;
    private String accountNum;
    private double balance;

    @Override
    public void withdrawMoney(double value) {

    }

    @Override
    public void TransferMoney(double value, Account destinationAccount) {

    }

    @Override
    public void depositMoney(double value) {

    }
}
