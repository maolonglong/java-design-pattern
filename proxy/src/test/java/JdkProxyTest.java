import com.csl.proxy.Animal;
import com.csl.proxy.Cat;
import com.csl.proxy.JdkProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * @author MaoLongLong
 */
class JdkProxyTest {

    @Test
    void testJdkProxy() {
        assertDoesNotThrow(() -> {
            Cat cat = new Cat();
            Animal proxy = (Animal) JdkProxy.getInstance(cat);
            proxy.call();
            proxy.eat();
        });
    }
}
