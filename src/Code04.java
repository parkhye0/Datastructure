import java.util.Scanner;

public class Code04 {
    public static void main(String[] args) {
        String name = null;
        int age;
        String gender;

        Scanner input = new Scanner(System.in);

        System.out.print("Please type your name, age, gender: ");

        name = input.next();
        age = input.nextInt();
        gender = input.next();

        if(gender.equals("male")) //string literal
            System.out.println(name + ", you're " + age + " years old man.");
        else if(gender.equals("female"))
            System.out.println(name + ", you're " + age + " years old woman.");
        else
            System.out.println("Hmm... interesting");
    }
}
