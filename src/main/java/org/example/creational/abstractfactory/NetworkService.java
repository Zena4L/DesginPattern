package org.example.creational.abstractfactory;

public class NetworkService implements Service {
    @Override
    public String runService() {
        return "Network Service running";
    }
}
