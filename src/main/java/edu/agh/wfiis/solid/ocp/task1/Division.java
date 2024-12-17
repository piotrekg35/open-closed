package edu.agh.wfiis.solid.ocp.task1;

public class Division implements Calculating {
    public Number calculate(int val1, int val2) {
        if (val2 == 0) {
            throw new IllegalArgumentException("Dividing by 0 is not possible!");
        }
        Number result = val1 / val2;
        System.out.println(result);
        return result;
    }
}
