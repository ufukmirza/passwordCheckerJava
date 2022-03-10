import java.util.regex.Matcher;
import java.util.regex.Pattern;

//check password that it contains at least one speacial char, one number,one upper char one lower char and not contains space
//it should be at least 6 char

// comparing string  with requirements we can use regex
// (?=.*[a-z]) it checks lower char
//(?=.*[A-Z]) it checks upper char
//(?=.*\\d) it checks number
//(?=.*[!@#$%^&*()_]) it checks special char

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
