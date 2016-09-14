package userinput;

import java.util.Scanner;
        
public class UserInput {
    
    public static void main(String[] args) {
        System.out.println("Please enter the following information so I can sell it for profit!");
        System.out.println("Frist Name: ");
        Scanner fname = new Scanner(System.in);
        String answer = fname.nextLine();
        System.out.println("Second Name: ");
        Scanner sname = new Scanner(System.in);
        String answertwo = sname.nextLine();
        System.out.println("Year(10-13): ");
        Scanner year = new Scanner(System.in);
        String answerthree = year.nextLine();
        System.out.println("Student ID: ");
        Scanner ID = new Scanner(System.in);
        String answerfour = ID.nextLine();
        System.out.println("Login: ");
        Scanner login = new Scanner(System.in);
        String answerfive = login.nextLine();
        System.out.println("Estimated Level: ");
        Scanner level = new Scanner(System.in);
        String answersix = level.nextLine();
        
        System.out.println("Your information: ");
        System.out.println("    Login: "+answerfive);
        System.out.println("    ID: "+answerfour);
        System.out.println("    Name: "+answertwo +","+answer);
        System.out.println("    Expected Level: "+answersix);
        System.out.println("    Year: "+answerthree);
        
        
    
    }
    
}
