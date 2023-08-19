package constructor_injection_sample1;

public class Employe {
	private int id;  
	private String name;  
//	  
//	public void Employee() {System.out.println("def cons");}  
//	  
	public Employe (int Id) 
	{this.id = Id;
	System.out.println(Id);
	}  
	
	public  Employe (String name) {  this.name = name;}  
	
	public  Employe (int id, String name) {  
		this.id = id;  
		this.name = name;  
	}  
	  
	public void show(){  
	    System.out.println(id+" "+name);  
	}  
}
