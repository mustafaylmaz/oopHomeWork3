package oopHomeWork3.Concrete;

import oopHomeWork3.Abstract.UserCheckService;
import oopHomeWork3.Entity.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean validate(User user) {
		return true;
		
	}


}
