package oopHomeWork3.Concrete;

import oopHomeWork3.Abstract.UserCheckService;
import oopHomeWork3.Abstract.UserService;
import oopHomeWork3.Entity.User;

public class UserManager implements UserService {
	
	User user;
	UserCheckService userCheck;
	
	public UserManager(UserCheckService userCheck, User user) {
		this.user = user;
		this.userCheck = userCheck;
	}



	@Override
	public void add(User user) {
		if(userCheck.validate(user) == true)
		System.out.println("user added: " + user.getName());
	}

	@Override
	public void update(User user) {
		System.out.println("user updated: " + user.getName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("user deleted: " + user.getName());
		
	}




}
