package MainPackage;

public class Employee extends Person {
	private String office;
	private double salary;
	private String date_hired;

	@Override
	public String toString(){
		return this.getClass().getSimpleName() + this.getName();
	}
}
