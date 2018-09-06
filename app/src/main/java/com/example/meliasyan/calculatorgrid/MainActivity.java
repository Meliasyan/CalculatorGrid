package com.example.meliasyan.calculatorgrid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.example.meliasyan.calculatorGrid.R;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity
{
    Button button_clear, button_percentage, button_divide, button_multiply, button_seven, button_eight, button_nine, button_minus, button_four,
    button_five, button_six, button_plus, button_one, button_two, button_three, button_equal, button_dot, button_zero;

    TextView textViewResult;

    TextView textViewInput;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_clear = findViewById(R.id.button_clear);
        button_percentage = findViewById(R.id.button_percentage);
        button_multiply = findViewById(R.id.button_multiply);
        button_seven = findViewById(R.id.button_seven);
        button_eight = findViewById(R.id.button_eight);
        button_nine = findViewById(R.id.button_nine);
        button_minus = findViewById(R.id.button_minus);
        button_four = findViewById(R.id.button_four);
        button_five = findViewById(R.id.button_five);
        button_six = findViewById(R.id.button_six);
        button_plus = findViewById(R.id.button_plus);
        button_one = findViewById(R.id.button_one);
        button_two = findViewById(R.id.button_two);
        button_three = findViewById(R.id.button_three);
        button_equal = findViewById(R.id.button_equal);
        button_divide = findViewById(R.id.button_divide);
        button_dot = findViewById(R.id.button_dot);
        button_zero = findViewById(R.id.button_zero);
       // button_doubleZero = findViewById(R.id.button_doubleZero);

        textViewInput = findViewById(R.id.tv_userInput);
        textViewResult = findViewById(R.id.tv_userResult);

        final DecimalFormat format = new DecimalFormat("0.#");

        button_clear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textViewResult.setText("");
                textViewInput.setText("");
            }

        });


        button_zero.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textViewInput.setText(textViewInput.getText() + "0");
                double result = eval(textViewInput.getText().toString());
                textViewResult.setText(removeTrailingZeros(result));
            }
        });

//        button_doubleZero.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                textViewInput.setText(textViewInput.getText() + "00");
//                double result = eval(textViewInput.getText().toString());
//                textViewInput.setText(removeTrailingZeros(result));
//            }
//        });

        button_one.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textViewInput.setText(textViewInput.getText() + "1");
                double result = eval(textViewInput.getText().toString());
                textViewResult.setText(removeTrailingZeros(result));
            }
        });

        button_two.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textViewInput.setText(textViewInput.getText() + "2");
                double result = eval(textViewInput.getText().toString());
                textViewResult.setText(removeTrailingZeros(result));
            }
        });

        button_three.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textViewInput.setText(textViewInput.getText() + "3");
                double result = eval(textViewInput.getText().toString());
                textViewResult.setText(removeTrailingZeros(result));
            }
        });

        button_four.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textViewInput.setText(textViewInput.getText() + "4");
                double result = eval(textViewInput.getText().toString());
                textViewResult.setText(removeTrailingZeros(result));
            }
        });

        button_five.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textViewInput.setText(textViewInput.getText() + "5");
                double result = eval(textViewInput.getText().toString());
                textViewResult.setText(removeTrailingZeros(result));
            }
        });

        button_six.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textViewInput.setText(textViewInput.getText() + "6");
                double result = eval(textViewInput.getText().toString());
                textViewResult.setText(removeTrailingZeros(result));
                }
        });

        button_seven.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textViewInput.setText(textViewInput.getText() + "7");
                double result = eval(textViewInput.getText().toString());
                textViewResult.setText(removeTrailingZeros(result));
            }
        });

        button_eight.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textViewInput.setText(textViewInput.getText() + "8");
                double result = eval(textViewInput.getText().toString());
                textViewResult.setText(removeTrailingZeros(result));
            }
        });

        button_nine.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textViewInput.setText(textViewInput.getText() + "9");
                double result = eval(textViewInput.getText().toString());
                textViewResult.setText(removeTrailingZeros(result));
            }
        });

        //Operations
        button_plus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                double result = eval(textViewInput.getText().toString());
                textViewInput.setText(textViewInput.getText() + "+" );
                textViewResult.setText(removeTrailingZeros(result));
            }
        });

        button_minus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                double result = eval(textViewInput.getText().toString());
                textViewInput.setText(textViewInput.getText() + "-" );
                textViewResult.setText(removeTrailingZeros(result));


            }
        });

        button_multiply.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                double result = eval(textViewInput.getText().toString());
                textViewInput.setText(textViewInput.getText() + "*" );
                textViewResult.setText(removeTrailingZeros(result));

            }
        });

        button_divide.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                double result = eval(textViewInput.getText().toString());
                textViewInput.setText(textViewInput.getText() + "/" );
                textViewResult.setText(removeTrailingZeros(result));

            }
        });

        button_percentage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                double result = eval(textViewInput.getText().toString());
                textViewInput.setText(textViewInput.getText() + "%" );
                textViewResult.setText(removeTrailingZeros(result));
                textViewResult.setText(removeTrailingZeros(result));


            }
        });

        button_dot.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textViewInput.setText(textViewInput.getText() + ".");
                textViewResult.setText(textViewResult.getText() + ".");
            }
        });




        button_equal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                double result = eval(textViewInput.getText().toString());
                textViewInput.setText(removeTrailingZeros(result));
                textViewResult.setText("");
            }
        });
    }

    //Functions
    public double eval(final String str)
    {
        return new Object()
        {
            int pos = -1, ch;

            void nextChar()
            {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat)
            {
                while (ch == ' ') nextChar();
                if (ch == charToEat)
                {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse()
            {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            double parseExpression()
            {
                double x = parseTerm();
                for (;;)
                {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm()
            {
                double x = parseFactor();
                for (;;)
                {

                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if(eat('/'))
                    {
                        double y = parseFactor();

                        if (y != 0) {
                            x /= y;
                        } else {
                            textViewResult.setText("ERROR");
                            textViewInput.setText("ERROR");
                        }
                    }// division
//                        if(eat('/')) x /= parseFactor();
                    else if (eat('%')) x = ( x / 100);//percentage

                    else return x;
                }
            }


            double parseFactor()
            {
                double x;
                int startPos = this.pos;

                if ((ch >= '0' && ch <= '9') || ch == '.') // numbers
                {
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                }

                else
                    {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                    }

                return x;
            }
        }.parse();
    }

    private  String removeTrailingZeros(double d){
        
        String str = String.valueOf(d);
        if (str == null){
            return null;}

        char[] chars = str.toCharArray();
        int length,index ;
        length = str.length();
        index = length -1;
        for (; index >=0;index--)
        {
            if (chars[index] != '0'){
                break;}
        }
        //return (index == length-1) ? str :str.substring(0,index+1);

        String myStr = (index == length-1) ? str :str.substring(0,index+1);
        //System.out.println("myStr is "+myStr);
        String finalStr = myStr;
        if(myStr.endsWith(".")){
            int len = myStr.length();
            finalStr = myStr.substring(0,len-1);
            System.out.println( "finalStr==>"+ finalStr);
        }
        return finalStr;

    }

}
