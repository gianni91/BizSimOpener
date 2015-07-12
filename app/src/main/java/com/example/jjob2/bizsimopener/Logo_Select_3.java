package com.example.jjob2.bizsimopener;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Logo_Select_3 extends ActionBarActivity {

//    public final static String extra = "com.example.jjob2.bizsimopener.LOGO_NUM";
    public static int LOGO_NUM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo__select_3);
        LOGO_NUM = 1;
    }

    public void shareButtonHandler(View myView) {

        Intent myIntent = new Intent(this,Funding_Select_4.class);
        //LOGO_NUM = 4;
        startActivity(myIntent);
    }

    public void i1Handler(View myView) {
        LOGO_NUM = 1;
    }
    public void i2Handler(View myView) {
        LOGO_NUM = 2;
    }
    public void i3Handler(View myView) {
        LOGO_NUM = 3;
    }
    public void i4Handler(View myView) {
        LOGO_NUM = 4;
    }
    public void i5Handler(View myView) {
        LOGO_NUM = 5;
    }
    public void i6Handler(View myView) {
        LOGO_NUM = 6;
    }
    public void i7Handler(View myView) {
        LOGO_NUM = 7;
    }
    public void i8Handler(View myView) {
        LOGO_NUM = 8;
    }
    public void i9Handler(View myView) {
        LOGO_NUM = 9;
    }
    public void i10Handler(View myView) {
        LOGO_NUM = 10;
    }
    public void i11Handler(View myView) {
        LOGO_NUM = 11;
    }
    public void i12Handler(View myView) {
        LOGO_NUM = 12;
    }
    public void i13Handler(View myView) {
        LOGO_NUM = 13;
    }
    public void i14Handler(View myView) {
        LOGO_NUM = 14;
    }
    public void i15Handler(View myView) {
        LOGO_NUM = 15;
    }
    public void i16Handler(View myView) {
        LOGO_NUM = 16;
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
