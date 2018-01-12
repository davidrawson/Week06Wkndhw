import java.util.ArrayList;

public class Hotel {

    ArrayList<Bedroom> bedrooms;

    public Hotel(){

        bedrooms = new ArrayList<>();

        for (BedroomsEnum bedroomsEnum: BedroomsEnum.values() ){
            Bedroom bedroom = new Bedroom(bedroomsEnum.getRoomName(),bedroomsEnum.getCapacity(),bedroomsEnum.getRoomType());
            bedrooms.add(bedroom);
        }

    }








    public int countBedrooms() {
        return bedrooms.size();
    }
}
