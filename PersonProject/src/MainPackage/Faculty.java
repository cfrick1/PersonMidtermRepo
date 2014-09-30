package MainPackage;

public class Faculty extends Employee {
	private String office_hours;
	private String rank;
	
	@Override
	public String toString(){
		return this.getClass().getSimpleName() + this.getName();
	}
}
