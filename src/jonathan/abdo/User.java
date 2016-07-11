package jonathan.abdo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
	
	@NotNull(message = "Please enter a name.")
	@Size(min=1, max=20, message = "Max characters for your name is 20.")
	@Pattern(regexp="[a-zA-Z]+", message="Your name contains invalid characters.")
	private String name;
	
	@Min(value=1, message = "Please enter an age 1-150.")
	@Max(value=150, message = "Please enter an age 1-150.")
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
