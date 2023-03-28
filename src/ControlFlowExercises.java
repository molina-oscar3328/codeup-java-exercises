import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

        System.out.println("Hello there we will start the exercises:");

//while

//        int i = 5;
//        while(i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }

//do while loop

//        int i = 0;
//        do{
//            System.out.println(i);
//            i += 2;
//        } while(i <= 100);



//        int i = 100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        } while(i >= -10);

//squared numbers below

//        long i = 2;
//        do{
//            System.out.println(i);
//            i *= i;
//        } while(i <= 1_000_000);

//numbers 1 to 100 below

//        int i = 1;
//        do{
//            System.out.println(i);
//            i++;
//        } while(i < 101);

//        FizzBuzz

//        for (int i = 1; i < 100; i++) {
//            boolean divBy3 = (i % 3) == 0;
//            boolean divBy5 = (i % 5) == 0;
//
//            if(divBy3 && divBy5) {
//                System.out.println("FizzBuzz");
//            } else if(divBy5) {
//                System.out.println("Buzz");
//            } else if(divBy3){
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        table of power

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNum = sc.nextInt();

        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

        for (int i = 1; i <= userNum ; i++) {
            System.out.printf("%7d|%9d|%6d\n", i, i * i, i * i * i);
        }

        














    }

}
