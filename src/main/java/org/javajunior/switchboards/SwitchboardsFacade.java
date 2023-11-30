package org.javajunior.switchboards;

import lombok.Setter;

import java.util.List;

@Setter
public class SwitchboardsFacade {
    protected List<Electricity> electricity=List.of(
            new PowerSocket(),
            new BathroomLight(),
            new LightApartment(),
            new KitchenAppliances());
    public void selectElectricity(boolean condition){
        for (Electricity element:electricity){
            if(element.select(condition)) element.status();
            else element.status();
        }
    }
}
