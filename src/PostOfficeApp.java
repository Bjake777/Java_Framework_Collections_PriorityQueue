import java.util.Scanner;

public class PostOfficeApp {
    public static void main(String[] args) {
        int decision = 0;
        PostOffice postOffice = new PostOffice();
        Scanner scanner = new Scanner(System.in);
        int role = 0;
        do {

            System.out.println("choose role");
            System.out.println("client press 1");
            System.out.println("postman press 2");
            role = scanner.nextInt();

            System.out.println("select options");
            System.out.println("add parcel - press 1");
            System.out.println("get parcel - press 2");
            System.out.println("display all parcels - press 3");

            System.out.println("close the program - press 0");
            decision = scanner.nextInt();

            switch (decision) {
                case 1:
                    if (role != 1) {
                        System.out.println("operacja nie dozwolona");
                        break;
                    }
                        System.out.println("enter shipping address");
                        scanner.nextLine();
                        String shippingAddress = scanner.nextLine();

                        System.out.println("choose parcel type");
                        System.out.println("priority - press 1");
                        System.out.println("registered - press 2");
                        System.out.println("normal - press any key");
                        decision = scanner.nextInt();

                        ParcelType parcelType;

                        switch (decision) {
                            case 1:
                                parcelType = ParcelType.PRIORITY;
                                break;
                            case 2:
                                parcelType = ParcelType.REGISTERED;
                                break;
                            default:
                                parcelType = ParcelType.NORMAL;
                                break;
                        }

                        Parcel parcel = new Parcel(shippingAddress, parcelType);
                        postOffice.addParcel(parcel);
                    break;
                case 2:
                    if(role != 2){
                        System.out.println("operacja nie dozwolona");
                        break;
                    }
                    System.out.println(postOffice.getParcel());
                    break;
                case 3:
                    postOffice.displayAllParcels();
            }
        } while (decision != 0);
    }
}
