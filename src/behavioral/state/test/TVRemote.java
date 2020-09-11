package behavioral.state.test;

import behavioral.state.impl.TVContext;
import behavioral.state.impl.TVStartState;
import behavioral.state.impl.TVStopState;

public class TVRemote {
    public static void main(String[] args){
        TVContext tvContext = new TVContext();

        tvContext.setState(new TVStartState());
        tvContext.doAction();

        tvContext.setState(new TVStopState());
        tvContext.doAction();
    }

}
