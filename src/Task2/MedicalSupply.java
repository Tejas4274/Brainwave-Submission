package Task2;

import java.util.HashMap;
import java.util.Map;

class MedicalSupply {
    private String name;
    private int quantity;

    public MedicalSupply(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class InventoryManager {
    private Map<String, MedicalSupply> inventory = new HashMap<>();

    public void addSupply(MedicalSupply supply) {
        inventory.put(supply.getName(), supply);
        System.out.println("Supply added: " + supply.getName());
    }

    public void updateSupply(String name, int quantity) {
        if (inventory.containsKey(name)) {
            inventory.get(name).setQuantity(quantity);
            System.out.println("Supply updated: " + name);
        } else {
            System.out.println("Supply not found: " + name);
        }
    }

    public MedicalSupply getSupply(String name) {
        return inventory.get(name);
    }
}
