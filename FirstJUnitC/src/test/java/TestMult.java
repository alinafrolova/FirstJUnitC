import com.frolova.Mult;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by иарвар on 26.03.2015.
 */
public class TestMult {
    @Test
    public void GetMult(){
        Mult mult = new Mult();
        assertEquals(mult.exec(3,3), 9f, 1e-10);

    }
    @Test
    public void GetError(){
        Mult mult = new Mult();
        assertNotEquals(mult.exec(0, 3), 9f, 1e-10);

    }
}
