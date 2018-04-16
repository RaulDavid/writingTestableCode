package refactorCode;

import org.springframework.stereotype.Component;

@Component
public class BoookCheckOutAccountValidator {
    public void isAccountValid(Account account)  throws BookingAccountException {
        if(account.hasBooking())
            throw new BookingAccountException();
    }
}
