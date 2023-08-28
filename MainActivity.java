package com.example.calculator;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button one,two,three,four,five,six,seven,eight,nine,zero,mutli,div,mode,equal,square,root,cube,plus,negative;
    Button fact,clear,CE,XY;
    TextView Input,Output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result="";
                String a=Input.getText().toString().trim();
                result=a+"1";
                Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                Input.setText("");
                Input.setText(result);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=Input.getText().toString().trim();
                String result=a+"2";
                Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                Input.setText("");
                Input.setText(result);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                String result="";

                String a=Input.getText().toString().trim();
                     result=a+"3";
                Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                Input.setText("");
                Input.setText(result);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=Input.getText().toString().trim();
                String result=a+"4";
                Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                Input.setText("");
                Input.setText(result);
                Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                String a=Input.getText().toString().trim();
                String result=a+"5";
                Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                Input.setText("");
                Input.setText(result);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                String a=Input.getText().toString().trim();
                String result=a+"6";
                Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                Input.setText("");
                Input.setText(result);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                String a=Input.getText().toString().trim();
                String result=a+"7";
                Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                Input.setText("");
                Input.setText(result);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                String a=Input.getText().toString().trim();
                String result=a+"8";
                Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                Input.setText("");
                Input.setText(result);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                String a=Input.getText().toString().trim();
                String result=a+"9";
                Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                Input.setText("");
                Input.setText(result);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                String a=Input.getText().toString().trim();
                String result=a+"0";
                Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                Input.setText("");
                Input.setText(result);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=Input.getText().toString().trim();
                String result=a+"/";
                Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                Input.setText("");
                Input.setText(result);
            }
        });
        mutli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=Input.getText().toString().trim();
                String result=a+"*";
                Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                Input.setText("");
                Input.setText(result);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                String a=Input.getText().toString().trim();
                String result=a+"+";
                Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                Input.setText("");
                Input.setText(result);
            }
        });
        negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                String a=Input.getText().toString().trim();
                String result=a+"-";
                Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                Input.setText("");
                Input.setText(result);
            }
        });
        mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                String a=Input.getText().toString().trim();
                String result=a+"%";
                Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                Input.setText("");
                Input.setText(result);
            }
        });
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                String a=Input.getText().toString().trim();
                String result=a+"√";
                Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                Input.setText("");
                Input.setText(result);
            }
        });
        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                String a=Input.getText().toString().trim();
                String result=a+"!";
                Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                Input.setText("");
                Input.setText(result);
            }
        });
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                String a=Input.getText().toString().trim();
                String result=a+"²";
                Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                Input.setText("");
                Input.setText(result);
            }
        });
        cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                String a=Input.getText().toString().trim();
                String result=a+"³";
                Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                Input.setText("");
                Input.setText(result);
            }
        });
        XY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                String a=Input.getText().toString().trim();
                String result=a+"^";
                Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                Input.setText("");
                Input.setText(result);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(Input.getText().toString().trim().length()!=0)
                {
                    Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                    Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                    Input.setText("");
                }
            }
        });
        CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=Input.getText().toString().trim();
                if(a.length()>0)
                {
                    a=a.substring(0,a.length()-1);
                    if(a.length()==0)
                    {
                        Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                        Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                        Input.setText("");
                    }
                    else
                    {
                        Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                        Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                        Input.setText(a);
                    }
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String result1=Output.getText().toString().trim();
           if(result1.length()==0)
            {
                result1=Input.getText().toString().trim();
            }
           int length=result1.length();
           if(result1.charAt(length-1)=='0'&&result1.charAt(length-2)=='.')
           {
               result1=result1.substring(0,length-2);
           }
            Input.setText("");
            Input.setText(result1);
            Input.setTextSize(TypedValue.COMPLEX_UNIT_SP,60);
            Output.setTextSize(TypedValue.COMPLEX_UNIT_SP,25);
            Output.setText("");
            }
        });
        Input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            Output.setText("");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                String a=Input.getText().toString().trim();
                if(a.length()>0)
                {
                    double b= 0;
                    try {
                        b = EvaluateString.evaluate(a);
                    } catch (Exception e) {
                        if (e.getMessage().length()!=21) {
                            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                       }
                  }
                    String c="0"+b;
                String result=c.substring(1,c.length());
                Output.setText("");
                Output.setText(result);
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
    private void init()
    {
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        mutli=findViewById(R.id.multi);
        div=findViewById(R.id.Divide);
        mode=findViewById(R.id.mode);
        equal=findViewById(R.id.equal) ;
        square=findViewById(R.id.Square);
        root=findViewById(R.id.root);
        cube=findViewById(R.id.cube);
        plus=findViewById(R.id.plus);
        negative=findViewById(R.id.negative);
        fact=findViewById(R.id.Fact);
        clear=findViewById(R.id.C);
        CE=findViewById(R.id.CE);
        Input=findViewById(R.id.Input);
        Output=findViewById(R.id.Output);
        XY=findViewById(R.id.XY);
    }
}
