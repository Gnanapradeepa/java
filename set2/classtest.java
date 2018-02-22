package eh;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 try
        {
            System.out.printf("1");
            int data = 5 / 0;
        }
        catch(ArithmeticException e)
        {
            System.out.printf("2");
            System.exit(0);
        }
        finally
        {
            System.out.printf("3");
        }
        System.out.printf("4");
    }
}
