package ac.za.cput.chapter3_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/02/20.
 */
public interface ListApp {
    List aList = new ArrayList();
    List add1 (int index, String obj);
    void add2(int index, String k);
    void remove(String index);
    public String view();
    public String view2();
    void remove1( String index);
}


