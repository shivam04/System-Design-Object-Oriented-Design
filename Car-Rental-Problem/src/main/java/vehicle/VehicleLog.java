package vehicle;

import constants.VehicleLogType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by shivam.si on 19/01/21 12:39 pm
 */
public class VehicleLog {
    private String id;
    private VehicleLogType type;
    private String description;
    private Date creationDate;

    public boolean update() {
        return true;
    }

    public List<VehicleLogType> searchByLogType(VehicleLogType type) {
        return new ArrayList<>();
    }
}
