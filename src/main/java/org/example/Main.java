package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        logger.info("Start of Execution");
        Scanner myObj = new Scanner(System.in);

        //testing deployment-BJDSLJIBFLSIBF
        //FFS sbfrkgbrgehgblrgirjen

        while(true) {
            System.out.println("||---Welcome to Calculator---||");
            System.out.println("Choose your operation");

            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power (x^y)");
            System.out.println("5. Exit\n");

            int choice = myObj.nextInt();

            if (choice > 5 || choice <= 0) {
                logger.warn("Incorrect Input");
                continue;
            }

            if (choice == 5) {
                logger.info("End of Execution");
                System.out.println("Thank you for using Calculator!");
                break;
            }

            System.out.println("Enter the operand (x):");
            double x = myObj.nextDouble();

            if(choice != 4)
                System.out.println("Result: ");

            switch (choice) {
                case 1:
                    System.out.println(sqrt(x));
                    break;
                case 2:
                    System.out.println(factorial((int) x));  // Factorial is for integers
                    break;
                case 3:
                    System.out.println(ln(x));
                    break;
                case 4:
                    System.out.println("Enter second operand (y):");
                    System.out.println("Result: ");
                    double y = myObj.nextDouble();
                    System.out.println(power(x, y));
                    break;
            }
        }
    }

    public static double sqrt(double x) {
        logger.info("START OP: Square Root");
        if (x < 0) {
            logger.warn("Invalid Input: Negative value");
            return Double.NaN;
        }
        double result = Math.sqrt(x);
        logger.info("END OP: Square Root");
        return result;
    }

    public static long factorial(int x) {
        logger.info("START OP: Factorial");
        if (x < 0) {
            logger.warn("Invalid Input: Negative value");
            return -1;
        }
        long result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        logger.info("END OP: Factorial");
        return result;
    }

    public static double ln(double x) {
        logger.info("START OP: Natural Logarithm");
        if (x <= 0) {
            logger.warn("Invalid Input: Non-positive value");
            return Double.NaN;
        }
        double result = Math.log(x);  // Natural log in Java
        logger.info("END OP: Natural Logarithm");
        return result;
    }

    public static double power(double x, double y) {
        logger.info("START OP: Power");
        double result = Math.pow(x, y);
        logger.info("END OP: Power");
        return result;
    }
}