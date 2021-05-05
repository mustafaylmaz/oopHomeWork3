package oopHomeWork3.Entity;

import java.util.Date;

import lombok.*;

@Getter @Setter
public class Sale implements BaseEntity {

	private int saleId;
	private String saleName;
	private Date saleDate;
	private int gameId;
	private int userId;
	private int orderId;
	private String description;
	private String bill;
	
}
