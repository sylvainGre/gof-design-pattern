package behavioral.interpreter.impl;

public class IntToHexExpression implements Expression{
    private int numberToConvert;

    public IntToHexExpression(int numberToConvert) {
        this.numberToConvert = numberToConvert;
    }

    @Override
    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getHexadecimalFormat(this.numberToConvert);
    }
}
