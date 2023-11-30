package org.javajunior.switchboards;
public class LightApartment extends Electricity{
    @Override
    public void status() {
        System.out.println(isCondition() ?
                "Свет в комнатах квартиры работает!":
                "Свет в комнатах квартиры  не работает!");
    }
}
