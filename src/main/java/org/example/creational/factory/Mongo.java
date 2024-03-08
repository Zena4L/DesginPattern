package org.example.creational.factory;

public class Mongo implements Database {
    @Override
    public String getDatabase() {
        return "Mongo";
    }
}
