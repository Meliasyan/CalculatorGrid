package com.example.meliasyan.calculatorgrid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.example.meliasyan.calculatorGrid.R;


public class MainActivity extends AppCompatActivity
{
    Button button_clear, button_percentage, button_divide, button_multiply, button_seven, button_eight, button_nine, button_minus, button_four,
    button_five, button_six, button_plus, button_one, button_two, button_three, button_equal, button_dot, button_zero, button_doubleZero;

    TextView textViewResult;

    TextView editTextInput;

    double firstValue, secondValue;

    public enum Operation {
        Add, Sub, Multiply, Divide, Percentage, Nothing
    }

    public Operation currentOp;


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
        button_doubleZero = findViewById(R.id.button_doubleZero);

        editTextInput = findViewById(R.id.tv_userInput);
        textViewResult = findViewById(R.id.tv_userResult);

        button_clear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textViewResult.setText("");
                editTextInput.setText("");
            }

        });


        button_zero.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editTextInput.setText(editTextInput.getText() + "0");
                textViewResult.setText(textViewResult.getText() + "0");
            }
        });

        button_doubleZero.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editTextInput.setText(editTextInput.getText() + "00");
                textViewResult.setText(textViewResult.getText() + "00");
            }
        });

        button_one.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editTextInput.setText(editTextInput.getText() + "1");
                textViewResult.setText(textViewResult.getText() + "1");
            }
        });

        button_two.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editTextInput.setText(editTextInput.getText() + "2");
                textViewResult.setText(textViewResult.getText() + "2");
            }
        });

        button_three.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editTextInput.setText(editTextInput.getText() + "3");
                textViewResult.setText(textViewResult.getText() + "3");
            }
        });

        button_four.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editTextInput.setText(editTextInput.getText() + "4");
                textViewResult.setText(textViewResult.getText() + "4");
            }
        });

        button_five.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editTextInput.setText(editTextInput.getText() + "5");
                textViewResult.setText(textViewResult.getText() + "5");
            }
        });

        button_six.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editTextInput.setText(editTextInput.getText() + "6");
                textViewResult.setText(textViewResult.getText() + "6");
            }
        });

        button_seven.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editTextInput.setText(editTextInput.getText() + "7");
                textViewResult.setText(textViewResult.getText() + "7");
            }
        });

        button_eight.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editTextInput.setText(editTextInput.getText() + "8");
                textViewResult.setText(textViewResult.getText() + "8");
            }
        });

        button_nine.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editTextInput.setText(editTextInput.getText() + "9");
                textViewResult.setText(textViewResult.getText() + "9");
            }
        });






        button_plus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                currentOp = Operation.Add;
                firstValue = Double.parseDouble(editTextInput.getText() + "");
                editTextInput.setText(editTextInput.getText() + "+" );
                textViewResult.setText(String.valueOf(firstValue + secondValue));

            }
        });

        button_minus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                firstValue = Double.parseDouble(editTextInput.getText() + "");
                currentOp = Operation.Sub;
                editTextInput.setText(editTextInput.getText() + "-");
                textViewResult.setText(String.valueOf(firstValue - secondValue));


            }
        });

        button_multiply.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                firstValue = Double.parseDouble(editTextInput.getText() + "");
                currentOp = Operation.Multiply;
                editTextInput.setText(editTextInput.getText() + "*");
                textViewResult.setText(String.valueOf(firstValue * secondValue));

            }
        });

        button_divide.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                firstValue = Double.parseDouble(editTextInput.getText() + "");
                currentOp = Operation.Divide;
                editTextInput.setText(editTextInput.getText() + "/");
                textViewResult.setText(String.valueOf(firstValue / secondValue));

            }
        });

        button_percentage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                firstValue = Double.parseDouble(editTextInput.getText() + "");
                currentOp = Operation.Percentage;
                editTextInput.setText(editTextInput.getText() + "%");
                textViewResult.setText(String.valueOf(firstValue / 100));

            }
        });

        button_dot.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editTextInput.setText(editTextInput.getText() + ".");
                textViewResult.setText(textViewResult.getText() + ".");
            }
        });




        button_equal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String inputString = editTextInput.getText().toString();

                inputString.split("[+\\-/*]");
                secondValue = Double.parseDouble(editTextInput.getText().toString());

                switch (currentOp) {
                    case Add:
                        editTextInput.setText(String.valueOf(firstValue + secondValue));
                        textViewResult.setText("");
                        break;

                    case Sub:
                        editTextInput.setText(firstValue - secondValue + "");
                        textViewResult.setText(firstValue - secondValue + "");
                        break;

                    case Multiply:
                        editTextInput.setText(firstValue * secondValue + "");
                        textViewResult.setText(firstValue * secondValue + "");
                        break;

                    case Divide:
                        if (secondValue == 0)
                        {
                            editTextInput.setText("ERROR");
                            textViewResult.setText("ERROR");
                        } else
                            {
                            editTextInput.setText(firstValue / secondValue + "");
                            textViewResult.setText(firstValue / secondValue + "");
                        }
                        break;

                    case Percentage:
                        editTextInput.setText(firstValue / 100 + "");
                        textViewResult.setText(firstValue / 100 + "");
                        break;
                }

                currentOp = Operation.Nothing;
            }
        });


    }
}
