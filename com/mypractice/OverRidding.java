class P {
    public void property() {
        System.out.println("Land, gold, cash");
    }

    public void mary() {
        System.out.println("Subbalakshmi");
    }
}

class C extends P {
    public void mary() {
        System.out.println("Priyanka");
    }
}

public class OverRidding {
    public static void main(String[] args) {
        P p1 = new P();
        p1.mary(); // Subbalakshmi
        C c1 = new C();
        c1.mary(); // Priyanka
        P p2 = new C();
        p2.mary(); // Priyanka
    }
}
