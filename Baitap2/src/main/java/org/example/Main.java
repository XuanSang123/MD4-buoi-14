package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = InputUtils.getInt("Nhập tuổi của bạn: ");
        double height = InputUtils.getDouble("Nhập chiều cao của bạn: ");
        String name = InputUtils.getString("Nhập tên của bạn: ");
        boolean isStudent = InputUtils.getBoolean("Bạn có phải là sinh viên không");

        System.out.println("Thông tin của bạn:");
        System.out.println("Tuổi: " + age);
        System.out.println("Chiều cao: " + height);
        System.out.println("Tên: " + name);
        System.out.println("Là sinh viên: " + (isStudent ? "Có" : "Không"));
    }
}
