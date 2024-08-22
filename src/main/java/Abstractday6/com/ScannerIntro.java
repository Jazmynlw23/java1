package Abstractday6.com;

import  java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args){
   // Scanner: class is used to get user input
    Scanner sc1 = new Scanner (System.in);

   Student student1 = new Student();

        System.out.println("Enter Id:");
        int sid = sc1.nextInt();
        sc1.nextLine();
        student1.setId(sid);

        System.out.println("Enter your age:");
        int sage = sc1.nextInt();
        sc1.nextLine();
        student1.setAge(sage);

        System.out.println("Enter your gpa");
        double sgpa = sc1.nextDouble();
        sc1.nextLine();
        student1.setGpa(sgpa);

        System.out.println("Enter name:");
        String sname = sc1.nextLine();
        sc1.nextLine();
        student1.setName(sname);
    }
}
