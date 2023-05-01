public class WrongLoginException extends Exception{

    public static void isValid(String login) throws WrongLoginException {
        //добавил проверку на то, чтобы вводились только латинские буквы и цифры
        if(login.length() > 20 || (login.contains("@")
                || login.contains("!") || login.contains("~")
                || login.contains("$") || login.contains("%")
                || login.contains("^") || login.contains("&")
                || login.contains("*") || login.contains("(")
                || login.contains(")") || login.contains("-")
                || login.contains("+") || login.contains("/")
                || login.contains(":") || login.contains(".")
                || login.contains(", ") || login.contains("<")
                || login.contains(">") || login.contains("?")
                || login.contains("|") || login.contains("#"))){
            throw new WrongLoginException();
        }
    }
}
