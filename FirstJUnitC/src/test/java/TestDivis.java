import com.frolova.Divis;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by иарвар on 26.03.2015.
 */
public class TestDivis {
    @Test
    public void GetDivis() throws Exception {
        Divis divis = new Divis();
        assertEquals(divis.exec(9,3), 3f, 1e-10);

    }
    @Test
    public void GetError() throws Exception {
        Divis divis = new Divis();
        assertEquals(divis.exec(0,3), 3f, 1e-10);

    }
    @Test
    public void GetNull() throws Exception {
        Divis divis = new Divis();
        assertNotEquals(divis.exec(3,0), 3f, 1e-10);

    }
}
