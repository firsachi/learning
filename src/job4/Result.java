package job4;


import java.util.ArrayList;

public class Result {
	
	//private Object[] obj;
	private ArrayList<Things> mass=new ArrayList<Things>();
	
	public Result(String path) {
		String[] array=InputFile.read(path);
		if(array.length>=1 && array[0].equals("")){
			System.out.println("The file is empty!!!");	
		}else{
			for(int i=0;i<array.length;i++){
				if(getEven(getDouble(array[i]))){
					mass.add(Books.getBook(array[i]));	
				}
				if(getThreeShare(getDouble(array[i]))){
					mass.add(Clothes.getClothes(array[i]));
				}
				if(getThreeShare(getDouble(array[i])) && getEven(getDouble(array[i]))){
					mass.add(Shoes.getShoes(array[i]));
				}
			}
			OutputFile.write(mass, "OutputData.txt");
		}
	}
	
	private boolean getThreeShare(double value){
		boolean result=false;
		if(value % 3 == 0){
			result=true;
		}
		return result;
	}
	
	private boolean getEven(double value){
		boolean result=false;
		if (value % 2 == 0){
			result=true;
		}
		return result;
	}
	
	private double getDouble(String str){
		Double resultDouble = new Double(str);
		return resultDouble;
	}
	
}
