package constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class House {

    Kitchen kitchen;

    Bedroom bedroom;

    @Autowired
    public House(Kitchen kitchen, Bedroom bedroom) {
        this.kitchen = kitchen;
        this.bedroom = bedroom;
    }




    public String getBedroomLight() {
        return bedroom.getLight();
    }
}
