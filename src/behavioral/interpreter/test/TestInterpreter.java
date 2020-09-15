package behavioral.interpreter.test;

import behavioral.interpreter.impl.InterpreterContext;

public class TestInterpreter {
    public static void main(String[] args){
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";

        InterpreterClient interpreterClient = new InterpreterClient(new InterpreterContext());

        System.out.println(str1 + " = "+interpreterClient.interpret(str1));
        System.out.println(str2 + " = "+interpreterClient.interpret(str2));

    }
}
