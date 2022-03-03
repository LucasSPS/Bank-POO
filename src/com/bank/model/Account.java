package com.bank.model;
import lombok.Getter;

@Getter

public abstract class Account implements IAccount{
    private static final String DEFAULT_ACCOUNT = "0001";
    private static int SEQUENTIAL = 1;

    protected String agencyNum;
    protected int accountNum;
    protected double balance;
    protected Client client;

    public Account(Client client) {
        this.agencyNum = Account.DEFAULT_ACCOUNT;
        this.accountNum = SEQUENTIAL++;
        this.client = client;
    }

    @Override
    public void withdrawMoney(double value) {
            if(value<=0) {
                throw new RuntimeException("Value must be greater than 0!");
            }
            else if(balance<value){
                throw new RuntimeException("Balance insufficient!");
            }else {
                balance -= value;
            }
        }

    @Override
    public void depositMoney(double value) {
            if(value>0){
                balance += value;
            }
            else{
                throw new RuntimeException("Invalid value!");
            }
        }

    @Override
    public void TransferMoney(double value, IAccount destinationAccount) {
                this.withdrawMoney(value);
                destinationAccount.depositMoney(value);
                System.out.println("successful transaction!");
    }

    protected void BankStatementCommon() {
        System.out.printf("Name: %s%n", this.client.getName());
        System.out.printf("Agency: %s%n", this.agencyNum);
        System.out.printf("Account Number: %d%n", this.accountNum);
        System.out.printf("Balance: $%.2f%n%n", this.balance);
    }

}
