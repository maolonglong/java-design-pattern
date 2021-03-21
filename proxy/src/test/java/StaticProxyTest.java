import com.csl.proxy.RealSubject;
import com.csl.proxy.SubjectProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * @author MaoLongLong
 */
class StaticProxyTest {

    @Test
    void testSubjectProxy() {
        assertDoesNotThrow(() -> {
            RealSubject subject = new RealSubject();
            SubjectProxy proxy = new SubjectProxy(subject);
            for (int i = 0; i < 5; i++) {
                proxy.request();
            }
        });
    }
}
