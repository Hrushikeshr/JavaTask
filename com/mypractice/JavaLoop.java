public class JavaLoop {
    public static void main(String[] args) {
//        int[] myList = {23, 45, 67, 89};
//        for (int element : myList){
//            System.out.println(element);
//        }

//        String str = "Program";
//        boolean result;
// checks if str is an instance of
// the String class
//        result = str instanceof String;
//        System.out.println("Is str an object of String? " + result);

        int februaryDays = 29;
        String result;
// ternary operator
        result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
        System.out.println(result);
    }
}
