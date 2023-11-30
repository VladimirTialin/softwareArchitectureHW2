package org.javajunior.switchboards;

public class KitchenAppliances extends Electricity{
    @Override
    public void status() {
        System.out.println(isCondition() ?
                "Электричество бытовой техники работает!":
                "Электричество бытовой техники не работает!");
    }
}
