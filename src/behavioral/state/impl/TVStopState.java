package behavioral.state.impl;

import behavioral.state.model.State;

public class TVStopState implements State {
    @Override
    public void doAction() {
        System.out.println("Tv is turned off");
    }
}
