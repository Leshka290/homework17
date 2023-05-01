public class Main {
    public static void main(String[] args) {
        checkException("alex@", "password", "password");
    }

    public static void checkException(String login, String password, String confirmPassword) {
        try {
            WrongLoginException.isValid(login);
            WrongPasswordException.isValid(password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
    }
}