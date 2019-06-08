package com.example.bumjin.basicsum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    EditText e1,e2;
    TextView t1;
    Button b1;
    String input1, input2;
    int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    e1 = (EditText)findViewById(R.id.e1);
    e2 = (EditText)findViewById(R.id.e2);
    t1 = (TextView)findViewById(R.id.t1);
    b1 = (Button)findViewById(R.id.b1);

    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            input1 = e1.getText().toString();
            input2 = e2.getText().toString();
            sum = Integer.parseInt(input1) + Integer.parseInt(input2); // Integer 클래스의 parseOnt를 활용하여 문자를 숫자로 바꿔줌
            t1.setText(Integer.toString(sum)); //
        }
    });








    }


}
