package oopHomeWork3.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Game implements BaseEntity{
	private int gameId;
	private String gameName;
	private String description;
	private double gamePrice;
	private String downloadLink;
	private int campaignId;



}
