public class Human
{
	protected String name;
	protected int age;
	protected String gender;
	public Human()
	{
		super();
		System.out.println("Default Cons in Human");
	}
	public Human(String name,int age,String gender)
	{
		System.out.println("Valued Cons in Human");
		this.name=name;
		this.age=age;
		this.gender=gender;
		
	}
	public void setValues(String name,int age,String gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		
	}
	public void show()
	{
		System.out.println("Human INFO>>>>>");
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("Gender:"+this.gender);
	}
}