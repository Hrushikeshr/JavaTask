package javaassignment;

public class Task21 {
    final double plus = 1;
    final double minus = 2;
    final double divide = 3;
    final double multiply = 4;

    public double calc(int i, double a, double b) {

        if (i == plus) {
            return (a + b);
        }
        else if (i == minus) {
            return (a - b);
        }
        else if (i == divide) {
            return (a / b);
        }
        else if (i == multiply) {
            return (a * b);
        }
        return 0;
    }
}


