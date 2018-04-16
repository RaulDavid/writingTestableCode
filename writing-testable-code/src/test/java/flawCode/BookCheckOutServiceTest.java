package flawCode;

import org.assertj.core.util.Lists;
import org.junit.Test;

import java.time.LocalDate;

public class BookCheckOutServiceTest {

    @Test
    public void create() {
        try {
            BookCheckOutService.create(
                    1,
                    Lists.newArrayList("1", "2"),
                    LocalDate.of(2018, 05, 8));
        }catch (BookCheckOutException e){
            e.printStackTrace();
        }
        /*
            Todos os métodos de BookCheckOutService não são mockáveis.
            A cada teste será feita a validação e a tentativa de persistir dados.
            O alto acoplamento impede a criação de cenários distintos.
            como por exemplo o retorno da conta do BD, a validação da conta, persistência do CheckOut no DB a notificação...
         */
    }
}