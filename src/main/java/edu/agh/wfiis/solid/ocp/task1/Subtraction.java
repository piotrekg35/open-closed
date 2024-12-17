package edu.agh.wfiis.solid.ocp.task1;

public class Subtraction implements Calculating {
    public Number calculate(int val1, int val2) {
        Number result = val1 - val2;
        System.out.println(result);
        return result;
    }
}

