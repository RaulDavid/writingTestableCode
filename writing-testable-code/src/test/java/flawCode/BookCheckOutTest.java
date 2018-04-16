package flawCode;

import org.assertj.core.util.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class BookCheckOutTest {

    @Test
    public void create() {
        Account account = new Account(1,"name",25,false);
        Book book = new Book();

        try{
            BookCheckOut bookCheckOut = BookCheckOut.create(
                    account,
                    Lists.newArrayList(book),
                    LocalDate.of(2018,06,06));//bookCheckOut always has begin period with now()
            Assert.assertEquals(account, bookCheckOut.getAccount());
        }catch (BookCheckOutException e ){
            e.printStackTrace();
        }

    }

    @Test(expected = BookCheckOutException.class)
    public void createWithInvalidAccount()throws BookCheckOutException {
        Account account = new Account(1,"name",25,true);
        Book book = new Book();
        account.setHasBookCheckOut(true);
        BookCheckOut bookCheckOut = BookCheckOut.create(
                account,
                Lists.newArrayList(book),
                LocalDate.of(2018,06,06));

    }

    @Test(expected = BookCheckOutException.class)
    public void createWithInvalidDate()throws BookCheckOutException {
        Account account = new Account(1,"name",25,true);
        Book book = new Book();
        account.setHasBookCheckOut(true);
        BookCheckOut bookCheckOut = BookCheckOut.create(
                account,
                Lists.newArrayList(book),
                LocalDate.of(2018,01,01));

    }

        /*
            A validação da conta deixa o método mais acoplado.
            Para cenários distintos será retornado o mesmo erro.
            O que é necessário de account para se criar um BookCheckOut?
            Isso é apenas o teste do método BookCheckOut.create, imagina quando testar um método que chama esse..

         */
}