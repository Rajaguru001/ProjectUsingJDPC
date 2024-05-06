package com.chainsys.model;

public class ProductPricing {
	
	
	@Override
	public String toString() {
		return "ProductPricing [nameofproduct=" + nameofproduct + ", costofproduct=" + costofproduct + ", noofusers="
				+ noofusers + ", noofwarranty=" + noofwarranty + ", productrating=" + productrating + "]";
	}
	public void display() {
		System.out.println("product No: "+nameofproduct);
		System.out.println("cost of product is: "+costofproduct);
		System.out.println("No.Of.Users: "+noofusers);
		System.out.println("product rating: "+productrating);
		System.out.println("warranty: "+noofwarranty);
	}
	//
	String nameofproduct;
	int costofproduct;
	int noofusers;
	public int noofwarranty;
	double productrating;
	public String getNameofproduct() {
		return nameofproduct;
	}
	public ProductPricing(String nameofproduct, int costofproduct, int noofusers, int noofwarranty,
			double productrating) {
		
		this.nameofproduct = nameofproduct;
		this.costofproduct = costofproduct;
		this.noofusers = noofusers;
		this.noofwarranty = noofwarranty;
		this.productrating = productrating;
		
		
	}
	public void setNameofproduct(String nameofproduct) {
		this.nameofproduct = nameofproduct;
	}
	public int getCostofproduct() {
		return costofproduct;
	}
	public void setCostofproduct(int costofproduct) {
		this.costofproduct = costofproduct;
	}
	public int getNoofusers() {
		return noofusers;
	}
	public void setNoofusers(int noofusers) {
		this.noofusers = noofusers;
	}
	public int getNoofwarranty() {
		return noofwarranty;
	}
	public void setNoofwarranty(int noofwarranty) {
		this.noofwarranty = noofwarranty;
	}
	public double getProductrating() {
		return productrating;
	}
	public void setProductrating(double productrating) {
		this.productrating = productrating;
	}

	
	

}
