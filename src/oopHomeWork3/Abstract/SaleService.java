package oopHomeWork3.Abstract;

import oopHomeWork3.Entity.Order;

public interface SaleService {
	void sold(Order order);
	void cancel(Order order);
}
