package cloneobjekt;

public class MainClone {
	
	public static void main(String[] args) {
		Cars carM=new Cars();
		carM.setManufacturer("Mercedes-Benz");
		carM.setModel("A 180");
		carM.setSize(1.595);
		info(carM, "������ �� ������������: ");
		Cars cloneCars;
		try{
			cloneCars=carM.clone();
			cloneCars.setModel("B 180");
			cloneCars.setSize(1.595);
			info(cloneCars, "���� ����� ��������� ������:");
		}catch(CloneNotSupportedException e){
			System.out.println("������ �� ����� ���� �������������.");
		}
		info(carM, "��������, ����� ����������� � ������:");
	}
	
	private static void info(Cars nameCar, String inform){
		System.out.println(inform);
		System.out.println(nameCar.getManufacturer()+" "+nameCar.getModel()+" "+nameCar.getSize());
		System.out.println();
	}

}
