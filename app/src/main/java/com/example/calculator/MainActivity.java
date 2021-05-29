package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView disptxt,text1,text2,actionevent,equalevent;
    private Button addbtn,substractbtn,dividebtn,multiplybtn,equalbtn,dotbtn,clearbtn;
    private Button onebtn, twobtn, threebtn, fourbtn, fivebtn, sixbtn, sevenbtn, eightbtn, ninebtn, zerobtn;

    private String text1strng, text2strng,eventstrng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast.makeText(MainActivity.this,"Welcome to Mandar's Calculator !",Toast.LENGTH_LONG).show();

        init();



    }


    // ASSOCIATING REFERENCES :

    public void init(){
        onebtn = findViewById(R.id.button1);
        twobtn = findViewById(R.id.button2);
        threebtn = findViewById(R.id.button3);
        fourbtn = findViewById(R.id.button4);
        fivebtn = findViewById(R.id.button5);
        sixbtn = findViewById(R.id.button6);
        sevenbtn = findViewById(R.id.button7);
        eightbtn = findViewById(R.id.button8);
        ninebtn = findViewById(R.id.button9);
        zerobtn = findViewById(R.id.button0);

        addbtn = findViewById(R.id.buttonadd);
        substractbtn = findViewById(R.id.buttonsubstract);
        dividebtn = findViewById(R.id.buttondivision);
        multiplybtn = findViewById(R.id.buttonmultiply);
        dotbtn = findViewById(R.id.buttondot);
        equalbtn = findViewById(R.id.buttonequals);
        clearbtn = findViewById(R.id.buttonclear);

        disptxt = findViewById(R.id.display_edttxt);
        text1 = findViewById(R.id.display_text1);
        text2 = findViewById(R.id.display_text2);
        actionevent = findViewById(R.id.actioneventtext);
        equalevent = findViewById(R.id.equaleventtext);


        // ASSOCIATING LISTENERS TO BUTTONS :
        onebtn.setOnClickListener(new CombinedNumericListener());
        twobtn.setOnClickListener(new CombinedNumericListener());
        threebtn.setOnClickListener(new CombinedNumericListener());
        fourbtn.setOnClickListener(new CombinedNumericListener());
        fivebtn.setOnClickListener(new CombinedNumericListener());
        sixbtn.setOnClickListener(new CombinedNumericListener());
        sevenbtn.setOnClickListener(new CombinedNumericListener());
        eightbtn.setOnClickListener(new CombinedNumericListener());
        ninebtn.setOnClickListener(new CombinedNumericListener());
        zerobtn.setOnClickListener(new CombinedNumericListener());

        addbtn.setOnClickListener(new CombinedActionListener());
        substractbtn.setOnClickListener(new CombinedActionListener());
        multiplybtn.setOnClickListener(new CombinedActionListener());
        dividebtn.setOnClickListener(new CombinedActionListener());
        equalbtn.setOnClickListener(new CombinedActionListener());
        dotbtn.setOnClickListener(new CombinedActionListener());
        clearbtn.setOnClickListener(new CombinedActionListener());
    }



    //VOID ACTION LISTENERS:


    /*private class add_btn_listenr implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            text2strng = disptxt.getText().toString();
            text2.setText(text2strng);
            equalevent.setText("+");
            disptxt.setText("");


        }
    }


    private class substract_btn_listenr implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            text2strng = disptxt.getText().toString();
            text2.setText(text2strng);
            equalevent.setText("-");
            disptxt.setText("");

        }
    }


    private class divide_btn_listenr implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            text2strng = disptxt.getText().toString();
            text2.setText(text2strng );
            equalevent.setText("/");
            disptxt.setText("");

        }
    }


    private class multiply_btn_listenr implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            text2strng = disptxt.getText().toString();
            text2.setText(text2strng);
            equalevent.setText("*");
            disptxt.setText("");
        }
    }


    private class equal_btn_listenr implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            // FOR UI SETUP :

            text1strng = text2.getText().toString();
            text1.setText(text1strng);

            text2strng = disptxt.getText().toString();
            text2.setText(text2strng);
            eventstrng = equalevent.getText().toString();
            actionevent.setText(eventstrng);
            equalevent.setText("=");

            //TO CARRY OUT OPERATION :
            functionoperation(actionevent.getText().toString());

        }
    }

    private class dot_btn_listenr implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if (!ifcontainstext()){
                disptxt.append(".");
            }
            else
                disptxt.setText("0");
        }
    }

    private class clear_btn_listenr implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            text1.setText("");
            text2.setText("");
            disptxt.setText("");
            actionevent.setText("");
            equalevent.setText("");
        }
    }*/



    // VOID NUMERIC LISTENERS :


    /*private class btn_1_listenr implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if (!ifcontainstext()){
                disptxt.append("1");
            }
            else
            disptxt.setText("1");
        }
    }

    private class btn_2_listenr implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if (!ifcontainstext()){
                disptxt.append("2");
            }
            else
            disptxt.setText("2");
        }
    }

    private class btn_3_listenr implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if (!ifcontainstext()){
                disptxt.append("3");
            }
            else
            disptxt.setText("3");
        }
    }

    private class btn_4_listenr implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if (!ifcontainstext()){
                disptxt.append("4");
            }
            else
            disptxt.setText("4");
        }
    }

    private class btn_5_listenr implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if (!ifcontainstext()){
                disptxt.append("5");
            }
            else
            disptxt.setText("5");
        }
    }

    private class btn_6_listenr implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if (!ifcontainstext()){
                disptxt.append("6");
            }
            else
            disptxt.setText("6");
        }
    }

    private class btn_7_listenr implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if (!ifcontainstext()){
                disptxt.append("7");
            }
            else
            disptxt.setText("7");
        }
    }

    private class btn_8_listenr implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if (!ifcontainstext()){
                disptxt.append("8");
            }
            else
            disptxt.setText("8");
        }
    }

    private class btn_9_listenr implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if (!ifcontainstext()){
                disptxt.append("9");
            }
            else
            disptxt.setText("9");

        }
    }

    private class btn_0_listenr implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if (!ifcontainstext()){
                disptxt.append("0");
            }
            else
            disptxt.setText("0");

        }
    }*/


    public boolean ifcontainstext(){
        if (disptxt.getText().toString().isEmpty()){
            return true;
        }
        else return false;
    }


    public boolean actioncontainstext(){
        if (equalevent.getText().toString().isEmpty()){
            return true;
        }
        else return false;
    }





    public void functionoperation(String x){

        double Num1 = Double.parseDouble(text1.getText().toString());
        double Num2 = Double.parseDouble(text2.getText().toString());

        switch (x){

            case "+":

               double Addition = Num1+Num2;
               String sum = String.valueOf(Addition);
               disptxt.setText(sum);
               break;

            case "-":

                double Substraction = Num1-Num2;
                String substract = String.valueOf(Substraction);
                disptxt.setText(substract);
                break;

            case "/":

                double Division = Num1/Num2;
                String div = String.valueOf(Division);
                disptxt.setText(div);
                break;

            case "*":

                double Multiplication = Num1*Num2;
                String multiply = String.valueOf(Multiplication);
                disptxt.setText(multiply);
                break;

        }

    }


    @Override
    protected void onDestroy() {
        Toast.makeText(MainActivity.this,"Thank You for using our App!----Regards: Mandar H.P.",Toast.LENGTH_LONG).show();
        super.onDestroy();
    }


    // MODIFICATION :- WE CAN SET ONE LISTENER TO MANY VIEWS(BUTTONS).


    // SETTING UP COMBINED ACTION LISTENERS :


    protected class CombinedActionListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            if (v == addbtn) {
                text2strng = disptxt.getText().toString();
                text2.setText(text2strng);
                equalevent.setText("+");
                disptxt.setText("");
            }

            else if (v == substractbtn) {
                text2strng = disptxt.getText().toString();
                text2.setText(text2strng);
                equalevent.setText("-");
                disptxt.setText("");
            }

            else if (v == dividebtn) {
                text2strng = disptxt.getText().toString();
                text2.setText(text2strng );
                equalevent.setText("/");
                disptxt.setText("");
            }

            else if (v == multiplybtn){
                text2strng = disptxt.getText().toString();
                text2.setText(text2strng);
                equalevent.setText("*");
                disptxt.setText("");
            }

            else if (v == equalbtn){


                if (disptxt.getText().toString().equals("")){
                    disptxt.setText("0");
                }

                else {
                    // FOR UI SETUP :

                    text1strng = text2.getText().toString();
                    text1.setText(text1strng);

                    text2strng = disptxt.getText().toString();
                    text2.setText(text2strng);
                    eventstrng = equalevent.getText().toString();
                    actionevent.setText(eventstrng);
                    equalevent.setText("=");

                    //TO CARRY OUT OPERATION :

                    functionoperation(actionevent.getText().toString());
                }

            }

            else if (v == dotbtn){

                if (!ifcontainstext()){
                    disptxt.append(".");
                }
                else
                    disptxt.setText("0");
            }

            else if (v == clearbtn){
                text1.setText("");
                text2.setText("");
                disptxt.setText("");
                actionevent.setText("");
                equalevent.setText("");
            }

        }
    }

    // SETTING UP NUMERIC LISTENERS :

    protected class CombinedNumericListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {

            if (v == onebtn){
                if (!ifcontainstext()){
                    disptxt.append("1");
                }
                else
                    disptxt.setText("1");
            }

            else if (v == twobtn){
                if (!ifcontainstext()){
                    disptxt.append("2");
                }
                else
                    disptxt.setText("2");
            }

            else if (v == threebtn){
                if (!ifcontainstext()){
                    disptxt.append("3");
                }
                else
                    disptxt.setText("3");
            }

            else if (v == fourbtn){
                if (!ifcontainstext()){
                    disptxt.append("4");
                }
                else
                    disptxt.setText("4");
            }

            else if (v == fivebtn){
                if (!ifcontainstext()){
                    disptxt.append("5");
                }
                else
                    disptxt.setText("5");
            }

            else if (v == sixbtn){
                if (!ifcontainstext()){
                    disptxt.append("6");
                }
                else
                    disptxt.setText("6");
            }

            else if (v == sevenbtn){
                if (!ifcontainstext()){
                    disptxt.append("7");
                }
                else
                    disptxt.setText("7");
            }

            else if (v == eightbtn){
                if (!ifcontainstext()){
                    disptxt.append("8");
                }
                else
                    disptxt.setText("8");
            }

            else if (v == ninebtn){
                if (!ifcontainstext()){
                    disptxt.append("9");
                }
                else
                    disptxt.setText("9");
            }

            else if (v == zerobtn){
                if (!ifcontainstext()){
                    disptxt.append("0");
                }
                else
                    disptxt.setText("0");
            }
        }
    }


}

