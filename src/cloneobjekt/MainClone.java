package cloneobjekt;

public class MainClone {
	
	public static void main(String[] args) {
		Cars carM=new Cars();
		carM.setManufacturer("Mercedes-Benz");
		carM.setModel("A 180");
		carM.setSize(1.595);
		info(carM, "Данные до клонирования: ");
		Cars cloneCars;
		try{
			cloneCars=carM.clone();
			cloneCars.setModel("B 180");
			cloneCars.setSize(1.595);
			info(cloneCars, "Клон после изменения данные:");
		}catch(CloneNotSupportedException e){
			System.out.println("Объект не может быть клонированным.");
		}
		info(carM, "Оригинал, после манипуляций с клоном:");
	}
	
	private static void info(Cars nameCar, String inform){
		System.out.println(inform);
		System.out.println(nameCar.getManufacturer()+" "+nameCar.getModel()+" "+nameCar.getSize());
		System.out.println();
	}

}
