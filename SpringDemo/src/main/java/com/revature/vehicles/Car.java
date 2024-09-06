package com.revature.vehicles;

public class Car implements Vehicle {
	
	private DiscountService discountService;
	private String brandName;
	private Double mrp;
	
	public Double getMrp() {
		return mrp;
	}

	public void setMrp(Double mrp) {
		this.mrp = mrp;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	//for setter default constructor
	public Car() {
		
	}
	
	public Car(DiscountService discountService) {
		this.discountService=discountService;
	}
	
	//setter
	public void setDiscountService(DiscountService discountService) {
		this.discountService = discountService;
	}


	@Override
	public String getMileage() {
		// TODO Auto-generated method stub
		return "30kpl";
	}

	@Override
	public String getDiscountMessage() {
		return "Car:"+this.discountService.getDiscountMessage();
	}
	

}
