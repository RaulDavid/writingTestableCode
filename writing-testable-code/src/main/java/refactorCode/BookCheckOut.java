package refactorCode;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookCheckOut {

    private int accountId;
    private LocalDate beginPeriod;
    private LocalDate endPeriod;
    private List<String> books = new ArrayList<>();

    public BookCheckOut(int accountId, List<String> booksIds, LocalDate beginPeriod, LocalDate endPeriod){
        this.accountId = accountId;
        this.books = books;
        this.beginPeriod = beginPeriod;
        this.endPeriod = endPeriod;
    }

    public void validatePeriod () throws BookingDateException {
        if(this.endPeriod.isBefore(ChronoLocalDate.from(this.beginPeriod)))
            throw new BookingDateException();
    }
}
