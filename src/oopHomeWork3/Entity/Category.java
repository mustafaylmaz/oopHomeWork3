package oopHomeWork3.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Category implements BaseEntity{
	private int categoryId;
	private String categoryName;
	private String categoryDescription;

}
