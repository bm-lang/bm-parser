package bm.parser.target;

import org.gramat.GrammarElement;
import org.gramat.Location;
import bakasoft.json.JsonIgnore;
import bakasoft.json.JsonSerializable;

public class GElement implements JsonSerializable, GrammarElement {

    private Location beginLocation;
    private Location endLocation;

    @Override
    public void setBeginLocation(Location location) {
        this.beginLocation = location;
    }

    @JsonIgnore
    @Override
    public Location getBeginLocation() {
        return beginLocation;
    }

    @Override
    public void setEndLocation(Location location) {
        this.endLocation = location;
    }

    @JsonIgnore
    @Override
    public Location getEndLocation() {
        return endLocation;
    }
}
