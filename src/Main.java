public class Main {
    public static void main(String[] args) {
        try {
            checkException("alex", "password", "password");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e);
        }
    }

    public static void checkException(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        boolean wrongSymbol = login.contains("@")
                || login.contains("!") || login.contains("~")
                || login.contains("$") || login.contains("%")
                || login.contains("^") || login.contains("&")
                || login.contains("*") || login.contains("(")
                || login.contains(")") || login.contains("-")
                || login.contains("+") || login.contains("/")
                || login.contains(":") || login.contains(".")
                || login.contains(", ") || login.contains("<")
                || login.contains(">") || login.contains("?")
                || login.contains("|") || login.contains("#");

        if (login.length() > 20|| wrongSymbol) {
            throw new WrongLoginException("Некорректный логин");
        }

        if (password.length() > 20 || !(password.equals(confirmPassword))|| wrongSymbol) {
            throw new WrongPasswordException("Некорректный пароль или пароли не совпадают");
        }
    }
}