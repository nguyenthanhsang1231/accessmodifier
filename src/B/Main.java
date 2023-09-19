package B;

import A.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap + ban + kinh + hinh + tron");
        int nutan = scanner.nextInt();
        Circle circle = new Circle(nutan);
            System.out.println(circle.Dientich());
            System.out.println(circle.Chuvi());
    }
}
