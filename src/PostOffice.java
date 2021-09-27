import java.util.PriorityQueue;
import java.util.Queue;

public class PostOffice {
    Queue<Parcel> parcels;

    public PostOffice() {
        this.parcels = new PriorityQueue<>();
    }

    public void addParcel(Parcel parcel) {
        parcels.offer(parcel);
    }

    public Parcel getParcel() {
        return parcels.poll();
    }

    public void displayAllParcels() {
        for (Parcel parcel : parcels) {
            System.out.println(parcel);
        }
    }
}
