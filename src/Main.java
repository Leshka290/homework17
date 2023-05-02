public class Main {
    public static void main(String[] args) {
        checkException("alex", "password", "password");
    }

    public static void checkException(String login, String password, String confirmPassword) {
        try {
            if(login.length() > 20){
                throw new WrongLoginException("Слишком большая длинна логина");
            }
            if(password.length() > 20 || !(password.equals(confirmPassword))) {
                throw new WrongPasswordException("Слишком большая длинна пароля или пароли не совпадают");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e);
        }
    }
}