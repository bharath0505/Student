package com.tech.student;

import java.util.Scanner;

public class Teststudent
{
    public static void main(String[] args)
    {
        Studentdata stddata = new Studentdata();



        for(int i = 0;i<5;i++)
        {
            Scanner sc = new Scanner(System.in);
            Student student = new Student();
            System.out.print("Enter the student name :");
            student.setStudentName(sc.nextLine());
            System.out.print("Enter the RollNo:");
            student.setRollNo(sc.nextInt());
            System.out.print("Enter the percentage :");
            student.setPercentage(sc.nextDouble());
            stddata.addStudent(student);

        }
        stddata.printDetails();
       System.out.println(stddata.searchByRollNo(1));
       stddata.searchByPercentage(89);







    }
}
