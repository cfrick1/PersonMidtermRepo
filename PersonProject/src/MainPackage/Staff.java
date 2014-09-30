package MainPackage;

public class Staff extends Employee {
	private String title;

	@Override
	public String toString(){
		return this.getClass().getSimpleName() + this.getName();
	}
}
