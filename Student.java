package masai.oops;

public class Student {
	private String name;
	private int roll;
	private int age;
	private int marks;
	
	public void setStudentDet(String name1,int roll1,int age1,int marks1) {
		this.name=name1;
		this.roll=roll1;
		if(((age>18) && age<61 ) && (marks>0 && marks<=500)) {
			this.age=age1;
			this.marks=marks1;
		}
	}
	public void getDet() {
		System.out.print(name);
	}
	
}
