package refactorCode;

import org.mockito.Mockito;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static org.mockito.Mockito.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {WritingTestableCodeApplication.class})
public class BookCheckOutServiceTest {

    @Autowired
    BookCheckOutService bookCheckOutService;

    /*
        Neste primeiro teste é usado o contexto da aplicação.
        Mas da maneira que o código foi desenvolvido é possível mockar cada processo
        como por exemplo a busca da conta no banco, a persistência do booking 
     */


    @Test
    public void create() throws BookingException{
        //easy peasy lemon squeezy using context
        bookCheckOutService.create(
                1,
                Lists.newArrayList("1","2"),
                LocalDate.of(2018,01,01),
                LocalDate.of(2018,01,02)
        );
    }


    @Test(expected = BookingDateException.class)
    public void createWithInvalidDate() throws BookingException{

        bookCheckOutService.create(
                1,
                Lists.newArrayList("1","2"),
                LocalDate.of(2018,01,03),
                LocalDate.of(2018,01,02)
        );
    }

    @Test(expected = BookingAccountException.class)
    public void createWithInvalidAccount() throws BookingException{

        AccountService accountService = Mockito.mock(AccountService.class);


        when(accountService.getAccountById(1))
                .thenReturn(new Account(1,"test",25,true));


        bookCheckOutService.accountService = accountService;

        bookCheckOutService.create(
                1,
                Lists.newArrayList("1","2"),
                LocalDate.of(2018,01,01),
                LocalDate.of(2018,01,02)
        );
    }
}