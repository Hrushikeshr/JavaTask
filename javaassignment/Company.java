package javaassignment;

public interface Company {
    default double calculate(double cp, double cs){
        return cp -cs;
    }

    public static String compName(Double d) {

        return null;
    }
    public abstract String getCompDetails(double profit,String name);
}
