import java.util.InputMismatchException;
import java.util.Scanner;

public class CelsiusFahrenheit {
    public static double runConverter() {
        Scanner input = new Scanner(System.in);
        double result = 0;
        boolean usingConverter = true;

        while (usingConverter) {
            explanationPrints();

            int choice;
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Invalid input. Please enter a number (1, 2, or 3).");
                input.nextLine();
                continue;
            }

            switch (choice) {
                case 1 -> {
                    celsiusToFahrenheit(input);
                    usingConverter = askAgain(input);
                }
                case 2 -> {
                    fahrenheitToCelsius(input);
                    usingConverter = askAgain(input);
                }
                case 3 -> {
                    usingConverter = false;
                    System.out.println("Ending Program...");
                }
                default -> System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }

        input.close();
        return result;
    }

    private static void explanationPrints() {
        System.out.println("--- Temperature Converter ---");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.println("3. Exit Program");
        System.out.print("Enter your choice (1-3): ");
    }


    private static void celsiusToFahrenheit(Scanner input) {
        System.out.print("Enter Celsius to convert to Fahrenheit: ");
        double celsius = input.nextDouble();
        double result = celsiusToFahrenheitMathematics(celsius);
        System.out.println("Result: " + result + "°F");
        input.nextLine();
    }

    public static double celsiusToFahrenheitMathematics(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    private static void fahrenheitToCelsius(Scanner input) {
        System.out.print("Enter Fahrenheit to convert to Celsius: ");
        double fahrenheit = input.nextDouble();
        double result = fahrenheitToCelsiusMathematics(fahrenheit);
        System.out.println("Result: " + result + "°C");
        input.nextLine();
    }

    public static double fahrenheitToCelsiusMathematics(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    public static boolean askAgain(Scanner input) {
        boolean continueLoop;
        System.out.println("Do you want to convert more?");
        String answer = input.nextLine();
        if (answer != null &&
                java.util.List.of("yes", "yea", "yeah").contains(answer.trim().toLowerCase())) {
            continueLoop = true;

        } else if (answer != null &&
                java.util.List.of("no", "na", "nah", "nope").contains(answer.trim().toLowerCase())) {
            continueLoop = false;

        } else {
            System.out.println("Invalid input. Please answer.");
            return askAgain(input);

        }
        return continueLoop;
    }

}

