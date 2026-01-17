import java.util.Scanner;

public class Code05 {
    public static void main(String[] args) {

        int [] grades;
        grades = new int [5];
        //int [] grades = new int [5]; 도 가능

        grades[0] = 1;
        grades[1] = 2;
        grades[2] = 3;
        grades[3] = 4;
        grades[4] = 5;

        System.out.println(grades[0]);
        System.out.println(grades[1]);
        System.out.println(grades[2]);
        System.out.println(grades[3]);
        System.out.println(grades[4]);

        System.out.print("생성할 배열의 크기: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] test = new int [n];  // 배열의 크기 변수로 지정 가능

        for (int i = 0; i < test.length; i++) {   // define 해서 배열의 크기 따로 정의할 필요 X
            System.out.printf("test[%d] 의 값을 입력하시오  ", i+1);
            test[i] = sc.nextInt();
        }

        for (int i = 0; i < test.length; i++) {
            System.out.println("test " + (i + 1) + ": " + test[i]);
        }

        // print : 출력 후 줄바꿈 X  vs  println: 줄바꿈 O
    }
}
