
package netbeans.countingnimbers;

/**
 *
 * @author halfrikan
 */
public class CountingNimbers {

    public static void main(String[] args) {
        int counter = 1; //initializing our variable
        
        while (counter <=5 ) {
            System.out.println("counting: " + counter);
            counter++;
            //in the while loop, the while continues while the condition is true.
            //it repeats until the counter equals to 6 since the condition is 
            //true until that point. then the flow will go to the next statement 
            //after and continue.
        }
        
        System.out.println("... done!");
    }
}
