/*
 * Andrew Thompson
 * September 19, 2018
 * This program outputs a bill of sale
 */

package billofsale;

/**
 *
 * @author antho6229
 */
public class BillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double price = 12.49;
        double payment = 20.00;
        double taxPercent = 0.13;
        double taxAmount = 0;
        double total = 0;
        double change = 0;
        
        taxAmount = Math.round((price * taxPercent*100));
        taxAmount = (int)taxAmount;
        taxAmount /= 100;
        
        total = (price + taxAmount);

        change = Math.round((payment - total)*100);
        change = (int)change;
        change /= 100;
        
        System.out.println("Price of item: " + price);
        System.out.println("13% HST: " + taxAmount);
        System.out.println("\nTotal: " + total);
        System.out.println("\nChange: " + change);
        
    }
    
}
