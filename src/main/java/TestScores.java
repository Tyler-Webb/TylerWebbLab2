/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0778364
 */


import java.util.Scanner;
public class TestScores 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);    
        try
        {
            System.out.println("Enter test score number 1");
            Float testScore1 = Float.parseFloat(keyboard.nextLine());
        
            System.out.println("Enter test score number 2");
            Float testScore2 = Float.parseFloat(keyboard.nextLine());
        
            System.out.println("Enter test score number 3");
            Float testScore3 = Float.parseFloat(keyboard.nextLine());
            Float averageScore = (testScore1 + testScore2 + testScore3) / 3;
            
            String averageLetterGrade = "";
            if(averageScore < 60)
            {
                averageLetterGrade = "F";
            }
            if(averageScore >= 60 && averageScore < 70)
            {
                averageLetterGrade = "D";
            }
            if(averageScore >= 70 && averageScore < 80)
            {
                averageLetterGrade = "C";
            }
            if(averageScore >= 80 && averageScore < 90)
            {
                averageLetterGrade = "B";
            }
            if(averageScore >= 90)
            {
                averageLetterGrade = "A";
            }
            
            System.out.println("Test score 1: " + testScore1);
            System.out.println("Test score 2: " + testScore2);
            System.out.println("Test score 3: " + testScore3);
            System.out.println("Your average is " + averageScore + ": " + averageLetterGrade);
        }
        catch(NumberFormatException a)
        {
            System.out.println("That's not a valid test score");
        }
        
        
    }
}
