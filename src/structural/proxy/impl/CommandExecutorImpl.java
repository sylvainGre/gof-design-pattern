package structural.proxy.impl;

public class CommandExecutorImpl implements CommandExecutor{
    @Override
    public void runCommand(String cmd) throws Exception {
        if(getOs().startsWith("Windows"))
            cmd = "cmd.exe \\c "+cmd;

        Runtime.getRuntime().exec(cmd);

        System.out.println("'"+cmd+"' command executed on "+ getOs());
    }

    private String getOs(){
        return System.getProperty("os.name");
    }
}
