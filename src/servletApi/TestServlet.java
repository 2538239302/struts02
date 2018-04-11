package servletApi;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

public class TestServlet {

	public String servlet1() {
		ActionContext ac = ActionContext.getContext();
		Map<String, Object> map = ac.getParameters();
		Set<String> set = map.keySet();
		for (String key : set) {
			Object object = map.get(key);
			System.out.println(key + "  :  " + Arrays.toString((String[]) object));
		}
		return null;
	}
	
	public String servlet2(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		System.out.println(name);
		System.out.println(email);
		return null;
	}
	
	public String servlet3(){
		ActionContext ac = ActionContext.getContext();
		ac.put("name", "程");
		ac.put("age", 18);
//		ac.getSession().put("age", 18);
		return "servlet3";
	}

}
