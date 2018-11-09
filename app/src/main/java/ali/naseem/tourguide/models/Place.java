package ali.naseem.tourguide.models;

public class Place {
    private int placeName;
    private int imageResourceId;
    private int description;

    public Place(int placeName, int imageResourceId, int description) {
        this.placeName = placeName;
        this.imageResourceId = imageResourceId;
        this.description = description;
    }

    public int getPlaceName() {
        return placeName;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public int getDescription() {
        return description;
    }
}
