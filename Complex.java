package mypack;

public class Complex implements Number {

	private int r,i;
	
	public Complex(int r, int i) {
		super();
		this.r = r;
		this.i = i;
	}
	@Override
	public void display() {
		System.out.println(r+"+"+i+"i");

	}
	@Override
	public Number add(Number n) {
		// TODO Auto-generated method stub
		Complex c=(Complex)n;
		int r=this.r+c.r; // real part add
		int i=this.i+c.i; // imgary part add
		return new Complex(r,i);
	}

	

}
