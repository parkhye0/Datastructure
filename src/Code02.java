import java.util.Scanner;  // Scanner 쓰기 위해 추가해야함

public class Code02 {

    public static void main(String[] args) {
        int number = 123;

        Scanner kb =  new Scanner(System.in);  // = scanf 함수 선언

        System.out.print("Please enter an integer: ");

        int input = kb.nextInt();  // = scanf("%d", &input);

        if(input == number){
            System.out.println("Numbers match!");
        }
        else System.out.println("Numbers do not match!");

        kb.close();  // 이후로는 Scanner 호출해도 입력 못받음
        /* 요즘엔 밑에 방식 사용
        블록이 끝날 때 자동으로 kb.close()가 호출됨
        try (Scanner kb = new Scanner(System.in)) {
            System.out.print("숫자를 입력하세요: ");
            int n = kb.nextInt();
            System.out.println("입력된 값: " + n);
        } catch (Exception e) {
            // 에러발생시에만 실행됨
            System.out.println("에러 발생! 숫자가 아닌 값을 입력하신 것 같아요.");
            System.out.println("에러 상세 내용: " + e.getMessage());
        }
         */
    }
}
