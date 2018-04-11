package testStaticFinal;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("all")
public class TestExtends extends ActionSupport {

	@Override
	public String execute() throws Exception {

		System.out.println("继承actionSupport....");
		return SUCCESS;

	}

}
