package Varaiables_Local;

public class LocalVariables {
	
	
	//instance varibales or class level variables
	
	int a;
	
	int b;
	
	
	public static void main(String[] args) {
		
		LocalVariables lcv=new LocalVariables();
		
		System.out.println(lcv.instance_Method(12,45));
		
	System.out.println(lcv.a);
	System.out.println(lcv.b);
	
		
	}
	
	public int instance_Method(int a,int b)
	{
		this.a=a;	
		this.b=b;
		return a+b;
		
	}
	
	
	
	
	

}
