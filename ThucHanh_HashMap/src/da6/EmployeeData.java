package da6;

public class EmployeeData {
	String name;
	long salary;
	public EmployeeData(String nm) {
		name = nm;
		salary = 5600;
	}
	@Override
	public String toString() {
		return "EmployeeData [name=" + name + ", salary=" + salary + "]";
	}
}
