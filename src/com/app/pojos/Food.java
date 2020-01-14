package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "Food_Tb")
public class Food 
{
	private Integer foodId;
	private String foodType;
	private foodCategory category;
	public Food() {
		// TODO Auto-generated constructor stub
	}
	public Food(String foodCuisine, foodCategory category) {
		super();
		this.foodType = foodCuisine;
		this.category = category;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "food_id")
	public Integer getFoodId() {
		return foodId;
	}
	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}
	@Column(length = 30)
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	@Enumerated(EnumType.STRING)
	public foodCategory getCategory() {
		return category;
	}
	public void setCategory(foodCategory category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", foodType=" + foodType + ", category=" + category + "]";
	}
	
}
