package org.javajunior.switchboards;

public class PowerSocket extends Electricity{
    @Override
    public void status() {
        System.out.println(isCondition() ?
                "Электричество в розетках включено!":
                "Электричество в розетках выключено!");
    }
}
