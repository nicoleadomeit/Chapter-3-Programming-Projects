public class DoStuff{
    public static void main(){
        int a = 11;
        int b = 3;
        int c = 0;
        System.out.println (method1(a,b));
        method2(a,b);
        method3(a,b);

        System.out.println(11.0/3);
        //System.out.println(11/0);
    }

    public static int method1(int i, int j){
        return 5*i+j;
    }

    public static void method2(int i, int j){
        System.out.println("The sum of "+i+" and "+j+" is "+i+j);
    }

    public static void method3(int i, int j){
        System.out.println("The sum of "+i+" and "+j+" is "+(i+j));
    }

}
/* Double line comment
 * Double = decimal nmber
 * double y = 3.7
*/