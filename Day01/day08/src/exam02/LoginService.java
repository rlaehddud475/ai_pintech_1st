package exam02;

public class LoginService {
    public void process(String userId, String password) throws PasswordValidationException, UserIdValidationException {
        //userId=user01, password=1234
    if (!userId.equals("user01")){

            throw new UserIdValidationException();

    }
    if(!password.equals("1234")){
        throw new PasswordValidationException();
    }
    }
}
