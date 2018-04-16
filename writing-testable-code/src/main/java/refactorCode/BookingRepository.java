package refactorCode;

import org.springframework.stereotype.Component;

@Component
public class BookingRepository {
    public BookCheckOut persistBookingInDataBase(BookCheckOut bookCheckOut) {
        return bookCheckOut;//could connect on database, etc...
    }
}
