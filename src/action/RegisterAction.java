package action;

import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterAction extends ActionSupport  {
	
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;
	private String gender;
	private Integer age;
	private String email;
	
	
	public String execute()
	{
		System.out.println("execute() method called");
		
		return SUCCESS;
	}
}