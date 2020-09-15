package behavioral.interpreter.impl;

public class IntToBinaryExpression implements Expression{
    private int numberToConvert;

    public IntToBinaryExpression(int numberToConvert) {
        this.numberToConvert = numberToConvert;
    }

    @Override
    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getBinaryFormat(this.numberToConvert);
    }
}
