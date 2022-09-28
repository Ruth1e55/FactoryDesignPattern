import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("================MENU=================");
            System.out.println("1. Addition - type 'add'");
            System.out.println("2. Subtraction - type 'sub'");
            System.out.println("3. Division - type 'div'");
            System.out.println("4. Multiplication - type 'mul'");
            System.out.println("5. Power - type 'pow'");
            System.out.println("6. Exit - type 'exit' or 6");
            System.out.println("===========================================");
            System.out.println("Enter the operation you want to perform: ");
            Scanner scanner = new Scanner(System.in);
            String operationName = scanner.nextLine();
            if (operationName.equals("6") || operationName.equals("exit")) {
                break;
            }
            if(OperationFactory.getOperation(operationName) == null) {
                System.out.println("Invalid operation");
                continue;
            }
            System.out.println("Enter the first number: ");
            int x = scanner.nextInt();
            System.out.println("Enter the second number: ");
            int y = scanner.nextInt();
            Operation operation = OperationFactory.getOperation(operationName);
            try {
                System.out.println("===========================================");
                System.out.println("Result: " + operation.calculate(x, y));
                System.out.println("====================x======================");
            } catch (Exception e) {
                System.out.println("===========================================");
                System.out.println("Error: " + e.getMessage());
                System.out.println("====================x======================");
            }
        }
    }
}