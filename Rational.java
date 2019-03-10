package mypack;

public class Rational implements Number {

	private int n,d; // enumerator and dumenator 
	public Rational(int n, int d) {
		super();
		this.n = n;
		this.d = d;
	}

	@Override
	public Number add(Number num) {
		// TODO Auto-generated method stub
		Rational r=(Rational)num;
				int n=this.n*r.d + this.d*r.n; 
				int d=this.d*r.d;
				return new Rational(n,d);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(n+"/"+d);

	}

}
