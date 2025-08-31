import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GardenTask extends Task {
    private String gardenLocation;


    public GardenTask(String title, String description, LocalDate dueDate, String gardenLocation) {
        super(title, description, dueDate);
        this.gardenLocation = gardenLocation;
    }

    public GardenTask(String gardenLocation) {
        this.gardenLocation = gardenLocation;
    }

    public String getGardenLocation() {
        return gardenLocation;
    }

    public void setGardenLocation(String gardenLocation) {
        this.gardenLocation = gardenLocation;
    }
}
