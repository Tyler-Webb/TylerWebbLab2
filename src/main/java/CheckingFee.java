import javax.swing.JOptionPane;
import java.text.NumberFormat;
/**
 *
 * @author 0778364
 */
public class CheckingFee
{
    public static void main(String[] args) 
    {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        try
        {
            
            final int baseFee = 10;
            int numberOfChecks = Integer.parseInt(JOptionPane.showInputDialog("How many checks did you write?"));
            float checkingFee = 0F;
            
            if(numberOfChecks < 20){
                checkingFee = .10F;
            }else if(numberOfChecks >= 20 && numberOfChecks <= 39){
                checkingFee = .08F;
            }else if(numberOfChecks >= 40 && numberOfChecks <= 59){
                checkingFee = .06F;
            }else if(numberOfChecks >= 60){
                checkingFee = .04F;
            }
            float totalMonthlyFee = numberOfChecks * checkingFee + baseFee;
            System.out.println("Your total monthly checking fee is: " + formatter.format(totalMonthlyFee));
        }
        catch(NumberFormatException a)
        {
            System.out.println("Enter a valid number of checks.");
        }
        
    }
}
