package testStaticFinal;

import com.opensymphony.xwork2.Action;

public class TestImplements implements Action {

	@Override
	public String execute() throws Exception {
		System.out.println("实现1....");
		return NONE;
	}

	public String a() {
		System.out.println("实现2....");
		return "test";
	}

}
