package job4;

public class Books extends Things{
	
	private static Books book;
	
	private Books(String arg) {
		super("Book", "yellow");
		setPrice(getDouble(arg)/2);
	}

	
	public static Books getBook(String arg){
		if(null==book){
			book=new Books(arg);
		}
		return book;
	}
}
