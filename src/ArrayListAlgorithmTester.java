import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListAlgorithmTester
{
    public static void main(String[] args)
    {
        ArrayList<String> stringList6 = new ArrayList<String>(Arrays.asList("hello", "my", "best", "friend"));
        ArrayListAlgorithms.duplicateUpperAfter(stringList6);
        System.out.println(stringList6);
    }
}
