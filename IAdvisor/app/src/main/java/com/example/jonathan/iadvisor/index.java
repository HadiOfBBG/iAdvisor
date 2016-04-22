package com.example.jonathan.iadvisor;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class index extends AppCompatActivity {
    NotificationManager manager;
    Notification myNotication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        setTitle("Hi~ 熊貓先生");

        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Intent intent = new Intent(index.this,stock.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(index.this, 1, intent, 0);
        Notification.Builder builder = new Notification.Builder(index.this);
        builder.setAutoCancel(true);
        builder.setContentTitle("iAdvisor關心您");
        builder.setContentText("2498 宏達電 泡沫指數已達危險值");
        builder.setSmallIcon(R.drawable.ic_action_notice2);
        builder.setContentIntent(pendingIntent);
        builder.setOngoing(true);
        builder.build();
        myNotication = builder.getNotification();
        manager.notify(11, myNotication);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(index.this, newlist.class);
                Bundle bundle = new Bundle();
                bundle.putString("input", "stock");
                intent.putExtras(bundle);
                startActivityForResult(intent, 2);
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(index.this, newlist.class);
                Bundle bundle = new Bundle();
                bundle.putString("input", "cash");
                intent.putExtras(bundle);
                startActivityForResult(intent, 2);
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(index.this, newlist.class);
                Bundle bundle = new Bundle();
                bundle.putString("input", "mutualFund");
                intent.putExtras(bundle);
                startActivityForResult(intent, 2);
            }
        });

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(index.this, newlist.class);
                Bundle bundle = new Bundle();
                bundle.putString("input", "commodity");
                intent.putExtras(bundle);
                startActivityForResult(intent, 2);
            }
        });

        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(index.this, newlist.class);
                Bundle bundle = new Bundle();
                bundle.putString("input", "finance");
                intent.putExtras(bundle);
                startActivityForResult(intent, 2);
            }
        });

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(index.this, newlist.class);
                Bundle bundle = new Bundle();
                bundle.putString("input", "bond");
                intent.putExtras(bundle);
                startActivityForResult(intent, 2);
            }
        });

        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(index.this, newlist.class);
                Bundle bundle = new Bundle();
                bundle.putString("input", "option");
                intent.putExtras(bundle);
                startActivityForResult(intent, 2);
            }
        });

        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(index.this, newlist.class);
                Bundle bundle = new Bundle();
                bundle.putString("input", "etf");
                intent.putExtras(bundle);
                startActivityForResult(intent, 2);
            }
        });

        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(index.this, newlist.class);
                Bundle bundle = new Bundle();
                bundle.putString("input", "favorite");
                intent.putExtras(bundle);
                startActivityForResult(intent, 2);
            }
        });

        Button button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(index.this, advice.class);
                Bundle bundle = new Bundle();
                bundle.putString("input", "advice");
                intent.putExtras(bundle);
                startActivityForResult(intent, 2);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.index_menu, menu);
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
            Intent intent = new Intent();
            intent.setClass(index.this, setting.class);
            Bundle bundle = new Bundle();
            bundle.putString("input", "option");
            intent.putExtras(bundle);
            startActivityForResult(intent, 2);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
