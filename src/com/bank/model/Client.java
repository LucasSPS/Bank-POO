package com.bank.model;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Client {
    private String name;

    @Override
    public String toString() {
        String[] result = name.split(" ", 2);
        return result[0];
    }
}
