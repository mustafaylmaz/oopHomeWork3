package oopHomeWork3.Abstract;

import oopHomeWork3.Entity.User;

public interface OrderService {
	void order(User user);
	void cancel(User user); 
}
