package org.example.creational.factory;

public class Sql implements Database{
    @Override
    public String getDatabase() {
        return "SQL";
    }
}
