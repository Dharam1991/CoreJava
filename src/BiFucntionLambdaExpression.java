import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

/*
    @auther DharamPal
 */
public class BiFucntionLambdaExpression {
    public static void main(String[] args) {
        List<String> Strings = Arrays.asList("A", "O", "U");
        Strings.forEach(System.out::println);
        System.out.println(function.apply("abc","xyz"));
        System.out.println(functionResult().apply("785687634"));
        System.out.println(biFunction().apply("abcd","xyz"));
        System.out.println(biFunctionDifferentArgument().apply("abcd","xyz"));


    }
    public static BiFunction<String,String,String> function =(s1,s2)->
    {return s2;
    };
    public static Function<String,Integer> functionResult(){
        Function<String,Integer> function = (s)->{
            return Integer.parseInt(s);
        };
        return function;
    }
    public static BiFunction<String,String,String> biFunction(){
        BiFunction<String ,String,String> biFunction = (s1,s2)->{
            return s1.toUpperCase().concat(s2.toUpperCase());
        };
        return biFunction;
    }
    public static BiFunction<String,String,Integer> biFunctionDifferentArgument(){
        BiFunction<String,String,Integer> function = (s1,s2)->{
            String result = s1.toUpperCase().concat(s2.toUpperCase());
            return result.length();
        };
        return function;
    }
}
