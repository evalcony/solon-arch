import org.junit.runner.RunWith;
import org.noear.solon.test.SolonJUnit4ClassRunner;
import org.noear.solon.test.SolonTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(SolonJUnit4ClassRunner.class)
@SolonTest(DemoTest.class)
public class DemoTest {
    static Logger log = LoggerFactory.getLogger(DemoTest.class);
}
