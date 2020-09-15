package behavioral.interpreter.test;

import behavioral.interpreter.impl.Expression;
import behavioral.interpreter.impl.IntToBinaryExpression;
import behavioral.interpreter.impl.IntToHexExpression;
import behavioral.interpreter.impl.InterpreterContext;

public class InterpreterClient {
    public InterpreterContext interpreterContext;

    public InterpreterClient(InterpreterContext interpreterContext) {
        this.interpreterContext = interpreterContext;
    }

    public String interpret(String str){
        Expression expression = null;
        if(str.contains("Hexadecimal")){
            expression = new IntToHexExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
        }else if(str.contains("Binary")){
            expression = new IntToBinaryExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
        }else {
            return str;
        }

        return expression.interpret(interpreterContext);
    }
}
