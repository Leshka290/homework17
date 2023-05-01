public class WrongPasswordException extends Exception{

    public static void isValid(String password, String confirmPassword) throws WrongPasswordException {
        //добавил проверку на то, чтобы вводились только латинские буквы и цифры
        if(password.length() > 20 || password.contains("@")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-")
                || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".")
                || password.contains(", ") || password.contains("<")
                || password.contains(">") || password.contains("?")
                || password.contains("|") || password.contains("#")
                || !(password.equals(confirmPassword))) {
            throw new WrongPasswordException();
        }
    }
}
