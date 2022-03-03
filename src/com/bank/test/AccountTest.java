package com.bank.test;

import com.bank.model.Account;
import com.bank.model.Client;
import com.bank.model.CurrentAccount;
import com.bank.model.SavingsAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void depositInvalidValue(){
        //Arrange
        Client Carlos = new Client();
        Carlos.setName("Carlos Mendez");
        Account saCarlos = new SavingsAccount(Carlos);

        //Act
        Throwable exception = assertThrows(RuntimeException.class, () -> saCarlos.depositMoney(0));

        //Assert
        assertEquals("Invalid value!", exception.getMessage());
    }

    @Test
    public void WithdrawnMoreMoneyThanHave(){
        //Arrange
        Client Josephine = new Client();
        Josephine.setName("Josephine Anderson");
        Account ccJose = new CurrentAccount(Josephine);

        //Act
        Throwable exception = assertThrows(RuntimeException.class, () -> ccJose.withdrawMoney(100));

        //Arrange
        assertEquals("Balance insufficient!", exception.getMessage());
    }

    @Test
    public void TransferMoreMoneyThanHave() {
        //Arrange
        Client Daniel = new Client();
        Client John = new Client();
        John.setName("John McConnor");
        Daniel.setName("Daniel Craig");
        Account saDaniel = new SavingsAccount(Daniel);
        Account saJohn = new SavingsAccount(John);

        //Act
        saDaniel.depositMoney(100);
        Throwable exception = assertThrows(RuntimeException.class, () -> saDaniel.TransferMoney(500, saJohn));

        //Arrange
        assertEquals("Balance insufficient!", exception.getMessage());
    }



}