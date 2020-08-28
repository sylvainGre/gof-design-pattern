package structural.proxy.test;

import structural.proxy.impl.CommandExecutor;
import structural.proxy.impl.CommandExecutorProxy;

public class TestProxy {

    public static void main(String[] args){
        CommandExecutor commandExecutor = new CommandExecutorProxy("admin", "bullshit");
        try {
            commandExecutor.runCommand("dir");
            commandExecutor.runCommand("rm");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
