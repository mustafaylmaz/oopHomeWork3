package oopHomeWork3.Concrete;

import oopHomeWork3.Abstract.SaleService;
import oopHomeWork3.Entity.Order;

public class SaleManager implements SaleService {

	@Override
	public void sold(Order order) {
		System.out.println("sold added: " + order.getOrderId());
	}

	@Override
	public void cancel(Order order) {
		System.out.println("sold cancelled: " + order.getOrderId());
		
	}

}
