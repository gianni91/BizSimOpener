package com.example.jjob2.bizsimopener;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Turns_6 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turns_6);

        Intent intent = getIntent();
        String stuff = intent.getStringExtra(Title_1.extra);
       // System.out.println("the company name is " + stuff);
        System.out.println("the company name is " + Business_Name_2.COMPANY_NAME);
        System.out.println("the logo id is " + Logo_Select_3.LOGO_NUM);
        System.out.println("The funding is " + Funding_Select_4.FUNDING_TYPE);

        System.out.println("You have " + Equity_Distribution_5.YOU_EQUITY + " % of the company");
        System.out.println("Partner 1 has " + Equity_Distribution_5.P1_EQUITY + " % of the company");
        System.out.println("Partner 2 has " + Equity_Distribution_5.P2_EQUITY + " % of the company");
        System.out.println("Partner 3 has " + Equity_Distribution_5.P3_EQUITY + " % of the company");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_turns_6, menu);
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
