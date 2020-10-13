package demo;

public class Test {

	public static void main(String[] args) {
		AccData a=new AccData("111111",2000,1.2);
		CustomerData c=new CustomerData("Smith",a);
		
		c.getCard().dep(100);
		c.getCard().withdraw(960);
		c.getCard().withdraw(2000);

}
}