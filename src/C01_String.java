// 클래스 외부에는 어떠한 것도 선언 불가

//import java.util.Scanner;
//
//public class C01_String {
//
//    static String [] names = new String[1000];
//    static int [] numbers = new int[1000];   // int numbers[1000];
//    static int n = 0;
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int k = sc.nextInt();                //  scanf("%d", &k);
//        for(int i = 0; i < k; i++){
//            names[i] = sc.next();            //  scanf("&s", ....);
//            numbers[i] = sc.nextInt();
//        }
//        sc.close();
//
//        for(int i = 0; i < k; i++){
//            System.out.println("Name: " + names[i] + ", Number: " + numbers[i]);
//        }
//    }
//}


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C01_String {

    static String [] names = new String[1000];
    static int [] numbers = new int[1000];   // int numbers[1000];
    static int n = 0;

    public static void main(String[] args) {

        Scanner sc;
        try {
            sc = new Scanner(new File("input.txt"));  //  FILE * fp = fopon(...);
            while (sc.hasNext()) {
                names[n] = sc.next();            //  scanf("&s", ....);
                numbers[n] = sc.nextInt();
                n++;
            }
            sc.close();

        } catch (FileNotFoundException e){
            System.out.print("No file");
            System.exit(1);
        }

        bubbleSort(n, names, numbers);

        for(int i = 0; i < n; i++){
            System.out.println("Name: " + names[i] + ", Number: " + numbers[i]);
        }
    }

    static public void bubbleSort(int n, String [] names, int [] numbers)  // call-by-value
    {
        for(int i = n - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(names[j].compareTo(names[j+1]) > 0){  // 문자열 사전식 정렬
                    String tmpstr = names[j];
                    names[j] = names[j+1];
                    names[j+1] = tmpstr;

                    int tmp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tmp;
                }
            }
        }
    }
}