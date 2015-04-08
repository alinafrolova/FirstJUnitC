import com.frolova.Plus;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by иарвар on 26.03.2015.
 */
public class TestPlus {

    @Test
    public void GetPlus(){
        Plus plus = new Plus();
        assertEquals(plus.exec(2,3), 5f, 1e-10);

    }
    @Test
    public void GetError(){
        Plus plus = new Plus();
        assertNotEquals(plus.exec(0, 3), 5f, 1e-10);

    }

   @Test
   public void GetFalse(){
       Plus plus = new Plus();
       assertFalse(!(plus.exec(2, 3) == 5));

   }

}
