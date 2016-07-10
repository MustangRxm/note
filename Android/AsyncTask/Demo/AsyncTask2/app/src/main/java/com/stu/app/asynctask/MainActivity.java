package com.stu.app.asynctask;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity {
private TextView tv ;
    private WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       tv = (TextView) findViewById(R.id.tv);
        wv = (WebView) findViewById(R.id.wv);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.jyu.edu.cn/news/2016-05/1463125030d91439.html"));
//        startActivity(intent);
//        wv.loadUrl("http://www.jyu.edu.cn/news/2016-05/1463125030d91439.html");
//        WebSettings wsetting = wv.getSettings();
//        wsetting.setBuiltInZoomControls(true);
        fab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                ReadUrl("http://www.baidu.com");
            }


        });
    }

    private void ReadUrl(String s) {
        new AsyncTask<String,Integer,String>(){
            protected String doInBackground(String... strings) {
                publishProgress(55);//为onProgressUpdate方法进行赋值
                StringBuilder sb = null;
                try {
                    URL url = new URL(strings[0]);
                    URLConnection urlc =  url.openConnection();
                    InputStream is =  urlc.getInputStream();
                    InputStreamReader isr = new InputStreamReader(is);
                    BufferedReader br = new BufferedReader(isr);
                    String line = null;
                    sb = new StringBuilder();
                    while ((line = br.readLine())!=null){
                        sb.append(line);
                    }
                    br.close();
                    isr.close();
                    is.close();

                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                }

                return sb.toString();
            }


            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                //执行前，初始化


            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                //执行完后
                tv.setText(s);
            }

            @Override
            protected void onProgressUpdate(Integer... values) {
                super.onProgressUpdate(values);
                //这里可以用中间参数来进行更新
                System.out.println(values[0]);
            }

            @Override
            protected void onCancelled(String s) {
                super.onCancelled(s);
            }

            @Override
            protected void onCancelled() {
                super.onCancelled();
            }
        }.execute(s);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
