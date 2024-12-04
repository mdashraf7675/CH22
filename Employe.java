package Exam.Exam.pract;

public class Employe 
{
	int id;
	String name;
	String department;
	int salary;
	public Employe(int id, String name, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
}
