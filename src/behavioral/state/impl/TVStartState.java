package behavioral.state.impl;

import behavioral.state.model.State;

public class TVStartState implements State {
    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }
}
