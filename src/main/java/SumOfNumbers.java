
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0778364
 */
public class SumOfNumbers {
    public static void main(String[] args) 
    {
        try{
          int number = Integer.parseInt(JOptionPane.showInputDialog("Please enter an integer"));
          int sum = 0;
          
          for(int i = 1; i <= number; i++)
          {
              sum = sum + i;
          }
          System.out.println("The sum of all previous non negative numbers is: " + sum);
        }
        catch(NumberFormatException a)
        {
           System.out.println("That's not a valid integer"); 
        }
        
        
    }
}
