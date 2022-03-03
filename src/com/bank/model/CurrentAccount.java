package com.bank.model;

public class CurrentAccount extends Account {

    public CurrentAccount(Client client){
        super(client);
    }
    @Override
    public void PrintBankStatement() {
        System.out.println("==== Current Account Statement ====");
        super.BankStatementCommon();
    }
}
