import com.csl.proxy.CglibProxy;
import com.csl.proxy.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * @author MaoLongLong
 */
class CglibProxyTest {

    @Test
    void testCglibProxy() {
        assertDoesNotThrow(() -> {
            Dog proxy = (Dog) CglibProxy.getInstance(Dog.class);
            proxy.call();
            proxy.eat();
        });
    }
}
