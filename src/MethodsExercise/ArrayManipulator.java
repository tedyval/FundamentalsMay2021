package MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbersInput = scanner.nextLine();
        int[] array = Arrays.stream(numbersInput.split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] extractedCommand = getCommand(command);
//           executeCommand(extractedCommand[0]);
            int splitNumber = Integer.parseInt(extractedCommand[1]);


            command = scanner.nextLine();
        }


    }

    private static void executeCommand(String[] extractedCommand, int[] array, int splitNumber) {
        switch (extractedCommand[0]) {
            case "exchange":
//                getExchangedArray(command);
                break;
            case "max even":
                getMaxEven(array);
                break;
            case "max odd":
                getMaxOdd(array);
                break;
            case "min even":
                getMinEven(array);
                break;
            case "min odd":
                getMinOdd(array);
                break;
            case "first even":
                getFirstXEven(array, splitNumber);
                break;
            case "first odd":
                getFirstXOdd(array, splitNumber);
                break;
            case "last even":
                getLastXOdd(array, splitNumber);
                break;
            case "last odd":
                getLastXEven(array, splitNumber);
                break;
        }

    }

    private static void getLastXEven(int[] array, int splitNumber) {
    }

    private static void getLastXOdd(int[] array, int splitNumber) {
        int count = 0;
        int[] firstElements = new int[splitNumber];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
                for (int j = 0; j < splitNumber; j++) {
                    firstElements[j] = array[i];
                }
            }
        }
        if (count == 0) {
            System.out.println("[]");
        } else if (count < splitNumber) {
            for (int k = 0; k < count; k++) {
                System.out.println(firstElements[k]);
            }
        } else if (count > array.length) {
            System.out.println("Invalid count");
        } else if (count == splitNumber) {
            String numberStr = Arrays.toString(firstElements);
            System.out.println(String.join(", ", numberStr));
        }
    }

    private static void getFirstXOdd(int[] array, int splitNumber) {
        int count = 0;
        int[] firstElements = new int[splitNumber];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
                for (int j = 0; j < splitNumber; j++) {
                    firstElements[j] = array[i];
                }
            }
        }
        if (count == 0) {
            System.out.println("[]");
        } else if (count < splitNumber) {
            for (int k = 0; k < count; k++) {
                System.out.println(firstElements[k]);
            }
        } else if (count > array.length) {
            System.out.println("Invalid count");
        } else if (count == splitNumber) {
            String numberStr = Arrays.toString(firstElements);
            System.out.println(String.join(", ", numberStr));
        }
    }

    private static void getFirstXEven(int[] array, int splitNumber) {
        int count = 0;
        int[] firstElements = new int[splitNumber];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
                for (int j = 0; j < splitNumber; j++) {
                    firstElements[j] = array[i];
                }
            }
        }
        if (count == 0) {
            System.out.println("[]");
        } else if (count < splitNumber) {
            for (int k = 0; k < count; k++) {
                System.out.println(firstElements[k]);
            }
        } else if (count > array.length) {
            System.out.println("Invalid count");
        } else if (count == splitNumber) {
            String numberStr = Arrays.toString(firstElements);
            System.out.println(String.join(", ", numberStr));
        }

    }



    private static void getMinOdd(int[] array) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                if (array[i] <= min) {
                    index = i;
                    min = array[i];
                    isFound = true;
                } else {
                    System.out.println("No matches");
                }
            }
        }

        if (isFound == true) {
            System.out.println(index);
        }
    }

    private static void getMinEven(int[] array) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                if (array[i] <= min) {
                    index = i;
                    min = array[i];
                    isFound = true;
                } else {
                    System.out.println("No matches");
                }
            }
        }

        if (isFound == true) {
            System.out.println(index);
        }
    }

    private static void getMaxOdd(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                if (array[i] >= max) {
                    index = i;
                    max = array[i];
                    isFound = true;
                } else {
                    System.out.println("No matches");
                }
            }
        }

        if (isFound == true) {
            System.out.println(index);
        }
    }

    private static void getMaxEven(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                if (array[i] >= max) {
                    index = i;
                    max = array[i];
                    isFound = true;
                } else {
                    System.out.println("No matches");
                }
            }
        }
        if (isFound == true) {
            System.out.println(index);
        }

    }

    private static void getExchangedArray(String command) {
    }


    static String[] getCommand(String command) {
        String[] partsOfCommand = command.split("\\s+");

        String[] extractedCommands = new String[2];
        for (int i = 0; i < partsOfCommand.length; i++) {
            if (partsOfCommand[0].equals("exchange")) {
                extractedCommands[0] = "exchange";
                extractedCommands[1] = partsOfCommand[1];
            } else if (partsOfCommand[0].equals("max")) {
                if (partsOfCommand[1].equals("even")) {
                    extractedCommands[0] = "max even";
                } else {
                    extractedCommands[0] = "max odd";
                }
            } else if (partsOfCommand[0].equals("min")) {
                if (partsOfCommand[1].equals("even")) {
                    extractedCommands[0] = "min even";
                } else {
                    extractedCommands[0] = "min odd";
                }
            } else if (partsOfCommand[0].equals("first")) {
                if (partsOfCommand[2].equals("even")) {
                    extractedCommands[0] = "first max even";
                    extractedCommands[1] = partsOfCommand[1];

                } else {
                    extractedCommands[0] = "first odd";
                    extractedCommands[1] = partsOfCommand[1];
                }
            } else if (partsOfCommand[0].equals("last")) {
                if (partsOfCommand[2].equals("even")) {
                    extractedCommands[0] = "last even";
                    extractedCommands[1] = partsOfCommand[1];
                } else {
                    extractedCommands[0] = "last odd";
                    extractedCommands[1] = partsOfCommand[1];
                }
            }
        }
        return extractedCommands;
    }

}
