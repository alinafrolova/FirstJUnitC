import com.frolova.Minus;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by иарвар on 26.03.2015.
 */
public class TestMinus {
    @Test
    public void GetMinus(){
        Minus minus = new Minus();
        assertEquals(minus.exec(3,2), 1f, 1e-10);

    }
    @Test
    public void GetError(){
        Minus minus = new Minus();
        assertNotEquals(minus.exec(3, 2), 5f, 1e-10);

    }
}
