package com.inflearnhw.Inflearn_HW.dto.calculator.response;

public class CalculatorResponse {
    private long add;
    private long minus;
    private long multiply;

    public CalculatorResponse(long num1, long num2)
    {
        this.add = num1 + num2;
        this.minus = num1 - num2;
        this.multiply = num1 * num2;
    }

    public long getAdd()
    {
        return this.add;
    }

    public long getMinus()
    {
        return this.minus;
    }

    public long getMultiply()
    {
        return multiply;
    }
}
