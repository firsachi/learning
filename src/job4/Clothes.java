package job4;

public class Clothes extends Things{
	
	private static Clothes clothes;
	
	public Clothes(String arg) {
		super("sweater", "black");
		setPrice(getDouble(arg)/2.5);
		
	}
	
	public static Clothes getClothes(String arg){
		if(null==clothes){
			clothes=new Clothes(arg);
		}
		return clothes;
	}

}
