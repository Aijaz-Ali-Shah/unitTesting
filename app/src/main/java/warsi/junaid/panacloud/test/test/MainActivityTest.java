package warsi.junaid.panacloud.test.test;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.widget.TextView;

import warsi.junaid.panacloud.test.MainActivity;
import warsi.junaid.panacloud.test.R;

/**
 * Created by panacloud on 05/11/15.
 */


public class MainActivityTest extends ActivityInstrumentationTestCase2

{


    MainActivity ma ;
    TextView tv ;

    public MainActivityTest() {

      super(MainActivity.class);



try
{
    setUp();
}
catch(Exception e )
{
    Log.d("Exception",""+e.getMessage());
}


    }


    @Override
    protected void setUp() throws Exception {

        super.setUp();
        ma = (MainActivity)getActivity();
        tv = (TextView)ma.findViewById(R.id.testTextView);
        Log.d("Test", "setted up");


        Test_label();

    }


    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        Log.d("Test", "teared down");
    }


    public void testPreconditions (){
        Log.d("Test","executing preconditions");

        assertNotNull("MainActivity is ",ma);
        assertNotNull("TextView is ", tv);



    }


    public void Test_label()
    {
        String expected = "hello";

        String current =  tv.getText().toString();


        assertEquals(expected,current);
    }



}


