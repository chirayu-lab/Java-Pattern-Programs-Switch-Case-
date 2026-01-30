import java.util.*;
public class pattern_7 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
//            char ch;
            int ch = 0; int i,j;
            System.out.println("Enter 1 for a random pattern");
        System.out.println("Enter 2 for a random pattern");
        System.out.println("Enter 3 for a random pattern");
        System.out.println("Enter 4 for a random pattern");
        System.out.println("Enter 5 for a random pattern");
//        System.out.println("Enter 6 for a random pattern");
//        System.out.println("Enter 7 for a random pattern");
//        System.out.println("Enter 8 for a random pattern");

            System.out.println("Enter your choice ");
           ch = sc.nextInt();
//            ch = sc.next().charAt(0);
        switch (ch) {
            case 1:
            for (i = 1; i <= 5; i++) {          // rows
                for (j = i; j <= 5; j++) {      // columns
                    System.out.print(j + " ");
                }//inner loop
                System.out.println();
            }//outer loop
                break;
            case 2:
                for (i=1;i<=5;i++)
                {
                    for (j=i;j<=5;j++){
                        System.out.print(j);
                    }// inner loop
                    System.out.println();
                }//first loop
                break;
            case 3:
                for (i=1;i<=5;i++)
                {
                    for (j=i;j<=5;j++){
                        if (j%2==0){
                            System.out.print("#");
                        }
                        else {
                            System.out.print("*");
                        }
                    }//internalloop
                    System.out.println();
                }//first loop
                break;
            case 4:
                for (i=1;i<=5;i++)
                {
                    for (j=i;j<=5;j++){
                        if (j%2==0){
                            System.out.print("A");
                        }
                        else {
                            System.out.print("B");
                        }
                    } //internalloop
                    System.out.println();
                } //first loop
                break;
            case 5:
                int num = 1;

                for (i = 1; i <= 5; i++) {
                    for ( j = 1; j <= i; j++) {
                        System.out.print(num + " ");
                        num++;
                        if (num > 15) break;
                    }
                    System.out.println();
                }

                break;
            default:
                System.out.println("Wrong choice");
        }//switch
    }
}
