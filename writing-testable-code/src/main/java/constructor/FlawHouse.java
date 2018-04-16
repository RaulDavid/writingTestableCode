package constructor;

public class FlawHouse {

    Kitchen kitchen = new Kitchen();
    Bedroom bedroom;

    FlawHouse() {
        bedroom = new Bedroom("on");
    }
}
