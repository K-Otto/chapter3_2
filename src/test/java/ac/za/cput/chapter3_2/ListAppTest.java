package ac.za.cput.chapter3_2;

import ac.za.cput.chapter3_2.Impl.ListAppImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class ListAppTest {
    private ListApp add1;
    private ListApp add2;

    @Before
    public void setUp() throws Exception {
        add1 = new ListAppImpl();
        add2 = new ListAppImpl();
        add2.add2(0, "1");
        add2.add2(1, "4");

        add1.add1(0, "1");
        add1.add1(1, "2");

        add1.remove("2");
        add2.remove1("4");
        add1.remove("6");
        add2.remove1("7");



    }

    @Test
    public void testAddRemove() throws Exception {

        Assert.assertEquals("[1]", add1.view2());
        Assert.assertEquals("[1]",add2.view() );
    }



    @After
    public void tearDown() throws Exception {


    }
}

