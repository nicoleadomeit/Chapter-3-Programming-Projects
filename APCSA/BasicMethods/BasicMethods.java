public class BasicMethods {
    public static void main(){
        //declaring variables & assignment statements
        int x;
        x = 2;
        int y = 3;

        System.out.println (x+y);
        System.out.println(add (x,y));
        System.out.println(subtract(12,4));
        System.out.println(multiply(x,y));
        System.out.println(divide(x,y));
    }
    //end of main method
    private static int add(int i, int j){
        return i+j;
    }

    private static int subtract(int i, int j){
        return i-j;
    }

    private static int multiply(int i, int j){
        return i*j;
    }

    private static int divide(int i, int j){
        return i/j;
    }
}
    //int - type of data this method returns to output
    //add - name of method
    //( ) - in parentheses, type of data this method expects as inputs
    //main - name of method
    //void - expects no output; nothing is returned
    //scope - where we can reference different variables (letters)
    //only variables that can be referenced here are i and j, not x and y