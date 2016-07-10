package com.example.mai.actionbardemo01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
private Toolbar tb;
//    private
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main2);
       tb = (Toolbar) findViewById(R.id.tb);
        tb.setTitle("ddds");
        setSupportActionBar(tb);
/*
        ActionBar ab =  getSupportActionBar();
        ab.setTitle("BigTittle");
        ab.setSubtitle("subTittle");
        //        ab.setIcon(R.drawable.ic_action_call);
//        ab.setLogo(R.mipmap.ic_launcher);
        ab.setDisplayShowHomeEnabled(true);//这句必须写，不写LOGO不出来
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setLogo(R.mipmap.ic_launcher);
        ab.setHomeButtonEnabled(true);
        ab.setDisplayShowCustomEnabled(true);
        ab.setDisplayUseLogoEnabled(true);//默认为true，使用logo,false为使用icon
        ab.show();
*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       Log.i("testforitem", item.getGroupId()+"::"+item.getItemId()) ;
        switch (item.getItemId()){
            case android.R.id.home:
                Toast.makeText(Main2Activity.this,"go back",Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
