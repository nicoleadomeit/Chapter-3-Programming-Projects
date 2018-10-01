/*No user input. Use loops to create a multiplication table of #’s 1-12.
Output should be formatted nicely!*/
public class MultiplicationTable {
    public static void main(){
    int x;
    int y;
    int sum;
    for (x = 1; x <= 12; ++x) {
        for (y = 1; y <= 12; ++y) {
            sum = x * y;
            System.out.print(sum);
            if(sum < 10){
                System.out.print("    ");
        }else if(sum >= 100){
            System.out.print("  ");
        }else if(sum >= 10){
            System.out.print("   ");
            }
        }
        System.out.println();
    }
}
}
