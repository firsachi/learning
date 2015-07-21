package cloneobjekt;

public class Cars implements Cloneable{
	
	private String manufacturer;
	private String model;
	private double size;

	public String getManufacturer(){
		return manufacturer;
	}
	public String getModel(){
		return model;
	}
	public double getSize(){
		return size;
	}
	public void setManufacturer(String manufacturer){
		this.manufacturer=manufacturer;
	}
	public void setModel(String model){
		this.model=model;
	}
	public void setSize(double size){
		this.size=size;
	}
	
	public Cars clone() throws CloneNotSupportedException{
		Cars clone=(Cars)super.clone();
		return clone;
	}
}
