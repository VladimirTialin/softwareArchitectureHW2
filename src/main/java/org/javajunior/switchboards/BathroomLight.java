package org.javajunior.switchboards;

public class BathroomLight extends Electricity{
    @Override
    public void status() {
        System.out.println(isCondition() ?
                "Свет в ванной комнате работает!":
                "Свет в ванной комнате не работает!");
    }
}
