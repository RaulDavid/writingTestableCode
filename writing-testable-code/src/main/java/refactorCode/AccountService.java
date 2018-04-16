package refactorCode;

import org.springframework.stereotype.Component;

@Component
public class AccountService {
    public Account getAccountById(int accountId) {
        return new Account(accountId,"name",25,false); //could get in database
    }
}
