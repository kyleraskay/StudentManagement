package com.raskaytech;
import java.util.Scanner;
public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student() {
        Scanner in = new Scanner(System.in);
        //first Name
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();
        //last Name
        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();
        //grade
        System.out.println("1 - Freshman \n 2 - Sophomore \n 3- Junior \n 4- Senior \n Enter student grade level: ");
        this.gradeYear = in.nextInt();

        //new id for student
        setStudentID();




    }

    private void setStudentID() {
        //Grade Level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }
    public void enroll() {
        do {
            //Get inside loop, user hits 0 = end
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else { break; }
        } while (1 != 0);

    }
    public void viewBalance() {
        System.out.println("Your Balance is: $" + tuitionBalance);
    }
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    public void showInfo() {
        System.out.println("Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tuitionBalance);
    }

}
