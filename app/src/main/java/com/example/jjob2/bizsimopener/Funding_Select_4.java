package com.example.jjob2.bizsimopener;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Funding_Select_4 extends ActionBarActivity {


    public final static String extra = "com.example.jjob2.scripture_reference.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funding__select_4);

        Intent intent = getIntent();
        String logoID = intent.getStringExtra(Logo_Select_3.extra);
        int logo_id = Integer.parseInt(logoID);

        System.out.println("the logo id number is " + logo_id);

    }


    public void nextButtonHandler(View myView) {

        Intent myIntent = new Intent(this,Equity_Distribution_5.class);

        String dummy = "4";
        //  int logo_ID = 4;

        myIntent.putExtra(extra, dummy)  ;

        startActivity(myIntent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_funding__select_4, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
