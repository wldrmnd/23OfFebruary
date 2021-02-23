import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZeroTaskTest {

    private ZeroTask zeroTask;

    @Before
    public void init() {
        zeroTask = ZeroTask.getInstance();
    }

    @Test
    public void simpleTest() {
        String example = "000111000010000001";
        Assert.assertEquals(6, zeroTask.calculateContinuousZeroSequence(example));
    }

    @Test
    public void emptyTest() {
        String example = "";
        Assert.assertEquals(0, zeroTask.calculateContinuousZeroSequence(example));
    }

    @Test
    public void noZeroTest() {
        String example = "111";
        Assert.assertEquals(0, zeroTask.calculateContinuousZeroSequence(example));
    }

    @Test
    public void allZeroTest() {
        String example = "00000";
        Assert.assertEquals(5, zeroTask.calculateContinuousZeroSequence(example));
    }

    @Test
    public void endsWithZeroTest() {
        String example = "11100010000";
        Assert.assertEquals(4, zeroTask.calculateContinuousZeroSequence(example));
    }
}
