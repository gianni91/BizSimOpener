package com.example.jjob2.bizsimopener;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class Business_Name_2 extends ActionBarActivity {

    public final static String extra = "com.example.jjob2.bizsimopener.COMPANY_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business__name_2);
    }

    public void shareButtonHandler(View myView) {

        Intent myIntent = new Intent(this, Logo_Select_3.class);

        EditText compName = (EditText) findViewById(R.id.company_name);
        String sCompName = compName.getText().toString();

        myIntent.putExtra(extra, sCompName);
        startActivity(myIntent);
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
