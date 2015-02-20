package ac.za.cput.chapter3_2.Impl;

import ac.za.cput.chapter3_2.ListApp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/02/20.
 */
public class ListAppImpl implements ListApp {
    public List a = new ArrayList();

    @Override
    public List add1( int index, String obj) {

        a.add( index,obj);
        return(a);
    }
    @Override
    public void add2( int index, String k) {
        aList.add(index, k);

    }
    @Override
    public void remove( String index) {
        Boolean test = false;
        for(int i= 0; i < a.size(); i++){
            if(index == a.get(i))
            {
                test = true;
                a.remove(i);
                System.out.println("Successfully removed "+index+" from List 1");
            }

        }
        if (!test)
        {
            System.out.println( index+" Was not found in List 1");
        }


    }
    @Override
    public void remove1( String index) {
        Boolean test = false;
        for(int i= 0; i < aList.size(); i++){
            if(index == aList.get(i))
            {
                test = true;
                aList.remove(i);
                System.out.println( "Successfully removed "+index+" from List 2");
            }

        }
        if (!test)
        {
            System.out.println( index+" Was not found in List 2");
        }


    }

    @Override
    public String view() {
        return aList.toString();
    }
    @Override
    public String view2() {
        return a.toString();
    }
}

