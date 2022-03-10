package main.java.tasks.homework.academytasks;

import java.util.Scanner;

public class NextMonth {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String output = input.nextLine();
        switch (output){
            case "January":
                System.out.println("February");
                break;
            case "February":
                System.out.println("March");
                break;
            case "March":
                System.out.println("April");
                break;
            case "April":
                System.out.println("May");
                break;
            case "May":
                System.out.println("June");
                break;
            case "June":
                System.out.println("July");
                break;
            case "July":
                System.out.println("August");
                break;
            case "August":
                System.out.println("September");
                break;
            case "September":
                System.out.println("October");
                break;
            case "October":
                System.out.println("November");
                break;
            case "November":
                System.out.println("December");
                break;
        }
    }
}
