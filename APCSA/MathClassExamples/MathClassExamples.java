public class MathClassExamples{
    public static void main(){
        /* 
         * This will highlight some useful methods that are provided to you
         * - Absolute Value
         * - Raising to a power
         * - Square Rooting
         * - Creating a random number
         */    

        int i = 3;
        double d = 5.7;
        int negI = -8;
        double negD = -12.4;

        System.out.println ("The absolute value of "+negI+" is:  "+ Math.abs(negI));
        System.out.println ("The absolute value of "+negD+" is:  "+ Math.abs(negD));
        System.out.println (d+" raised to the power "+i+" is:  "+ Math.pow(d,i));
        System.out.println ("The square root of "+i+" is:  "+ Math.sqrt(i));
        System.out.println ("\nNow for some Random numbers\n.\n.\n.\n");

        //this code is advanced - you don’t need to understand anything except the “Math.random()” piece. What this does is spit out 10 random #’s between [0.0, 1.0)         

        for (int j=0; j<10; j++){
            System.out.println (Math.random());
        }
        System.out.println ("This number will be a number between 10 and 15: " +(int)(Math.random() *5 + 10));
        System.out.println ("This number will be a number between 123 and 136: " +(int)(Math.random() *13 + 123));
        /* See if you can use Math.random() to do the following: 
        - create a number between 10 and 15 
        - create a number between 123 and 136

         */

        
    }
}

