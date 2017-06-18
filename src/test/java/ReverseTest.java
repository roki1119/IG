import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReverseTest {


    private static Reverse ex;

    @BeforeClass
    public static void setup() {
        ex = new Reverse();
    }

    @Test
    public void testReversingWord() {
        Assert.assertEquals(Reverse.reverse("Big brown fox jumped over a lazy dog."),
                "giB nworb xof depmuj revo a yzal .god");
        Assert.assertEquals(Reverse.reverse("ab  ba"), "ba  ab");
        Assert.assertEquals(Reverse.reverse(""), "");
        Assert.assertNotEquals(Reverse.reverse("abcd"), "dcbb");
        Assert.assertNotEquals(Reverse.reverse("ABCD"), "dcba");
    }

    @Test(expected = NullPointerException.class)
    public void testThrowNPE() {
        Reverse result = new Reverse();
        result.reverse(null);
    }
}





