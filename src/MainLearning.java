import job4.FilesTools;
import job4.Result;

public class MainLearning {
	private static String nameInpenFile="inputData.txt";
	public static void main(String[] args) {
		if(FilesTools.findFiles(nameInpenFile)){
			Result job4=new Result(nameInpenFile);
		}else{
			System.out.println("No file.");
		}
	}

}
