package projects.src.tugas2;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("n : ");
        n = input.nextInt();

        for(int i = 0; i < n; i++) {           //baris
            for(int j = 0; j < n; j++) {       //kolom
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
