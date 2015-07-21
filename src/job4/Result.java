package job4;

import java.util.ArrayList;

public class Result {
	
	//private Object[] obj;
	private ArrayList<Object> mass=new ArrayList<Object>();
	
	public Result(String path) {
		String[] array=InputFile.read(path);
		if(array.length>=1 && array[0].equals("")){
			System.out.println("The file is empty!!!");	
		}else{
			for(int i=0;i<array.length;i++){
				if(getEven(getDouble(array[i]))){
					mass.add("Обложка желтого цвета ");
					mass.add("Цена ");
					mass.add(getDouble(array[i])/2 + " ");
				}else{
					addNullArrays(3);
				}
				if(getThreeShare(getDouble(array[i]))){
					mass.add("Свитер ");
					mass.add("цвет  черный ");
					mass.add("цена "+ getDouble(array[i])/2.5 +" ");
				}else{
					addNullArrays(3);
				}
				if(getThreeShare(getDouble(array[i])) && getEven(getDouble(array[i]))){
					mass.add("Кроссовки");
					mass.add("цвет крвсный ");
					switch (i){
						case 0:
							mass.add("цена "+getDouble(array[0])/2);
						break;
						case 9:
							mass.add("цена "+getDouble(array[9])/2);
						break;
						default:
							mass.add("цена "+(getDouble(array[i-1])+getDouble(array[i+1]))/2);
						break;
					}
				}else{
					addNullArrays(3);
				}
				mass.add(" ");
				System.out.println(i);
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
	
	private void addNullArrays(int number){
		for(int i=0;i<number;i++){
			mass.add("_ ");
		}
	}
}
