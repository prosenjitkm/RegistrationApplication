package pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter // Lombok annotation to generate getter methods for all fields
@Setter // Lombok annotation to generate setter methods for all fields
@NoArgsConstructor
@AllArgsConstructor // Lombok annotation to generate a constructor with all arguments
@ToString // Lombok annotation to generate a toString method
public class UserInfo {
	
	private String firstName;
	private String lastName;
	private String gender;
	private Integer age;
	private String email;

}
