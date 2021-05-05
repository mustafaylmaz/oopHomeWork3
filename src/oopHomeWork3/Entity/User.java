package oopHomeWork3.Entity;

import java.util.Date;

import lombok.*;
@Getter @Setter

public class User implements BaseEntity {

	private int id;
	private String nickName;
	private String identityNumber;
	private String Name;
	private String lastName;
	private Date birthYear;
	private boolean isValid;
	


	
}
