package non.access.modifier;

public class FinalDemo {
    final int Var = 100; // final variable cannot be changed

    final void display() {
        System.out.println("Value of Var: " + Var);
    }

    public static void main(String[] args) {
        FinalDemo fd = new FinalDemo();
        fd.display();

        // fd.Var = 200; // ❌ Not allowed because Var is final
        // Uncommenting the above line will cause a compile-time error
    }
}
