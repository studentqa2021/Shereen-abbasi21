package automation_selenium;



public class Smoke_test {
	

	public void getswap ( int a, int b) {
		
		a = a+b;
	    b = a-b;
	    b = a-b;
		
	    
	    System.out.println("A value aftere sawp="+a);
        System.out.println("B value aftere sawp="+b);
           		
	}
	
	
	public static void main(String[] args) {
		Smoke_test obj = new Smoke_test ();
		obj.getswap(10, 20);
		 
		
		
	}

	
	
	
	
	}
	
		
		
		
		
		
		
		
		
		

