package refactorCode;


import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class BookCheckOutService {

    AccountService accountService;

    NotificationService notificationService;

    BookingRepository repository;

    BoookCheckOutAccountValidator boookCheckOutAccountValidator;

    @Autowired
    public BookCheckOutService(AccountService accountService,
                               NotificationService notificationService,
                               BookingRepository repository,
                               BoookCheckOutAccountValidator boookCheckOutAccountValidator){
        this.accountService = accountService;
        this.notificationService = notificationService;
        this.repository = repository;
        this.boookCheckOutAccountValidator = boookCheckOutAccountValidator;
    }


    public BookCheckOut create(int accountId, List<String> booksIds, LocalDate beginPeriod, LocalDate endPeriod) throws BookingException {
        Account account  = accountService.getAccountById(accountId);
        boookCheckOutAccountValidator.isAccountValid(account);
        BookCheckOut bookCheckOut = new BookCheckOut(accountId,booksIds,beginPeriod,endPeriod);
        bookCheckOut.validatePeriod();
        bookCheckOut =  repository.persistBookingInDataBase(bookCheckOut);
        notificationService.notifyBookingCreation();
        return bookCheckOut;
    }


    private List<Book> getBooksByIds(List<String> booksIds) {
        return  Lists.newArrayList(new Book()); //could get in database
    }


}
