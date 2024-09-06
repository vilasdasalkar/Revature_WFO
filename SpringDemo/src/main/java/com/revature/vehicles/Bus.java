package com.revature.vehicles;

public class Bus implements Vehicle {
    
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

	//default cont for setter
	public Bus() {
		
	}
	
	public Bus(DiscountService discountService) {
		this.discountService=discountService;
	}
	
	//setter
	
	public void setDiscountService(DiscountService discountService) {
		this.discountService = discountService;
	}
	
	@Override
	public String getMileage() {
		
		return "20kpl";
	}

	@Override
	public String getDiscountMessage() {
		
	 return "Bus: "+this.discountService.getDiscountMessage();
	}

}
