package th.ac.su.midterm07600443.model;

public class Auth {
    private static final String EMAIL = "aaa";
    private static final String PASSWORD = "111";

    private String mEmail;
    private String mPassword;

    public Auth(String mEmail, String mPassword) {
        this.mEmail = mEmail;
        this.mPassword = mPassword;
    }
    public boolean check(){
        if(mEmail.equals(EMAIL) && mPassword.equals(PASSWORD)){
            return true;
        }else{
            return false;
        }
    }
}
