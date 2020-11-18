package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n" +
                "             _                           \n" +
                "            | |                          \n" +
                " _ __   ___ | |_ ___    __ _ _ __  _ __  \n" +
                "| '_ \\ / _ \\| __/ _ \\  / _` | '_ \\| '_ \\ \n" +
                "| | | | (_) | ||  __/ | (_| | |_) | |_) |\n" +
                "|_| |_|\\___/ \\__\\___|  \\__,_| .__/| .__/ \n" +
                "                            | |   | |    \n" +
                "                            |_|   |_|    \n");
        int homeworks = 0;
        int first = 1;
        int second = 1;
        String[] Robin = new String[10];
        while (homeworks <= 10) {
            while (first == 1) {
                System.out.println("-----------------------------------------------------");
                System.out.println("Můžeš mít jen 10 úkolů!");
                System.out.println("Máš " + homeworks + "/10!");
                System.out.println("-----------------------------------------------------");
                System.out.println("1) Upravit úkoly");
                System.out.println("2) Odejít");
                first = Integer.parseInt(sc.nextLine());
                if (first == 1) {
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Upravit úkoly");
                    System.out.println("-----------------------------------------------------");
                    while (second != 4) {
                        System.out.println("1) Vytvořit nový úkol");
                        System.out.println("2) Upravit úkol");
                        System.out.println("3) Smazat úkol");
                        System.out.println("4) Vrátit se do hlavního menu");
                        System.out.println("5) Ukázat úkoly");
                        second = Integer.parseInt(sc.nextLine());

                        if (homeworks >= 10) {
                            System.out.println("Máš moc úkolů");
                        } else {
                            if (second == 1) {
                                System.out.println("Vyber si pozici");
                                int haha = Integer.parseInt(sc.nextLine());
                                haha--;
                                System.out.println("Napiš úkol");

                                Robin[haha] = sc.nextLine();
                                homeworks++;

                            }
                        }
                        if (second == 2) {
                            System.out.println("Vyber si pozici");
                            int haha = Integer.parseInt(sc.nextLine());
                            haha--;
                            System.out.println("Napiš úkol");

                            Robin[haha] = sc.nextLine();
                        }
                        if (second == 3) {
                            System.out.println("Vyberte pozici úkolu kterou chcete smazat");
                            int haha = Integer.parseInt(sc.nextLine());
                            Robin[haha] = "";
                            System.out.println("úkol byl zníčen");
                            homeworks--;
                            break;
                        }
                        if (second == 5) {
                            for (int i = 0; i < 10; i++) {
                                System.out.println(i + ". úkol    " + Robin[i]);
                            }
                        }
                    }
                }
            }
        }
    }
}