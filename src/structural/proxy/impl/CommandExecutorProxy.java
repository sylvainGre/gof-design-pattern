package structural.proxy.impl;

public class CommandExecutorProxy implements CommandExecutor{
    private boolean isAdmin;
    private CommandExecutor commandExecutor;

    public CommandExecutorProxy(String user, String password) {
        if(user.equals("admin") && password.equals("admin")){
            isAdmin = true;
        }
        this.commandExecutor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin){
            commandExecutor.runCommand(cmd);
        }
        else{
            if(cmd.trim().startsWith("rm") || cmd.trim().startsWith("cmd.exe \\c rm")){
                throw new Exception("rm command is not allowed for non-admin users.");
            }else{
                commandExecutor.runCommand(cmd);
            }
        }
    }
}
