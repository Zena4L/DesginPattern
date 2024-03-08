package org.example.creational.builder;

public class Client {
    public static void main(String[] args) {
        AppartmentBuilder builder = new AppartmentBuilder();
        Apartment ap1 = builder.setSqm(25).setRooms(10).setArea("Ghana").setCity("Accra").setKitchen(true).build();
        ap1.display();
    }

}
