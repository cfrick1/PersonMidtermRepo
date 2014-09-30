package MainPackage;

public class Student extends Person {
	private String class_status;
	
	@Override
	public String toString(){
		return this.getClass().getSimpleName() + this.getName();
	}
}
