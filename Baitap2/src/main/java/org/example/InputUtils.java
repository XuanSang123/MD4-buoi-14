package org.example;

import java.util.Scanner;

public class InputUtils {
    private static Scanner scanner = new Scanner(System.in);


    public static int getInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Dữ liệu không hợp lệ, vui lòng nhập lại số nguyên.");
            }
        }
    }
       public static double getDouble(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Dữ liệu không hợp lệ, vui lòng nhập lại số thực.");
            }
        }
    }
      public static String getString(String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine();
            if (!input.trim().isEmpty()) {
                return input;
            } else {
                System.out.println("Chuỗi không được để trống, vui lòng nhập lại.");
            }
        }
    }
    public static boolean getBoolean(String message) {
        while (true) {
            System.out.print(message + " (yes/no): ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("yes")) {
                return true;
            } else if (input.equals("no")) {
                return false;
            } else {
                System.out.println("Dữ liệu không hợp lệ, vui lòng nhập 'yes' hoặc 'no'.");
            }
        }
    }
}
