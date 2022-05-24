package MidExam;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] targets = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] resultAfterEachShot = new int[targets.length];
        int counter = 0;
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            int indexOfTarget = Integer.parseInt(input);
            if (indexOfTarget >= 0 && indexOfTarget < targets.length) {
                int valueOfTarget = targets[indexOfTarget];
                if (resultAfterEachShot[indexOfTarget] == -1) {
                    input = scanner.nextLine();
                    continue;
                } else {
                    targets[indexOfTarget] = -1;
                    resultAfterEachShot[indexOfTarget] = -1;
                    counter++;
                    for (int i = 0; i < targets.length; i++) {
                        if (targets[i] > valueOfTarget && resultAfterEachShot[i] != -1) {
                            targets[i] -= valueOfTarget;
                        } else if(targets[i] <= valueOfTarget && resultAfterEachShot[i] != -1){
                            targets[i] += valueOfTarget;
                        }

                    }
                }
            }
                    input = scanner.nextLine();
        }

                StringBuilder output = new StringBuilder();
                for (int target : targets) {
                    output.append(target).append(" ");
                }


                System.out.printf("Shot targets: %d -> %s", counter, output);

            }
        }
