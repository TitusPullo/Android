package ru.omgtu.calcactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView reply;
    TextView same1;
    EditText expression;
    EditText expression1;

    Button buttP;
    Button buttM;
    Button buttD;
    Button buttX;
    Button buttA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reply = (TextView) findViewById(R.id.reply);
        same1 = (TextView) findViewById(R.id.same1);
        expression = (EditText) findViewById(R.id.expression);
        expression1 = (EditText) findViewById(R.id.expression1);

        buttP = (Button) findViewById(R.id.buttP);
        buttM = (Button) findViewById(R.id.buttM);
        buttD = (Button) findViewById(R.id.buttD);
        buttX = (Button) findViewById(R.id.buttX);
        buttA = (Button) findViewById(R.id.aktivity1);


        View.OnClickListener OnClicklister = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(expression.length()== 0 || expression1.length() == 0) {
                    return;
                }

                String string1 = expression.getText().toString();
                String string = expression1.getText().toString();
                int number1 = Integer.parseInt(string);
                int number = Integer.parseInt(string1);

                switch (view.getId()){
                    case R.id.buttP:
                        same1.setText(String.valueOf(number1 + number));
                        break;
                    case R.id.buttM:
                        same1.setText(String.valueOf(number1 - number));
                        break;
                    case R.id.buttD:
                        if(number == 0) {
                            same1.setText(String.valueOf("Ошибка!"));
                            break;
                        }
                        else
                            same1.setText(String.valueOf(number1 / number));
                        break;
                    case R.id.buttX:
                        same1.setText(String.valueOf(number1 * number));
                        break;

                }
            }
        };

        buttA.setOnClickListener(OnClicklister);
        buttP.setOnClickListener(OnClicklister);
        buttD.setOnClickListener(OnClicklister);
        buttM.setOnClickListener(OnClicklister);
        buttX.setOnClickListener(OnClicklister);

        buttA.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }
}
