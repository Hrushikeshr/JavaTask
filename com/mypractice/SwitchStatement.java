import java.util.*;
public class SwitchStatement {
    public static void main(String[] args) {
        System.out.print("Enter a domain:");
        Scanner sc = new Scanner(System.in);
        String domain = sc.nextLine();
        domain = domain.trim().toLowerCase();
        switch (domain) {
            case "us" -> System.out.println("United States");
            case "de" -> System.out.println("Germany");
            case "sk" -> System.out.println("Slovakia");
            case "hu" -> System.out.println("Hungary");
            case "in" -> System.out.println("India");
            default -> System.out.println("Unknown");
        }
        double value;
    }
}
