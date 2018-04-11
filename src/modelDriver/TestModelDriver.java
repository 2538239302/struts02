package modelDriver;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import bean.Person;

@SuppressWarnings("all")
public class TestModelDriver extends ActionSupport implements ModelDriven<Person> {

	private Person person = new Person();;

	@Override
	public Person getModel() {
		return person;
	}

	public String test1() {
		System.out.println(person);
		return null;
	}

}
