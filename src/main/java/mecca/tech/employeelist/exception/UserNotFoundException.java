package mecca.tech.employeelist.exception;

public class UserNotFoundException extends  RuntimeException{
    public UserNotFoundException(String s) {
        super(s);
    }
}
