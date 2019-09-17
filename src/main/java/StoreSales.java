import java.util.Scanner;
/**
 *
 * @author 0778364
 */
public class StoreSales 
{
    public static void main(String[] args) 
    {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the sales from store 1");
        float storeOneSales = Float.parseFloat(keyboard.nextLine());
        System.out.println("Enter the sales from store 2");
        float storeTwoSales = Float.parseFloat(keyboard.nextLine());
        System.out.println("Enter the sales from store 3");
        float storeThreeSales = Float.parseFloat(keyboard.nextLine());
        System.out.println("Enter the sales from store 4");
        float storeFourSales = Float.parseFloat(keyboard.nextLine());
        System.out.println("Enter the sales from store 5");
        float storeFiveSales = Float.parseFloat(keyboard.nextLine());
        
        System.out.println("Store sales chart");
        
        System.out.print("Store one sales: ");
        while(storeOneSales >= 100){
            System.out.print("*");
            storeOneSales = storeOneSales - 100;
        }
        System.out.println("");
        
        System.out.print("Store two sales: ");
        while(storeTwoSales >= 100){
            System.out.print("*");
            storeTwoSales = storeTwoSales - 100;
        }
        System.out.println("");
        
        System.out.print("Store three sales: ");
        while(storeThreeSales >= 100){
            System.out.print("*");
            storeThreeSales = storeThreeSales - 100;
        }
        System.out.println("");
        
        System.out.print("Store four sales: ");
        while(storeFourSales >= 100){
            System.out.print("*");
            storeFourSales = storeFourSales - 100;
        }
        System.out.println("");
        
        System.out.print("Store one sales: ");
        while(storeFiveSales >= 100){
            System.out.print("*");
            storeFiveSales = storeFiveSales - 100;
        }

    }
}
