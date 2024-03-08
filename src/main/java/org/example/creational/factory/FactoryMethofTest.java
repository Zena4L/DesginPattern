package org.example.creational.factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactoryMethofTest {
    FactoryDatabase factory = new FactoryDatabase();

    Database mongo = factory.getDatabase("Mongo");
    Database sql = factory.getDatabase("Sql");

    @Test
    public void FactoryTest() {
        assertEquals("Mongo", mongo.getDatabase());
        assertEquals("SQL", sql.getDatabase());
    }
}
