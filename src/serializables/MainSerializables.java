package serializables;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainSerializables {

	public static void main(String[] args) {
		Sotrudnik sot=new Sotrudnik("Bal bla bla", "Nachlnika", 13);
		File fl=new File("file.txt");
		try{
			ObjectOutputStream ostim=new ObjectOutputStream(new FileOutputStream(fl));
			ostim.writeObject(sot);
			ostim.close();
		}catch(IOException e){
			System.err.println(e);
		}
		
		Sotrudnik.finansu="U}{";
		try{
			ObjectInputStream inStim=new ObjectInputStream(new FileInputStream(fl));
			Sotrudnik uk=(Sotrudnik)inStim.readObject();
			inStim.close();
			System.out.println(uk);
		}catch(ClassNotFoundException info){
			System.out.println(info);
			System.out.println("Class not faund");
		}catch(FileNotFoundException fe){
			System.out.println(fe);
			System.out.println("Htis file not faund");
		}catch (IOException ioe) {
			System.err.println(ioe);
		}
	}

}
