/*Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
    totalSalary = basic + hra + da + allow – pf
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.*/


package J_1_Fundamentals;

import java.util.Scanner;
import java.lang.Math;

public class J07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int basic = s.nextInt();
        char grade = s.next().charAt(0);
        int allow = 0;

        double totalsalary = 0;

        if (grade == 'A') 
        {
            allow = 1700;
        } 
        else if (grade == 'B') 
        {
            allow = 1500;
        }
        else if (grade >= 67 && grade <= 90) 
        {
            allow = 1300;
        }
        System.out.println(allow);
        totalsalary = (basic + (0.2 * basic) + (0.5 * basic) + allow - (0.11 * basic));
        System.out.println(Math.round(totalsalary));
        s.close();
    }
}