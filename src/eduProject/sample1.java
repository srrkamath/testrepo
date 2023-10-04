package eduProject;

public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		four ff = new four();
		System.out.println(ff.add(5, 50));
		ff.mult(5, 50);
		int zz =  ff.add(4,4);
		System.out.println(zz + "test");

	}

}

class four
{
	public int add(int a, int b)
	{
		return a+b;
	}
	public void mult(int a, int b)
	{
		int c = a*b;
		System.out.println(c);
	}
}