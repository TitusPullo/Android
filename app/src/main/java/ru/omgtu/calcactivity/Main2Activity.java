package ru.omgtu.calcactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText login;
    EditText pass;


    Button activity;
    Button butt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        login = (EditText) findViewById(R.id.login);
        pass = (EditText) findViewById(R.id.pass);
        butt = (Button) findViewById(R.id.buttOk);
        activity = (Button) findViewById(R.id.aktivity2);

        View.OnClickListener OnClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String strLogin = login.getText().toString();
                String strPass = pass.getText().toString();
                String pass = "a";
                String log = "a";

                if (view.getId() == R.id.aktivity2) {
                    Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                    startActivity(intent);
                }

            }
        };

        butt.setOnClickListener(OnClick);
        activity.setOnClickListener(OnClick);
    }

}
