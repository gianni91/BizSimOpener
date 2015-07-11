package com.example.jjob2.bizsimopener;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Funding_Select_4 extends ActionBarActivity {


//    public final static String extra = "com.example.jjob2.bizsimopener.FUNDING_TYPE";
    public static String FUNDING_TYPE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funding__select_4);
    }


    public void bootstrapHandler(View myView) {
        FUNDING_TYPE = "Bootstrap";
        nextActivity(myView);
    }

    public void savingsHandler(View myView) {
        FUNDING_TYPE = "Savings";
        nextActivity(myView);
    }

    public void loanHandler(View myView) {
        FUNDING_TYPE = "Loan";
        nextActivity(myView);
    }

    public void nextButtonHandler(View myView) {
        FUNDING_TYPE = "Private Equity";
        nextActivity(myView);
    }

    public void nextActivity(View myView) {
        Intent myIntent = new Intent(this,Equity_Distribution_5.class);
        //        myIntent.putExtra(Title_1.extra, dummy)  ;
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
