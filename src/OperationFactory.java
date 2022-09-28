public class OperationFactory {
    public static Operation getOperation(String operation) {
        switch (operation) {
            case "add":
                return new Addition();
            case "sub":
                return new Subtraction();
            case "div":
                return new Division();
            case "mul":
                return new Multiplication();
            case "pow":
                return new Power();
            default:
                return null;
        }
    }
}
