package com.bank.model;

public class main {
    public static void main(String[] args) {
        Client Lucas = new Client();
        Lucas.setName("Lucas");
        SavingsAccount sa = new SavingsAccount(Lucas);
        CurrentAccount ca = new CurrentAccount(Lucas);

        ca.depositMoney(500);
        ca.TransferMoney(420.10, sa);


        sa.PrintBankStatement();
        ca.PrintBankStatement();
        sa.IncomeCalculate( 2);
    }
}
