import java.util.Scanner;

public class SafeInputs {
    public static String getNonZeroLength(Scanner pipe, String prompt) {
        String retVal = "";
        boolean done = false;
        do {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.length() > 0) {
                done = true;

            } else {
                System.out.println("You need to enter a character");
            }
        } while (!done);
        return retVal;

    }

    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;

            } else {
                trash = pipe.nextLine();
                System.out.println(trash + " is not a valid number");
            }
        } while (!done);
        return retVal;

    }

    public static double getDouble(Scanner pipe, String prompt) {
        double retVal = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;

            } else {
                trash = pipe.nextLine();
                System.out.println(trash + " is not a valid number");
            }
        } while (!done);
        return retVal;
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = low - 1;
        String trash = "";
        boolean done = false;
        do {
            System.out.print(prompt + " [" + low + "-" + high + "]: ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    System.out.println("You said your val is " + retVal);
                    done = true;
                } else {
                    System.out.println("You said your favorite number is " + retVal + " but the range should be between " + low + " and " + high);
                }

            } else {
                trash = pipe.nextLine();
                System.out.println(trash + " is not a valid number");
            }
        } while (!done);
        return retVal;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retVal = low - 1;
        String trash = "";
        boolean done = false;
        do {
            System.out.print(prompt + " [" + low + "-" + high + "]: ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    System.out.println("You said your val is " + retVal);
                    done = true;
                } else {
                    System.out.println("You said your favorite number is " + retVal + " but the range should be between " + low + " and " + high);
                }

            } else {
                trash = pipe.nextLine();
                System.out.println(trash + " is not a valid number");
            }
        } while (!done);
        return retVal;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String respYN = "";
        boolean retVal = false;
        boolean done = false;

        do {
            System.out.println(prompt + "[Y/N]: ");
            respYN = pipe.nextLine();
            if (respYN.equalsIgnoreCase("Y")) {
                retVal = true;
                done = true;
            } else if (respYN.equalsIgnoreCase("N")) {
                retVal = false;
                done = true;
            } else {
                System.out.println("You must enter [Y/N]: ");
            }
        } while (!done);
        return retVal;
    }
    public static String getRegExString(Scanner pipe, String prompt, String pattern){
        String retVal = "";
        boolean done = false;

        do {
            System.out.println(prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.matches(pattern)) {
                done = true;
            } else {
                System.out.println("What you entered does not match the pattern " + pattern);
            }
        } while (!done);
        return retVal;
    }
    public static void prettyHeader(String msg) {
        int whiteSpace = (53 - msg.length()) / 2;

        for (int x = 0; x <= 59; x++) {
            System.out.print("*");
        }
        System.out.print("\n***");

        for (int x = 0; x <= whiteSpace; x++) {
            System.out.print(" ");
        }

        System.out.println("***");

        for (int x = 0; x <= 59; x++) {
            System.out.print("*");
        }
    }

}