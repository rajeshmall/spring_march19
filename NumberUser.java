package mypack;

public class NumberUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Number n1=new Complex(2, 3);
		//Number n2=new Complex(4,5);
		Number n1=new Rational(2, 3);
		Number n2=new Rational(4,5);

		Number n3=n1.add(n2);
		System.out.print("First Number is : ");
		n1.display();
		System.out.print("Second Number is : ");
		n2.display();
		System.out.print("There sum is : ");
		n3.display();


	}

}
