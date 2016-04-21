package com.example.jonathan.iadvisor;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.TypedValue;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class favorite extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private ListView listView;
    private String[] list = {"3008 大立光", "2330 台積電", "2412 中華電", "2498 宏達電", "2357 華碩", "2376 技嘉", "2379 瑞昱", "2454 聯發科"};//the list!!
    private ArrayAdapter<String> listAdapter;
    NotificationManager manager;
    Notification myNotication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Intent intent = new Intent(favorite.this,stock.class);

        PendingIntent pendingIntent = PendingIntent.getActivity(favorite.this, 1, intent, 0);
        //intent.setClass(favorite.this, stock.class);

        Notification.Builder builder = new Notification.Builder(favorite.this);
        builder.setAutoCancel(true);
        //builder.setTicker("this is ticker text");
        builder.setContentTitle("iAdvisor關心您");
        builder.setContentText("2498 宏達電 泡沫指數已達危險值");
        builder.setSmallIcon(R.drawable.ic_action_notice);
        builder.setContentIntent(pendingIntent);
        builder.setOngoing(true);
        //builder.setSubText("This is subtext...");   //API level 16
        //builder.setNumber(100);
        builder.build();

        myNotication = builder.getNotification();
        manager.notify(11, myNotication);

        listView = (ListView) findViewById(R.id.listView);
        //listAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, list) {//android.R.layout.simple_list_item_1
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);/// Get the Item from ListView
                TextView tv = (TextView) view.findViewById(android.R.id.text1);
                tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);// Set the text size 25 dip for ListView each item
                if(list[position]=="2498 宏達電"){
                    tv.setBackgroundColor(getResources().getColor(R.color.pink));
                }
                else if(list[position]=="2454 聯發科"){
                    tv.setBackgroundColor(getResources().getColor(R.color.yello));
                }
                else{
                    tv.setBackgroundColor(getResources().getColor(R.color.blue));
                }
                //tv.setTextColor(Color.RED);
                //tv.setTextSize(20);
                //tv.setBackgroundColor(Color.BLUE);
                // Return the view
                return view;
            }
        };
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), list[position] + " 資料擷取中...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(favorite.this, stock.class);
                Bundle bundle = new Bundle();
                bundle.putString("input", list[position]);
                intent.putExtras(bundle);
                startActivityForResult(intent, 2);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
            Intent intent = new Intent();
            intent.setClass(favorite.this, MainActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("input", "hahahah");
            intent.putExtras(bundle);
            startActivityForResult(intent, 2);
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
