public class Parcel implements Comparable<Parcel> {

    private String shippingAddress;
    private ParcelType parcelType;

    public Parcel(String shippingAddress, ParcelType parcelType) {
        this.shippingAddress = shippingAddress;
        this.parcelType = parcelType;
    }

    @Override
    public int compareTo(Parcel o) {
       return parcelType.compareTo(o.parcelType);
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "shippingAddress='" + shippingAddress + '\'' +
                ", parcelType=" + parcelType +
                '}';
    }
}
