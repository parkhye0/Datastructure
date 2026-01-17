import java.util.Scanner;  // Scanner 쓰기 위해 추가해야함

public class Code03 {

    public static void main(String[] args) {
        String str = "Hello";  //string은 프리미티브 타입이 아니므로 ==로 비교 불가
        String input = null;

        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter a String: ");

        input = kb.next(); // 공백 전까지 문자 읽음
        //kb.nextLine(): 엔터 전까지 문자 읽음

        if (str.equals(input)) {   // = input.equals(str)
            System.out.println("Strings match!");
        } else System.out.println("Strings do not match!");

        kb.close();
    }
}
