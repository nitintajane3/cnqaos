
public  class testinterfaceAbstract extends MyAbstractClass {

	public testinterfaceAbstract(int a) 
	{
		super(a);
		// TODO Auto-generated constructor stub
		System.out.println("testinterfaceAbstract a = " + a);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
            
       
		testinterfaceAbstract testinterfaceAbstract =  new testinterfaceAbstract(16);
		testinterfaceAbstract.d();
            
            
	}
	
	public  void d() {
	}

	public void a() {
		// TODO Auto-generated method stub
		System.out.println("class testinterfaceAbstract method a");
		
	}
	
	public void c() {
		// TODO Auto-generated method stub
		System.out.println("class testinterfaceAbstract method c");
		
	}

	public void b() {
		// TODO Auto-generated method stub
		System.out.println("class testinterfaceAbstract method b");
	}

	

}
