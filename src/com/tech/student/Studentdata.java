package com.tech.student;

import java.util.Scanner;

public class Studentdata
{
    Student student = new Student();
    Student[] std = new Student[5];

    int i = 0;
    public void addStudent(Student student) {

        std[i] = student;
        i++;

        }

    public void printDetails()
    {
        for(int i = 0;i<5;i++)
        {
            System.out.println("Name :"+std[i].getStudentName()+
                    "RollNo :"+std[i].getRollNo()+
                    "Percentage : "+std[i].getPercentage());
        }
    }
    public String searchByRollNo(int rollNo)
    {
        String res = "";
        for(int i = 0;i<5;i++)
        {
            if(std[i].getRollNo() == rollNo)
            {
                res = "Name :"+std[i].getStudentName()+
                        "RollNo :"+std[i].getRollNo()+
                        "Percentage : "+std[i].getPercentage();
                break;
            }
            else
            {
                res = "Student doesNot Exist";
            }
        }
        return res;
    }
    public void searchByPercentage(double percentage)
    {
        for (int i = 0; i <5; i++) {
            if(std[i].getPercentage() == percentage)
            {
                System.out.println("Name :"+std[i].getStudentName()+
                        ",RollNo :"+std[i].getRollNo()+
                        ",Percentage : "+std[i].getPercentage());
                break;
            }


        }
    }



}
