package com.bharath.training.sprngbt_strtrPrjct;

import org.springframework.stereotype.Component;

@Component
public class ProductDao {
	private int Id ;
	private String Name;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	ProductDao(){
		System.out.println("created");
	}

	@Override
	public String toString() {
		return "ProductDao [Id=" + Id + ", Name=" + Name + "]";
	}
	
	

}
