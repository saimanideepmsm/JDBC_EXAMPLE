package org.example;
import org.example.studentoperations.Student;
import org.example.studentoperations.studentdb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            String s = sc.next();
            if(Integer.parseInt(s)==1)
            {
                System.out.println("adding element");
                System.out.println("enter name");
                String sname = sc.next();
                System.out.println("enter phoneno");
                String sphone = sc.next();
                System.out.println("enter city");
                String scity = sc.next();
                Student st = new Student(sname,sphone,scity);
                boolean f = studentdb.insert(st);
                if(f)
                {
                    System.out.println("successfull");
                }
                else
                {
                    System.out.println("failed uploading to db");
                }
            }
            else if(Integer.parseInt(s)==2)
            {
                System.out.println("deleting element");
                System.out.println("enter user id");
                int userid =  sc.nextInt();
                boolean f = studentdb.delete(userid);
                if(f)
                {
                    System.out.println("successfull");
                }
                else
                {
                    System.out.println("failed uploading to db");
                }
            }
            else if(Integer.parseInt(s)==3)
            {
                System.out.println("display element");

            }
            else if(Integer.parseInt(s)==4)
            {
                System.out.println("exit");
                break;
            }
        }
        System.out.println("over");
    }
}