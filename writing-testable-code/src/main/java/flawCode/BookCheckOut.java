package flawCode;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookCheckOut {

    private Account account;
    private LocalDate beginPeriod = LocalDate.now();
    private LocalDate endPeriod;
    private List<Book> books = new ArrayList<>();

    public static BookCheckOut create(Account account, List<Book> books, LocalDate endPeriod) throws BookCheckOutException {

        if(isAccountValid(account) && isEndPeriodValid(endPeriod)){
            BookCheckOut bookCheckOut = new BookCheckOut();
            bookCheckOut.account = account;
            bookCheckOut.books = books;
            bookCheckOut.endPeriod = endPeriod;
            account.setHasBookCheckOut(true);
            return bookCheckOut;
        }
        throw  new BookCheckOutException();
    }

    private static boolean isAccountValid(Account account) {
        return !account.hasBookCheckOut();
    }

    private static boolean isEndPeriodValid(LocalDate endPeriod) {
        return endPeriod.isAfter(ChronoLocalDate.from(LocalDate.now()));
    }

    public Account getAccount() {
        return this.account;
    }
}
