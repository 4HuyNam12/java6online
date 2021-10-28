import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle[] listVehicle = new Vehicle[4];
        for (int i = 0; i < listVehicle.length; i++) {
            System.out.printf("Nhập thông tin phương tiện %d: \n", i + 1);
            System.out.print("Tên: ");
            String name = sc.nextLine();
            System.out.print("Id: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Vận tốc tối đa (km/h): ");
            float speed = Float.parseFloat(sc.nextLine());
            Vehicle vehicle = new Vehicle(id, name, speed);
            listVehicle[i] = vehicle;
        }
        for (Vehicle vehicle : listVehicle) {
            System.out.println(vehicle);
        }
    }
}
