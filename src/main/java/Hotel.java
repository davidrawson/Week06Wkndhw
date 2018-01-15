import java.util.ArrayList;

public class Hotel {

    ArrayList<Bedroom> bedrooms;
    ArrayList<PublicRoom> publicRooms;
    ArrayList<Guest> occupants;
    ArrayList<Bedroom> vacantBedrooms;

    public Hotel(){

        bedrooms = new ArrayList<>();
        publicRooms = new ArrayList<>();
        occupants = new ArrayList<>();

        for (BedroomsList bedroomsList: BedroomsList.values() ){
            Bedroom bedroom = new Bedroom(bedroomsList.getRoomName(),bedroomsList.getCapacity(),bedroomsList.getRoomType());
            bedrooms.add(bedroom);
        }

        for (PublicRoomsList publicRoomsList: PublicRoomsList.values() ){
            PublicRoom publicRoom = new PublicRoom(publicRoomsList.getRoomName(), publicRoomsList.getCapacity(), publicRoomsList.getRoomType());
            publicRooms.add(publicRoom);
        }

    }


    public int countBedrooms() {
        return this.bedrooms.size();
    }

    public int countPublicRooms() {
        return this.publicRooms.size();
    }

    public void checkIn(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }


    public ArrayList getOccupants(Bedroom bedroom) {
        return bedroom.getOccupants();
    }

    public void checkOut(Bedroom bedroom) {
        bedroom.checkOutGuests();
    }

    public ArrayList getVacantBedrooms() {
        vacantBedrooms = new ArrayList<>();
        for (Bedroom bedroom: this.bedrooms){
            if (bedroom.guestCount() == 0){
                vacantBedrooms.add(bedroom);
            }
        }
        return this.vacantBedrooms;
    }

    public Bedroom getBedroom(String roomName) {
        for (Bedroom bedroom : this.bedrooms) {
            if (roomName == bedroom.getRoomName()) {
                return bedroom;
            }
        }
        return null;
    }
}
