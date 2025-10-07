import Com.pluralsight.CellPhone;

import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // create a cell phone object

        CellPhone myPhone = new CellPhone("betty", "123456"," Iphone","123-456-3456"," Spectrum" );
// collect information
        System.out.println("\n Cell phone Information:");
        System.out.print("who is the owner of the phone?: ");
        String owner = sc.nextLine();
        System.out.print("What is the phone number:? ");
        String phone = sc.nextLine();
        System.out.print("What is the phone model: ");
        String model = sc.nextLine();
        System.out.print("What is the serialNumber:? ");
        String ser = sc.nextLine();
        System.out.print("who is the carrier of the phone:? ");
        String carrier = sc.nextLine();

        // set the value in to the object

       myPhone.setSerialNumber(ser) ;
       myPhone.setModel(model);
       myPhone.setCarrier(carrier);
       myPhone.setPhoneNumber(phone);
       myPhone.setOwner(owner);

       //display the store information

        System.out.println("\n---Phone Information---");
        System.out.println("Serial Number:"+myPhone.getSerialNumber ());
        System.out.print("model:"+myPhone.getModel());
        System.out.println("Carrier:"+ myPhone.getCarrier());
        System.out.println("PhoneNumber:" +myPhone.getPhoneNumber());
        System.out.println("owner: " + myPhone.getOwner());

        sc.close();
    }
}
