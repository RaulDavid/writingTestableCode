package constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bedroom {

    private String light;

    public Bedroom(@Value("on") String light) {
        this.light = light;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }
}
