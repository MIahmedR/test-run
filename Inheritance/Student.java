public class Student extends Human
{
	private String id;
	private double cgpa;
	
	public Student()
	{
		System.out.println("Default Cons in Student");
	}
	public Student(String name,int age,String gender,String id,double cgpa)
	{
		super(name,age,gender);
		System.out.println("Valued Cons in Student");
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.id=id;
		this.cgpa=cgpa;
	}
	public void setValues(String name,int age,String gender,String id,double cgpa)
	{
		super.setValues(name,age,gender);
		//this.name=name;
		//this.age=age;
		//this.gender=gender;
		this.id=id;
		this.cgpa=cgpa;
		
	}
	public void show()
	{
		
		super.show();
		System.out.println("STUDENT INFO>>>>>");
		//System.out.println("Name:"+this.name);
		//System.out.println("Age:"+this.age);
		//System.out.println("Gender:"+this.gender);
		System.out.println("Id:"+this.id);
		System.out.println("CGPA:"+this.cgpa);
	}

}