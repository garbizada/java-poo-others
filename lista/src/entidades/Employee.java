package entidades;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	
	public Employee() {
		
	}
	
	public Employee(Integer id, String name, Double salary) {
		this.setId(id);
		this.setName(name);
		this.setSalary(salary);
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}

	public void increaseSalary(double percentage) {
		salary += salary * percentage /100.0;
	}
	
	
	
	

}
