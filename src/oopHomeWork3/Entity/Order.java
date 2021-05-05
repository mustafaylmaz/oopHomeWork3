package oopHomeWork3.Entity;

import java.util.Date;

import lombok.*;

@Getter @Setter
public class Order {
	
	private int orderId;
	private String userName;
	private int userId;
	private int gameId;
	private String gameName;
	private Date orderDate;



}
