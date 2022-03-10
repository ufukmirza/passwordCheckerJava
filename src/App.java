import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(solution("Foobar123"));
    }

    public static boolean solution(String S) {

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_]).+$";
        Pattern pattern = Pattern.compile(regex);

        Matcher m = pattern.matcher(S);
        return m.matches();

    }

}
