import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int RndmNum = (int)(Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int MyNum = 0;

        do {
            System.out.println("Enter Your Number:");
            MyNum = sc.nextInt();
            if (RndmNum == MyNum) {
                System.out.println("You Won!!");
                break;
            }
            else if (RndmNum > MyNum) {
                System.out.println("Number is too small!!");
            }
            else {
                System.out.println("Number is too large!!");
            }

        } while (MyNum >= 0);

        System.out.println("My number was "+ RndmNum);
    }
}




