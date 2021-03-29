import java.util.*;

public class Dealership
{
        //what variables do we need?
        public static void main(String[ ] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>(5);
        
        
      //ask user for 5 numbers
        System.out.println("Please enter 5 numbers: ");
        Scanner in = new Scanner(System.in);
        for(int i=0; i< 5; i++) {
            myNumbers.add(in.nextInt());
            System.out.println(myNumbers.get(i));
            
        }
        int sum = 0;
        int product= 1;
        int smallest= 0;
        int largest = 0;
         
       //find sum
        for (int i=0; i<5; i++) {
            sum += myNumbers.get(i);
            product *= myNumbers.get(i);
           
        }
        
        //find product
        
        //find largest
        
        
        //find smallest
        System.out.println("Sum: "+ sum);
        System.out.println("Product " + product); 
        
        for (int i=0; i<4; i++) {
            if (myNumbers.get(i) < myNumbers.get(i+1)) {
            smallest = myNumbers.get(i);
            
            } else {
                largest = myNumbers.size;
            }
        }
         System.out.println("Smallest "+ smallest);
         System.out.println("Largest "+ largest);
    }

}
