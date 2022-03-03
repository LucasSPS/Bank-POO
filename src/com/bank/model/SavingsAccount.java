package com.bank.model;

public class SavingsAccount extends Account{

    public SavingsAccount(Client client){
        super(client);
    }


    public void IncomeCalculate(int amountMonth){
        double amount = balance;
        for(int i = 0; i<amountMonth;i++){
            amount = amount + (amount* 0.015);
        }
        System.out.printf("\nIncome after %d month(s) in savings Account: %.2f\n", amountMonth, amount);
    }

    @Override
    public void PrintBankStatement() {
        System.out.println("==== Savings Account Statement ====");
        super.BankStatementCommon();
    }



}
