package Exceptions;

public class UserDTONotFoundException extends Exception {
    public UserDTONotFoundException(int id) {
        super("Not found:"+String.valueOf(id));

    }
}
