package com.raskaytech;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        System.out.println("Enter Number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students  = new Student[numOfStudents];

        for(int n=0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();


        }
        while(1 != 0) {
            System.out.println("**************************************");
            System.out.println("**************************************");
            System.out.println("Manager");
            System.out.println("**************************************");
            System.out.println("A - Pay Tuition, B- Show Info");
            System.out.println("What would you like to do?");
            Scanner in1 = new Scanner(System.in);
            String option = in1.nextLine();
            if (option.equals("A")) {
                System.out.println("Positon of Student which you would like to pay tuition for?");
                Scanner in2 = new Scanner(System.in);
                int position1 = in2.nextInt();
                students[position1 -1].payTuition();
            } else if (option.equals("B")) {
                System.out.println("Positon of Student which you would like to display info for?");
                Scanner in3 = new Scanner(System.in);
                int position2 = in3.nextInt();
                students[position2 -1].showInfo();
            } else {
                System.out.println("Error: Not an option");
            }
        }




    }
}
