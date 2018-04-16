package constructor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {WritingTestableCodeApplication.class})
public class HouseTest{

    @Autowired
    House house;

    @Test
    public void testThisIsEasyAndFlexible(){

        System.out.println(house.getBedroomLight());

        Kitchen kitchen = new Kitchen();
        Bedroom bedroom = new Bedroom("off");
        House house = new House(kitchen, bedroom);

        System.out.println(house.getBedroomLight());
    }

}
