package job4;

public class Shoes extends Things{
	
	private static Shoes shoes;
	
	public Shoes(String arg) {
		super("Sneakers", "red");
		setPrice(getDouble(arg)/2);
	}
	
	public static Shoes getShoes(String arg){
		if(null==shoes){
			shoes=new Shoes(arg);
		}
		return shoes;
	}

}
