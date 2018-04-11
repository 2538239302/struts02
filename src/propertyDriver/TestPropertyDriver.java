package propertyDriver;

import com.opensymphony.xwork2.ActionSupport;

import bean.Person;

@SuppressWarnings("all")
public class TestPropertyDriver extends ActionSupport{

	private String name;
	private int age;
	private Person person;

	public Person getPerson() {
		System.out.println("get person");
		return person;
	}

	public void setPerson(Person person) {
		System.out.println("set person");
		this.person = person;
	}

	public void setName(String name) {
		System.out.println("set name");
		this.name = name;
	}

	public void setAge(int age) {
		System.out.println("set age");
		this.age = age;
	}

	public String test() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(person);
		return null;
	}

}
