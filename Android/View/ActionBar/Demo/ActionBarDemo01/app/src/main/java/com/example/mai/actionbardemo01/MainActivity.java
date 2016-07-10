package com.example.mai.actionbardemo01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button bt1 = (Button) findViewById(R.id.bt1);//标题，控件等
        Button bt2 = (Button) findViewById(R.id.bt2);//导航模式
        Button bt3 = (Button) findViewById(R.id.bt3);
        Button bt4 = (Button) findViewById(R.id.bt4);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt1:
                Intent intent1 = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent1);
                break;
            case R.id.bt2:
                Intent intent2 = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent2);
                break;

        }
    }
}
