/**
 * 
 */
package com.example.unittest.test;

import android.test.UiThreadTest;
import android.widget.Button;

import com.example.unittest.MainActivity;
import com.example.unittest.R;

import junit.framework.TestCase;

/**
 * @author ravip
 *
 */
public class MainActivityTest extends TestCase {
	MainActivity activity;
	
	@Override
	  protected void setUp() throws Exception {
	    super.setUp();
	 
	    //setActivityInitialTouchMode(false);
	 
	  // Log.e("TEST", "came here....");
	     
	        //activity.startActivity(activity.getIntent());
	       /* Button b1 = (Button)activity.findViewById(R.id.button1);
			b1.performClick();*/
	       /* activity.runOnUiThread(new Runnable() {
				  @Override
				  public void run() {
					  try{
					  Button b1 = (Button)activity.findViewById(R.id.button1);
						b1.performClick();
					  }catch(Exception e)
					  {
						  Log.e("ERROR",e.getMessage());
					  }
				  }
				});*/
	     
	  }
	
	@UiThreadTest
	public void testAct()
	{
		System.err.println(" This is your test result....");
		
		  // Toast.makeText(activity, "Clicked on button", Toast.LENGTH_LONG).show();
	}
}
