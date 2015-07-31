package job4;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class OutputFile {
	
	public static void write(ArrayList<Things> array, String path){
		File outFile=new File(path);
		try{
			if (outFile.exists()) {
				outFile.createNewFile();
			}
			PrintWriter out=new PrintWriter(outFile);
			
			try{
				for(int i=0;i<array.size();i++){
					out.print("Name "+array.get(i).getName()+" ");
					out.print("Color "+array.get(i).getColor()+" ");
					out.print("Price "+array.get(i).getPrice()+" ");
					out.println("");
				}
			}finally{
				out.close();
			}
		}catch(IOException info){
			throw new RuntimeException(info);
		}
	}
}
