// Control Statements in Java (if-else, switch, for loop)

public class q13 {
    public static void main(String[] args) {
        int number = 10;

        // 1. if-else statement
        if (number > 0) {
            System.out.println(number + " is Positive.");
        } else {
            System.out.println(number + " is Non-Positive.");
        }

        // 2. switch statement
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Day: Monday");
                break;
            case 2:
                System.out.println("Day: Tuesday");
                break;
            default:
                System.out.println("Other Day");
        }

        // 3. for loop
        System.out.print("Counting 1 to 5: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
