package MainPackage;

public class Person {
	private String name;
	private String address;
	private int phone_number;
	private int email_address;
	
	@Override
	public String toString(){
		return this.getClass().getSimpleName() + this.name;
	}
	
	public String getName(){
		return this.name;
	}
		
}
