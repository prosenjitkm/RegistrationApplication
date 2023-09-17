package action;

import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;
import pojo.UserInfo;

@Getter
@Setter
public class RegisterAction extends ActionSupport  {
	
	private static final long serialVersionUID = 1L;
	
	//private String firstName;
	//private String lastName;
	//private String gender;
	//private Integer age;
	//private String email;
	
	private UserInfo user;
	
	public String execute()
	{
		System.out.println("execute() method called");
		
		return SUCCESS;
	}
}