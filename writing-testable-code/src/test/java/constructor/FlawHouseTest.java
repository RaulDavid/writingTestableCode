package constructor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {WritingTestableCodeApplication.class})
public class FlawHouseTest {

    @Test
    public void testThisIsReallyHard(){

        FlawHouse flawHouse = new FlawHouse();
        //Darn! I'm stuck with those Kitchen and
        // Bedroom objects created in the constructor.



    }
}
