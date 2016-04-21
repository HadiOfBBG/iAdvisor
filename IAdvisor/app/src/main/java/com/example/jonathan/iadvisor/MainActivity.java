package com.example.jonathan.iadvisor;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String[] list = {
            "2454 聯發科","2305  全友 ","2324  仁寶 ","2331  精英 ","2352  佳世達 ","2353  宏碁 ","2356  英業達 ","2357  華碩","2358  廷鑫 ","2362  藍天 ","2364  倫飛 ","2365  昆盈 ","2376  技嘉 ","2377  微星 ","2380  虹光 ","2382  廣達","2387  精元 ","2395  研華","2397  友通 ","2399  映泰 ","2405  浩鑫 ","2417  圓剛 ","2424  隴華 ","2425  承啟 ","2442  新美齊 ","2465  麗臺 ","3002  歐格 ","3005  神基 ","3013  晟銘電 ","3017  奇鋐 ","3022  威強電 ","3046  建碁 ","3057  喬鼎 ","3060  銘異 ","3231  緯創","3416  融程電 ","3494  誠研 ","3515  華擎 ","3701  大眾控 ","3706  神達 ","4915  致伸 ","4916  事欣科 ","4938  和碩 ","5215  F-科嘉 ","5264  F-鎧勝 ","6117  迎廣 ","6128  上福 ","6166  凌華 ","6172  互億 ","6206  飛捷 ","6230  超眾 ","6235  華孚 ","6277  宏正 ","6414  樺漢 ","1101  台泥","1102  亞泥","1103  嘉泥 ","1104  環泥 ","1108  幸福 ","1109  信大 ","1110  東泥 ","1301  台塑","1303  南亞 ","1304  台聚 ","1305  華夏 ","1307  三芳 ","1308  亞聚 ","1309  台達化 ","1310  台苯 ","1312  國喬 ","1313  聯成 ","1314  中石化 ","1315  達新 ","1319  東陽","1321  大洋 ","1323  永裕 ","1324  地球 ","1325  恆大 ","1326  台化","1337  F-再生 ","1339  昭輝 ","1340  F-勝悅 ","1715  萬洲 ","4306  炎洲 ","1503  士電 ","1504  東元","1506  正道 ","1507  永大 ","1512  瑞利 ","1513  中興電 ","1514  亞力 ","1515  力山 ","1517  利奇 ","1519  華城 ","1521  大億 ","1522  堤維西 ","1524  耿鼎 ","1525  江申 ","1526  日馳 ","1527  鑽全 ","1528  恩德 ","1529  樂士 ","1530  亞崴 ","1531  高林股 ","1533  車王電 ","1535  中宇 ","1536  和大","1537  廣隆 ","1538  正峰新 ","1539  巨庭 ","1540  喬福 ","1541  錩泰 ","1558  伸興 ","1560  中砂 ","1583  程泰 ","1589  F-永冠 ","1590  F-亞德 ","2049  上銀","2228  劍麟 ","2231  為升","2371  大同 ","3167  大量 ","4526  東台 ","4532  瑞智 ","6605  帝寶 ","8374  羅昇 ","8996  高力 "
            ,"3008 大立光", "2330 台積電", "2412 中華電", "2498 宏達電", "2357 華碩", "2376 技嘉", "2379 瑞昱"
    };//the list!!
    private ArrayAdapter<String> listAdapter;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*//notification-----------
        final int notifyID = 1; // 通知的識別號碼

        final Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle(); // 建立BigTextStyle
        //bigTextStyle.setBigContentTitle("2498.TW 宏達電 泡沫指數已達危險值"); // 當BigTextStyle顯示時，用BigTextStyle的setBigContentTitle覆蓋setContentTitle的設定
        //bigTextStyle.bigText("詳請點及觀看-iAdvisor關心您"); // 設定BigTextStyle的文字內容

        final NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE); // 取得系統的通知服務
        final Notification notification = new Notification.Builder(getApplicationContext())
                .setSmallIcon(R.mipmap.ic_launcher).setContentTitle("2498宏達電 泡沫指數已達危險值").setContentText("詳請點及觀看-iAdvisor關心您")
                .setStyle(bigTextStyle).build(); // 建立通知
        notificationManager.notify(notifyID, notification); // 發送通知---------------end notification
*/
        listView = (ListView) findViewById(R.id.listView);
        //listAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, list) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);/// Get the Item from ListView
                TextView tv = (TextView) view.findViewById(android.R.id.text1);
                tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);// Set the text size 25 dip for ListView each item
                //tv.setTextColor(Color.RED);
                //tv.setTextSize(20);
                tv.setBackgroundColor(getResources().getColor(R.color.blue));
                return view;
            }
        };
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), list[position] + " 資料擷取中...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, stock.class);
                Bundle bundle = new Bundle();
                bundle.putString("input", list[position]);
                intent.putExtras(bundle);
                startActivityForResult(intent, 2);
                //startActivity(intent);
                //Toast.makeText(getApplicationContext(), "你選擇的是" + list[position], Toast.LENGTH_SHORT).show();
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
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

        if (id == R.id.action_favorite) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, favorite.class);
            Bundle bundle = new Bundle();
            bundle.putString("input", list[2]);
            intent.putExtras(bundle);
            startActivityForResult(intent, 2);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.jonathan.iadvisor/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.jonathan.iadvisor/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
