package org.example.creational.factory;

public class FactoryDatabase {

    public Database getDatabase(String type) {
        if (type == null) {
            return null;
        }

        return switch (type) {
            case "Sql" -> new Sql();
            case "Mongo" -> new Mongo();
            default -> throw new IllegalArgumentException("Invalid db");
        };
    }
}
