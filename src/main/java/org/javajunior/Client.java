package org.javajunior;
import org.javajunior.switchboards.SwitchboardsFacade;
public class Client {
    public void switchboards(boolean condition){
        new SwitchboardsFacade().selectElectricity(condition);
    }
}
