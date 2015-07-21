package job4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputFile {
	
	public static String[] read(String path){
		try {
			InputStream inputValues=new FileInputStream(path);
			try {
				int data=inputValues.read();
				String listValues=new String();
				while (data !=-1){
					listValues+=(char) data;
					data = inputValues.read();
				}
				inputValues.close();
				String[] array=listValues.split(";");
				return array;
			} catch (IOException info) {
				info.printStackTrace();
			}
		} catch (FileNotFoundException info) {
			info.printStackTrace();
		}
		return null;
	}
}
