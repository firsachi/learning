package serializables;

import java.io.Serializable;

public class Sotrudnik implements Serializable{

	private static final long serialVersionUID = 1L;
	
	protected static String finansu;
	private int id;
	private String post;
	
	public Sotrudnik(String fonansuV, String post, int id){
		finansu=fonansuV;
		this.post=post;
		this.id=id;
	}
	public String toString(){
		return "\nfinansu "+finansu+"\npost "+post+"\nid"+id;
	}
}
