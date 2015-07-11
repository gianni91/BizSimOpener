package com.example.jjob2.bizsimopener;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Logo_Select_3 extends ActionBarActivity {


    //    public final static String business_name = "com.example.jjob2.scripture_reference.MESSAGE";
    public final static String extra = "com.example.jjob2.bizsimopener.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo__select_3);

        Intent intent = getIntent();
        String company_name = intent.getStringExtra(Business_Name_2.extra);

        System.out.println("the company name is " + company_name);

//        TextView myTextView = new TextView(this);
//        myTextView.setTextSize(30);
//        myTextView.setText("Your favorite scripture is: " + message + " " + chapter + ":" + verse);

        //setContentView(myTextView);

    }

    public void shareButtonHandler(View myView) {

        Intent myIntent = new Intent(this,Funding_Select_4.class);  //this will change back
//        Intent myIntent = new Intent(this,Business_Name_2.class);

        String dummy = "4";

        myIntent.putExtra(extra, dummy)  ;

        startActivity(myIntent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_logo__select_3, menu);
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
