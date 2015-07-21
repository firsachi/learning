package job4;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class OutputFile {
	
	public static void write(ArrayList<Object> array, String path){
		File outFile=new File(path);
		try{
			if (outFile.exists()) {
				outFile.createNewFile();
			}
			PrintWriter out=new PrintWriter(outFile);
			
			try{
				for(int i=0;i<array.size();i++){
					out.print(array.get(i));
					if(array.get(i).equals(" ")){
						out.println("");
					}
				}
			}finally{
				out.close();
			}
		}catch(IOException info){
			throw new RuntimeException(info);
		}
	}
}
