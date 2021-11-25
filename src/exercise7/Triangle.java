package exercise7;

import java.util.Scanner;

    public class Triangle {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int n = input.nextInt();

            for (int line = 1; line <= n; line++) {
                    printLine(1, line);
            }

            for (int line = n - 1; line >= 1; line--) {
                printLine(1, line);
            }

        }

        public static void printLine(int start, int end) {
            for (int j = start; j <= end; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
