package refactorCode;

import org.assertj.core.util.Lists;
import org.junit.Test;

import java.time.LocalDate;

public class BookCheckOutTest {

    @Test
    public void validatePeriod() throws BookingDateException{

        BookCheckOut bookCheckOut = new BookCheckOut(
                1,
                Lists.newArrayList("1","2"),
                LocalDate.of(2018,01,01),
                LocalDate.of(2018,01,02));
        bookCheckOut.validatePeriod();
    }


    @Test(expected = BookingDateException.class)
    public void validateInvalidPeriod() throws BookingDateException{
        BookCheckOut bookCheckOut = new BookCheckOut(
                1,
                Lists.newArrayList("1","2"),
                LocalDate.of(2018,01,03),
                LocalDate.of(2018,01,02));

        bookCheckOut.validatePeriod();
    }
}