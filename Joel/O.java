   interface IntegerMath {
        int operation(int a, int b);   
    }

public class O
{

 	public static void main(String[] args) {

            IntegerMath addition = (a, b) -> a + b;
            System.out.print(addition(10,2));
        }
}
