package com.example.jonathan.iadvisor;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class stock extends AppCompatActivity {
    private Intent intent;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock);

        //To get the string from mainActivity
        intent = this.getIntent();
        bundle = intent.getExtras();
        if(bundle!=null){
            setTitle(bundle.getString("input"));//setting title
        }else {
            setTitle("2498 宏達電");//setting title
        }

        if(getTitle()=="2498 宏達電"||bundle.getString("input").equalsIgnoreCase("2498 宏達電")){
            TextView tv1 = (TextView)findViewById(R.id.popen);
            tv1.setText("88");
            tv1.setTextColor(getResources().getColor(R.color.white));
            TextView tv2 = (TextView)findViewById(R.id.phigh);
            tv2.setText("91.2");
            TextView tv3 = (TextView)findViewById(R.id.plow);
            tv3.setText("87");
            TextView tv4 = (TextView)findViewById(R.id.pclose);
            tv4.setText("87.2");
            TextView tv5 = (TextView)findViewById(R.id.textView3);
            tv5.setText("81");
            ImageView img1 = (ImageView)findViewById(R.id.imageView3);
            img1.setImageResource(R.drawable.s80);
            ImageView img2 = (ImageView)findViewById(R.id.imageView);
        }
        else if(getTitle()=="2454  聯發科"||bundle.getString("input").equalsIgnoreCase("2454  聯發科")){
            TextView tv1 = (TextView)findViewById(R.id.popen);
            tv1.setText("234.0");
            TextView tv2 = (TextView)findViewById(R.id.phigh);
            tv2.setText("236.0");
            TextView tv3 = (TextView)findViewById(R.id.plow);
            tv3.setText("231.5");
            TextView tv4 = (TextView)findViewById(R.id.pclose);
            tv4.setText("234.0");
            TextView tv5 = (TextView)findViewById(R.id.textView3);
            tv5.setText("55");
            ImageView img1 = (ImageView)findViewById(R.id.imageView3);
            img1.setImageResource(R.drawable.s50);
            ImageView img2 = (ImageView)findViewById(R.id.imageView);
        }
        else{
            TextView tv1 = (TextView)findViewById(R.id.popen);
            tv1.setText("20.05");
            tv1.setTextColor(getResources().getColor(R.color.white));
            TextView tv2 = (TextView)findViewById(R.id.phigh);
            tv2.setText("20.05");
            TextView tv3 = (TextView)findViewById(R.id.plow);
            tv3.setText("19.75");
            TextView tv4 = (TextView)findViewById(R.id.pclose);
            tv4.setText("19.95");
            TextView tv5 = (TextView)findViewById(R.id.textView3);
            tv5.setText("32");
            ImageView img1 = (ImageView)findViewById(R.id.imageView3);
            img1.setImageResource(R.drawable.s30);
            ImageView img2 = (ImageView)findViewById(R.id.imageView);
        }


        //EditText et1 = (TextView)findViewById(R.id.textView1);
        //et1.setText(bundle.getString("input"));

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        //建立一個ArrayAdapter物件，並放置下拉選單的內容
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.spinner_item,new String[]{"LPPL對數週期性幂律模型",
                "GARCH時間序列模型","Black-scholes期權定價"});
        //設定下拉選單的樣式
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        //設定項目被選取之後的動作
        spinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            public void onItemSelected(AdapterView adapterView, View view, int position, long id) {
                //Toast.makeText(stock.this, "您選擇" + adapterView.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
                if (adapterView.getSelectedItem().toString().equalsIgnoreCase("LPPL對數週期性幂律模型")) {
                    ImageView img2 = (ImageView) findViewById(R.id.imageView);
                    img2.setImageResource(R.drawable.stock1);
                } else if (adapterView.getSelectedItem().toString().equalsIgnoreCase("七舍313")) {
                    ImageView img2 = (ImageView) findViewById(R.id.imageView);
                    img2.setImageResource(R.drawable.stock1);
                } else {
                    ImageView img2 = (ImageView) findViewById(R.id.imageView);
                    img2.setImageResource(R.drawable.stock1);
                }
            }
            public void onNothingSelected(AdapterView arg0) {
                Toast.makeText(stock.this, "您沒有選擇任何項目", Toast.LENGTH_LONG).show();
            }
        });

        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        //建立一個ArrayAdapter物件，並放置下拉選單的內容
        ArrayAdapter adapter2 = new ArrayAdapter(this,R.layout.spinner_item,new String[]{"日","月","季","年"});
        //設定下拉選單的樣式
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        //設定項目被選取之後的動作
        spinner2.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            public void onItemSelected(AdapterView adapterView, View view, int position, long id) {
                //Toast.makeText(stock.this, "您選擇" + adapterView.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
                /*
                if (adapterView.getSelectedItem().toString().equalsIgnoreCase("LPPL對數週期性幂律模型")) {
                    ImageView img2 = (ImageView) findViewById(R.id.imageView);
                    img2.setImageResource(R.drawable.p111);
                } else if (adapterView.getSelectedItem().toString().equalsIgnoreCase("七舍313")) {
                    ImageView img2 = (ImageView) findViewById(R.id.imageView);
                    img2.setImageResource(R.drawable.p2625);
                } else {
                    ImageView img2 = (ImageView) findViewById(R.id.imageView);
                    img2.setImageResource(R.drawable.p2062);
                }*/
            }
            public void onNothingSelected(AdapterView arg0) {
                Toast.makeText(stock.this, "您沒有選擇任何項目", Toast.LENGTH_LONG).show();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.stock_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_favorite) {
            Toast.makeText(getApplicationContext(), getTitle() + " 已加入最愛", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.action_alert) {
            Toast.makeText(getApplicationContext(), getTitle() + " 已加入提醒", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
