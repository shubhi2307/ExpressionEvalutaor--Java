import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Expression Evaluator ===");
            System.out.println("1. Check Parentheses Balance");
            System.out.println("2. Infix to Postfix");
            System.out.println("3. Evaluate Postfix");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter expression: ");
                    String exp1 = sc.nextLine();
                    System.out.println(Expressionutila.isBalanced(exp1) ? "✅ Balanced" : "❌ Not balanced");
                    break;
                case 2:
                    System.out.print("Enter infix: ");
                    String infix = sc.nextLine();
                    System.out.println("Postfix: " + Expressionutila.infixToPostfix(infix));
                    break;
                case 3:
                    System.out.print("Enter postfix (digits only): ");
                    String postfix = sc.nextLine();
                    System.out.println("Result: " + Expressionutila.evaluatePostfix(postfix));
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid!");
            }
        }
    }
}