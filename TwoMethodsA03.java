/**
 *
 * @author Josh Freeman
 */
 
public class TwoMethodsA03 {

    /**
    * Method finds and returns the largest digit in a given number 
    * @param num the number to analyze
    * @return the largest digit
    */
     public static int getLargestDigit(int num)
     {       
         // Gets the absolute value of the number
         num = Math.abs(num);
         
         // Instantiating variable for largest number
         int largest = 0;
         
         // If the int is greater than 0
         if (num >  0) {
             
             // Run this while loop
             while (num > 0) {
                 
                 // Instantiate remainder variable
                 int remainder = num % 10;
                 
                 // Divide num value by 10
                 num = num / 10;
                 
                 if(remainder > largest) {
                     
                     // Create largest variable
                     largest = remainder;
                 }
             }
             // Return largest
            return largest;
        }
         // If num isn't greater than 0, return 0
         else
             return 0;
         
 }
     /**
      * Method calculates and returns the sum of fractions 1/2+2/3+...+ a/(a+1)
      * @param a the limit of the fraction pattern
      * @return the sum of fractions; returns -1 if the parameter value is less than 1
      */
     public static double fractionSum(int n)
     {
     // Instantiate Variables
     double num;
     double sum = 0;
     
     // If the int is greater than or equal to 1
     if (n >= 1) {
         
         // For loop for integer a
         for(double a = 1; a <= n; a++) {
             
             // Set the 2nd number of the fraction
             num = a / (a + 1);
             
             // Accumulator for the addition
             sum += num;
             
         }
         
         // Return the sum
         return sum;
     }
     
     else {
         
         // If value <1, return -1
         return -1;
     }
     }
   
   /**
    * A set of tests for getLargestDigit() method.  
    */
    public static void testGetLargestDigit()
    {
         //*** Test 1 ***// 
         if(getLargestDigit(-5)==5 && getLargestDigit(0)==0 && getLargestDigit(9)==9) System.out.println("Test 1 for getLargestDigit() PASSED");
         else System.out.println("Test 1 for getLargestDigit() Failed");
 
         //*** Test 2 ***//
         if(getLargestDigit(5565)==6 && getLargestDigit(-5565)==6 && getLargestDigit(9881)==9 && getLargestDigit(12348)==8 && getLargestDigit(33)==3) System.out.println("Test 2 for getLargestDigit() PASSED");
         else System.out.println("Test 2 for getLargestDigit() Failed");
        
    }
    
    /**
    * A set of tests for testFractionSum() method
    */
     public static void testFractionSum()
     {
         //*** Test 1 ***//
         if(fractionSum(-55)==-1 && fractionSum(0)==-1) System.out.println("Test 1 for fractionSum() PASSED");
         else System.out.println("Test 1 for fractionSum() Failed");
         
         //*** Test 2 ***//
         if(fractionSum(1)==0.5) System.out.println("Test 2 for fractionSum() PASSED");
         else System.out.println("Test 2 for fractionSum() Failed");
         
         //*** Test 3 ***//
         if(Math.round(fractionSum(5)*100.0)/100.0== 3.55) System.out.println("Test 3 for fractionSum() PASSED");
         else System.out.println("Test 3 for fractionSum() Failed");
         
         //*** Test 4 ***//
         if(Math.round(fractionSum(250)*1000.0)/1000.0== 244.895) System.out.println("Test 4 for fractionSum() PASSED");
         else System.out.println("Test 4 for fractionSum() Failed");  
         
         //*** Test 5 ***//
         if(Math.round(fractionSum(251)*1000.0)/1000.0== 245.891) System.out.println("Test 5 for fractionSum() PASSED");
         else System.out.println("Test 5 for fractionSum() Failed");  
     }
     
     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
 
         testGetLargestDigit();
         testFractionSum();
     }
 
     
 }