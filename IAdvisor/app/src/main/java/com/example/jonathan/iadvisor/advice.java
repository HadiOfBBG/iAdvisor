package com.example.jonathan.iadvisor;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class advice extends AppCompatActivity {
    private ArrayList<String> data = new ArrayList<String>();
    private ArrayList<String> data2 = new ArrayList<String>();
    private ArrayList<String> data3 = new ArrayList<String>();
    private ArrayList<String> data4 = new ArrayList<String>();
    private ArrayList<String> data5 = new ArrayList<String>();
    private ArrayList<String> data6 = new ArrayList<String>();
    private ArrayList<String> data7 = new ArrayList<String>();
    private ArrayList<String> data8 = new ArrayList<String>();
    private Bundle bundle;
    private Intent intent;
    private  String[] list= {
            "2330 台積電", "2412 中華電", "2498 宏達電", "2357 華碩", "2376 技嘉",
            "EUR/USD","USD/JPY ","GBP/USD","AUD/USD ","USD/CAD ",
            "ProFunds UltraChina Inv(UGPIX)","ProFunds UltraChina Service(UGPSX)",
            "ProFunds UltraNASDAQ-100 Inv(UOPIX)","ProFunds UltraNASDAQ-100 Svc(UOPSX) ",
            "ProFunds Internet UltraSector Svc(INPSX)",
            "牛腩 ","棉花 ","黃金 ","白銀 ","銅 ",
            "德國馬克","日幣 ","瑞士法朗 ","美國中期公債 ","S＆P500指數期貨 ",
            "World-Bond","Columbia Global Bond I","Amana Participation Investor",
            "AlphaCentric Bond Rotation A ","Henderson Strategic Income A ",
            "CTOption","Opteck ","OptionsClick ","GOptions ","TradeRush ",
            "iShares Global Consumer Discr","Global X Social Media Index ","First Trust ISE Cloud Computing ",
            "Precidian Maxis Nikkei ","Intl Telecom Sect ETF ",
    };//the list!!

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advice);
        ListView lv = (ListView) findViewById(R.id.listview);
        ListView lv2 = (ListView) findViewById(R.id.listview2);
        ListView lv3 = (ListView) findViewById(R.id.listview3);
        ListView lv4 = (ListView) findViewById(R.id.listview4);
        ListView lv5 = (ListView) findViewById(R.id.listview5);
        ListView lv6 = (ListView) findViewById(R.id.listview6);
        ListView lv7 = (ListView) findViewById(R.id.listview7);
        ListView lv8 = (ListView) findViewById(R.id.listview8);


        setTitle("綜合推薦");

        generateListContent();
        lv.setAdapter(new MyListAdaper(this, R.layout.list_item, data));
        lv.setBackgroundColor(getResources().getColor(R.color.dark));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //what to do when click
            }
        });
        lv2.setAdapter(new MyListAdaper(this, R.layout.list_item, data2));
        lv2.setBackgroundColor(getResources().getColor(R.color.dark));
        lv3.setAdapter(new MyListAdaper(this, R.layout.list_item, data3));
        lv3.setBackgroundColor(getResources().getColor(R.color.dark));
        lv4.setAdapter(new MyListAdaper(this, R.layout.list_item, data4));
        lv4.setBackgroundColor(getResources().getColor(R.color.dark));
        lv5.setAdapter(new MyListAdaper(this, R.layout.list_item, data5));
        lv5.setBackgroundColor(getResources().getColor(R.color.dark));
        lv6.setAdapter(new MyListAdaper(this, R.layout.list_item, data6));
        lv6.setBackgroundColor(getResources().getColor(R.color.dark));
        lv7.setAdapter(new MyListAdaper(this, R.layout.list_item, data7));
        lv7.setBackgroundColor(getResources().getColor(R.color.dark));
        lv8.setAdapter(new MyListAdaper(this, R.layout.list_item, data8));
        lv8.setBackgroundColor(getResources().getColor(R.color.dark));

    }

    private void generateListContent() {
        intent = this.getIntent();
        bundle = intent.getExtras();

        for(int i = 0; i < 5; i++) {
            data.add(list[i]);
        }
        for(int i = 5; i < 10; i++) {
            data2.add(list[i]);
        }
        for(int i = 10; i < 15; i++) {
            data3.add(list[i]);
        }
        for(int i = 15; i < 20; i++) {
            data4.add(list[i]);
        }
        for(int i = 20; i < 25; i++) {
            data5.add(list[i]);
        }
        for(int i = 25; i < 30; i++) {
            data6.add(list[i]);
        }
        for(int i = 30; i < 35; i++) {
            data7.add(list[i]);
        }
        for(int i = 35; i < 40; i++) {
            data8.add(list[i]);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

        if (id == R.id.action_find) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private class MyListAdaper extends ArrayAdapter<String> {
        private int layout;

        private List<String> mObjects;
        private MyListAdaper(Context context, int resource, List<String> objects) {
            super(context, resource, objects);
            mObjects = objects;
            layout = resource;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            ViewHolder mainViewholder = null;
            if(convertView == null) {
                LayoutInflater inflater = LayoutInflater.from(getContext());
                convertView = inflater.inflate(layout, parent, false);
                ViewHolder viewHolder = new ViewHolder();
                viewHolder.title = (TextView) convertView.findViewById(R.id.list_item_text);
                viewHolder.button = (ImageButton) convertView.findViewById(R.id.list_item_favorite);
                viewHolder.button2 = (ImageButton) convertView.findViewById(R.id.list_item_alert);
                convertView.setTag(viewHolder);
            }
            mainViewholder = (ViewHolder) convertView.getTag();
            mainViewholder.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), " 加入最愛成功!", Toast.LENGTH_SHORT).show();
                }
            });
            mainViewholder.button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), " 加入提醒成功!", Toast.LENGTH_SHORT).show();
                }
            });
            mainViewholder.title.setText(getItem(position));

            return convertView;
        }
    }
    public class ViewHolder {

        TextView title;
        ImageButton button,button2;
    }
}
