package com.example.jjob2.bizsimopener;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equity__distribution_5);

        //testing
        View myView = findViewById(R.id.editText);

//        EditText myET = (EditText)myView;
        numPartnersPlace = (EditText)myView;
        numPartnersPlace.setKeyListener(null);
        //myET.setEnabled(false);

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




        // copied from online and edited
        // http://www.mysamplecode.com/2012/06/android-edittext-text-change-listener.html
        //EditText myTextBox = (EditText) findViewById(R.id.myTextBox);

//        EditText p1Validate = (EditText) findViewById(R.id.p1_input);



        //EditText p1Validate = (EditText) findViewById(R.id.p1_input);
//        p1Validate.addTextChangedListener(new TextWatcher() {
        p1NumPlace.addTextChangedListener(new TextWatcher() {


            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
//                System.out.println("Testing 123 ");


//                TextView myOutputBox = (TextView) findViewById(R.id.you_input);

                if (p1NumPlace.getText().toString() != "") {
                    p1Num = Integer.parseInt(p1NumPlace.getText().toString());
                    System.out.println("the number is now " + p1Num);
                    update();
                }



/*
                TextView myOutputBox = (TextView) findViewById(R.id.myOutputBox);

                myOutputBox.setText(s);
                */
            }
        });

    }

    private void update() {
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
    }


    public void lessButtonHandler(View myView) {

        int numPartners = Integer.parseInt(numPartnersPlace.getText().toString());
        if(numPartners > 0) {
            numPartners -= 1;
            String newNum = ((Integer) numPartners).toString();
            numPartnersPlace.setText(newNum);
        }
        //System.out.println("testing the less button " + numPartnersPlace.getText() );

    }
    public void moreButtonHandler(View myView) {

        int numPartners = Integer.parseInt(numPartnersPlace.getText().toString());
        if(numPartners < 3) {
            numPartners += 1;
            String newNum = ((Integer) numPartners).toString();
            numPartnersPlace.setText(newNum);
        }
        //System.out.println("testing the less button " + numPartnersPlace.getText() );

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


    public void lessButtonHandler(View myView, EditText numPlace ) {

        int percent = Integer.parseInt(numPlace.getText().toString());
        if(percent > 4) {
            percent -= 5;
            String newNum = ((Integer) percent).toString();
            numPlace.setText(newNum);
        }
        //System.out.println("testing the less button " + numPartnersPlace.getText() );

    }
    public void moreButtonHandler(View myView, EditText numPlace ) {

        int percent = Integer.parseInt(numPlace.getText().toString());
        if(percent < 96) {
            percent += 5;
            String newNum = ((Integer) percent).toString();
            numPlace.setText(newNum);
        }
        //System.out.println("testing the less button " + numPartnersPlace.getText() );

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
