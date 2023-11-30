package org.javajunior.switchboards;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Electricity implements ElectricityStatus {

    private boolean condition;
    public boolean select(boolean condition){
        return this.condition=condition;
    }
    public Electricity() {
    }
}
