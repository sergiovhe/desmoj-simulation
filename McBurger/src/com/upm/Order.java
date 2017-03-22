package com.upm;

import desmoj.core.simulator.Entity;
import desmoj.core.simulator.Model;

public class Order extends Entity {

    private Client client;

    public Order(Model owner, String name, boolean showInTrace) {
        super(owner, name, showInTrace);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}