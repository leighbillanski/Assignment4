package OCP;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ActionTest {

    Action action = new Action();
    private double dep,with;
    private String str;

    @Before
    public void setUp() throws Exception {
        dep = action.deposit(20);
        //with = action.withdraw(20);
        str = "Name : Kay\n Surname : John\n Account Number : 012352155\n Balance : 70.0";
    }

    @Test
    public void tostring() {
        assertEquals(str,action.toString());
    }
}