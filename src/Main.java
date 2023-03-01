import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Hinh chu nhat");
            System.out.println("2. Hinh tam giac button-left ");
            System.out.println("3. Hinh tam giac top-left");
            System.out.println("4. Hinh tam giac can");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = input.nextInt();
            switch (choice) {

                case 1:
                    Scanner chunhat = new Scanner(System.in);
                    System.out.println("Nhap chieu rong");
                    int width = chunhat.nextInt();
                    System.out.println("Nhap chieu cao");
                    int height = chunhat.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("2. Hinh tam giac button-left ");
                    Scanner inputTamGiac = new Scanner(System.in);
                    System.out.print("Nhap chieu cao: ");
                    int height1 = inputTamGiac.nextInt();
                    System.out.print("Nhap canh day: ");
                    int base = inputTamGiac.nextInt();

                    for (int i = 1; i <= height1; i++) {
                        int width1 = base * i / height1;
                        for (int j = 1; j <= width1; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("3. Hinh tam giac top-left");
                    Scanner input3 = new Scanner(System.in);
                    System.out.print("Enter height: ");
                    int height3 = input3.nextInt();
                    for (int i = height3; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("4. Hinh tam giac can");
                    Scanner tamgiaccan = new Scanner(System.in);
                    System.out.println("nhap chieu cao");
                    int height4 = tamgiaccan.nextInt();

                    for (int i = 1; i <= height4; i++) {
                        for (int j = height4; j >= i; j--) {
                            System.out.print("  ");
                        }
                        for (int k = 1; k <= 2*i-1; k++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }

                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");

            }
        }
    }
}
