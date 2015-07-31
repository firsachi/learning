package job4;

public class Things {
	private String name;
	private String color;
	private double price;
	
	public Things(String name, String color) {
		this.name=name;
		this.color=color;
	}
	
	public String getName(){
		return name;
	}
	public String getColor(){
		return color;
	}
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double priceIN){
		price=priceIN;
	}
	
	public double getDouble(String str){
		Double resultDouble = new Double(str);
		return resultDouble;
	}
	
}