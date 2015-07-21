package job4;

import java.io.File;

public class FilesTools {
	private static File insertFile;
	
	public static boolean findFiles(String pach){
		boolean result=false;
		insertFile=new File(pach);
		if(insertFile.exists()) result=true;
		return result;
	}

}
