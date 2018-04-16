package flawCode;


import org.assertj.core.util.Lists;
import java.time.LocalDate;
import java.util.List;

public class BookCheckOutService {


    public static BookCheckOut create(int accountId, List<String> booksIds, LocalDate endPeriod) throws BookCheckOutException {
        Account account  = getAccountById(accountId);
        List<Book> books = getBooksByIds(booksIds);
        BookCheckOut bookCheckOut = BookCheckOut.create(account,books,endPeriod);
        bookCheckOut =  persistBookingInDataBase(bookCheckOut);
        notifyBookingCreation();
        return bookCheckOut;
    }

    private static void notifyBookingCreation() {
    }

    private static BookCheckOut persistBookingInDataBase(BookCheckOut bookCheckOut) {
        return bookCheckOut;//could connect on database, etc...
    }

    private static List<Book> getBooksByIds(List<String> booksIds) {
        return  Lists.newArrayList(new Book()); //could get in database
    }

    private static Account getAccountById(int accountId) {
        return new Account(accountId,"name",25,false); //could get in database; //could get in database
    }
}
