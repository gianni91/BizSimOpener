package com.example.jjob2.bizsimopener;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class Equity_Distribution_5 extends ActionBarActivity {

    private EditText numPartnersPlace;
    private EditText youNumPlace;
    private EditText p1NumPlace;
    private EditText p2NumPlace;
    private EditText p3NumPlace;

    private int youNum = 50;
    private int p1Num = 0;
    private int p2Num = 0;
    private int p3Num = 0;

    public static int YOU_EQUITY = 100;
    public static int P1_EQUITY = 0;
    public static int P2_EQUITY = 0;
    public static int P3_EQUITY = 0;

    public String values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equity__distribution_5);

        Intent intent = getIntent();
        View myView = findViewById(R.id.editText);

        numPartnersPlace = (EditText)myView;
        numPartnersPlace.setKeyListener(null);

        // These are getting the text positions for each distribution input
        myView = findViewById(R.id.you_input);
        youNumPlace = (EditText)myView;
        youNumPlace.setKeyListener(null);

        myView = findViewById(R.id.p1_input);
        p1NumPlace = (EditText)myView;
        p1NumPlace.setKeyListener(null);

        myView = findViewById(R.id.p2_input);
        p2NumPlace = (EditText)myView;
        p2NumPlace.setKeyListener(null);

        myView = findViewById(R.id.p3_input);
        p3NumPlace = (EditText)myView;
        p3NumPlace.setKeyListener(null);

        update();
    }

    private void update() {
        /*
        if ((youNum + p1Num + p2Num + p3Num) > 100) {

            if ((youNum + p1Num + p2Num) < 100)
                p3Num = 100 - (youNum + p1Num + p2Num);
            else {
                p3Num = 0;
                if ((youNum + p1Num) < 100) {
                    p2Num = 100 - (youNum + p1Num);
                } else {
                    p2Num = 0;
                    if (youNum < 100) {
                        p1Num = 100 - youNum;
                    } else {
                        p1Num = 0;
                        youNum = 100;
                    }
                }

                System.out.println("test 567");
            }



            youNumPlace.setText(((Integer) youNum).toString());
            //   p1NumPlace.setText(((Integer)p1Num).toString());
            p2NumPlace.setText(((Integer) p2Num).toString());
            p3NumPlace.setText(((Integer) p3Num).toString());


        }
       */
        youNum = Integer.parseInt(youNumPlace.getText().toString());
        p1Num = Integer.parseInt(p1NumPlace.getText().toString());
        p2Num = Integer.parseInt(p2NumPlace.getText().toString());
        p3Num = Integer.parseInt(p3NumPlace.getText().toString());

        YOU_EQUITY = youNum;
        P1_EQUITY = p1Num;
        P2_EQUITY = p2Num;
        P3_EQUITY = p3Num;

        System.out.println("youNum = " + youNum);
        System.out.println("p1Num = " + p1Num);
        System.out.println("p2Num = " + p2Num);
        System.out.println("p3Num = " + p3Num);

    }


    public void lessPHandler(View myView) {

        int numPartners = Integer.parseInt(numPartnersPlace.getText().toString());
        if(numPartners > 0) {
            numPartners -= 1;
            String newNum = ((Integer) numPartners).toString();
            numPartnersPlace.setText(newNum);
        }
    }
    public void morePHandler(View myView) {

        int numPartners = Integer.parseInt(numPartnersPlace.getText().toString());
        if(numPartners < 3) {
            numPartners += 1;
            String newNum = ((Integer) numPartners).toString();
            numPartnersPlace.setText(newNum);
        }
    }

    public void lessYouHandler(View myView)
    {
        lessButtonHandler(myView, youNumPlace);
    }
    public void moreYouHandler(View myView)
    {
        moreButtonHandler(myView, youNumPlace);
    }

    public void lessP1Handler(View myView)
    {
        lessButtonHandler(myView, p1NumPlace);
    }
    public void moreP1Handler(View myView)
    {
        moreButtonHandler(myView, p1NumPlace);
    }

    public void lessP2Handler(View myView)
    {
        lessButtonHandler(myView, p2NumPlace);
    }
    public void moreP2Handler(View myView)
    {
        moreButtonHandler(myView, p2NumPlace);
    }

    public void lessP3Handler(View myView)
    {
        lessButtonHandler(myView, p3NumPlace);
    }
    public void moreP3Handler(View myView)
    {
        moreButtonHandler(myView, p3NumPlace);
    }

    public void lessButtonHandler(View myView, EditText numPlace ) {

        int percent = Integer.parseInt(numPlace.getText().toString());
        if(percent > 5) {
            if(percent > 95) {
                percent -= 1;
            } else
                percent -= 5;
        } else if (percent > 0) {
            percent -= 1;
        } else
            return;
        String newNum = ((Integer) percent).toString();
        numPlace.setText(newNum);

        //System.out.println("testing the less button " + numPartnersPlace.getText() );

    }

    public void moreButtonHandler(View myView, EditText numPlace ) {

        int percent = Integer.parseInt(numPlace.getText().toString());
        if(percent < 95) {
            if(percent > 4) {
                percent += 5;

            } else
                percent += 1;
        } else if (percent < 100) {
            percent += 1;
        } else
            return;
        String newNum = ((Integer) percent).toString();
        numPlace.setText(newNum);
        //System.out.println("testing the less button " + numPartnersPlace.getText() );
    }

    public void finishButtonHandler(View myView) {
        update();
        if((youNum + p1Num + p2Num + p3Num) != 100)
            System.out.println("The total distribution must be 100%") ;
        else {
            Intent myIntent = new Intent(this,Turns_6.class);

            String yNum = ((Integer)youNum).toString();
            myIntent.putExtra(Title_1.extra, yNum);
            startActivity(myIntent);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_equity__distribution_5, menu);
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
