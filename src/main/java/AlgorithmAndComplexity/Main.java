package AlgorithmAndComplexity;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("M");
        int m = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("N");
        int n = scanner2.nextInt();

        ArrayList<Integer> commnDevisor = CommonDevisor(m,n);
        System.out.println("Common devisors: ");
        for (Integer devisor : commnDevisor){
            System.out.println(devisor);
        }

    }

    public static ArrayList<Integer> CommonDevisor(int m, int n) {
        ArrayList<Integer> devisor = new ArrayList<>();

        for (int i = 1; i <= Math.min(m, n); i++) {
            if (m % i == 0 && n % i == 0) {
                devisor.add(i);
            }
        }
        return devisor;
    }
}

