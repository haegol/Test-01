package kr.ac.sahmyook;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("정수 두개를 입력해주세요 :");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("계산 결과 " + (num1 - num2));

    }
}
