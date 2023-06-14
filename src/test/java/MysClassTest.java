import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import others.MyClass;

public class MysClassTest
{
    @Test
    public void test() {
        MyClass myClass = new MyClass();
        String s = myClass.isTrue("false");
        Assertions.assertEquals(s, "nope");
    }

}
