package com.example.jonathan.iadvisor;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class newlist extends AppCompatActivity {

    private ArrayList<String> data = new ArrayList<String>();
    private Bundle bundle;
    private Intent intent;
    private  String[] list;
    private  String[] stock = {
            "2454  聯發科","2324  仁寶 ","2331  精英 ","2352  佳世達 ","2353  宏碁 ","2356  英業達 ","2357  華碩",
            "2358  廷鑫 ","2362  藍天 ","2364  倫飛 ","2365  昆盈 ","2376  技嘉 ","2377  微星 ","2380  虹光 ","2382  廣達","2387  精元 ",
            "2395  研華","2397  友通 ","2399  映泰 ","2405  浩鑫 ","2417  圓剛 ","2424  隴華 ","2425  承啟 ","2442  新美齊 ","2465  麗臺 ",
            "3002  歐格 ","3005  神基 ","3013  晟銘電 ","3017  奇鋐 ","3022  威強電 ","3046  建碁 ","3057  喬鼎 ","3060  銘異 ","3231  緯創",
            "3416  融程電 ","3494  誠研 ","3515  華擎 ","3701  大眾控 ","3706  神達 ","4915  致伸 ","4916  事欣科 ","4938  和碩 ",
            "5215  F-科嘉 ","5264  F-鎧勝 ","6117  迎廣 ","6128  上福 ","6166  凌華 ","6172  互億 ","6206  飛捷 ","6230  超眾 ",
            "6235  華孚 ","6277  宏正 ","6414  樺漢 ","1101  台泥","1102  亞泥","1103  嘉泥 ","1104  環泥 ","1108  幸福 ",
            "1109  信大 ","1110  東泥 ","1301  台塑","1303  南亞 ","1304  台聚 ","1305  華夏 ","1307  三芳 ","1308  亞聚 ",
            "1309  台達化 ","1310  台苯 ","1312  國喬 ","1313  聯成 ","1314  中石化 ","1315  達新 ","1319  東陽","1321  大洋 ",
            "1323  永裕 ","1324  地球 ","1325  恆大 ","1326  台化","1337  F-再生 ","1339  昭輝 ","1340  F-勝悅 ","1715  萬洲 ",
            "4306  炎洲 ","1503  士電 ","1504  東元","1506  正道 ","1507  永大 ","1512  瑞利 ","1513  中興電 ","1514  亞力 ",
            "1515  力山 ","1517  利奇 ","1519  華城 ","1521  大億 ","1522  堤維西 ","1524  耿鼎 ","1525  江申 ","1526  日馳 ",
            "1527  鑽全 ","1528  恩德 ","1529  樂士 ","1530  亞崴 ","1531  高林股 ","1533  車王電 ","1535  中宇 ","1536  和大",
            "1537  廣隆 ","1538  正峰新 ","1539  巨庭 ","1540  喬福 ","1541  錩泰 ","1558  伸興 ","1560  中砂 ","1583  程泰 ",
            "1589  F-永冠 ","1590  F-亞德 ","2049  上銀","2228  劍麟 ","2231  為升","2371  大同 ","3167  大量 ","4526  東台 ",
            "4532  瑞智 ","6605  帝寶 ","8374  羅昇 ", "8996  高力 ","3008 大立光", "2330 台積電", "2412 中華電",
            "2498 宏達電", "2357 華碩", "2376 技嘉", "2379 瑞昱"
    };//the list!!
    private  String[] cash = {
            "EUR/USD","USD/JPY ","GBP/USD","AUD/USD ","USD/CAD ","USD/CHF ","USD/CNY ","EUR/JPY ","EUR/GBP"
    };//the list!!
    private  String[] mutualFund = {
            "ProFunds UltraChina Inv(UGPIX)","ProFunds UltraChina Service(UGPSX)",
            "ProFunds UltraNASDAQ-100 Inv(UOPIX)","Rydex Dynamic NASDAQ-100 2X Strategy A(RYVLX)",
            "Rydex Dynamic NASDAQ-100 2X Strategy H(RYVYX)","ProFunds UltraNASDAQ-100 Svc(UOPSX) ",
            "Rydex Dynamic NASDAQ-100 2X Strategy C(RYCCX) ","Rydex Monthly Rbl NASDAQ-100® 2x Strt H(RMQHX) ",
            "Rydex Monthly Rbl NASDAQ-100® 2x Strt A(RMQAX) ","Direxion Mthly NASDAQ-100 Bull 2X Inv(DXQLX) ",
            "Rydex Monthly Rbl NASDAQ-100® 2x Strt C(RMQCX)","ProFunds Internet UltraSector Inv(INPIX) ",
            "ProFunds Internet UltraSector Svc(INPSX)","ProFunds Semiconductor UltraSector Inv(SMPIX) ",
            "ProFunds Semiconductor UltraSector Svc(SMPS)",
    };
    private  String[] commodity = {
            "穀物","黃豆","生豬","牛腩 ","棉花 ","黃金 ","白銀 ","銅 ","鋁","石油 ","咖啡 ","可可 "
    };
    private  String[] finance = {
            "英鎊","加幣","德國馬克","日幣 ","瑞士法朗 ","歐洲美元期貨契約 ","美國國庫券期貨契約 ","美國中期公債 ","美國長期公債",
            "S＆P500指數期貨 ","CME ","SGX-DT","Nikkei 225","Heng Sheng股價指數期貨 ","台灣加權股價指數期貨 ","電子類股股價指數期貨 ",
            "金融類股股價指數期貨 ","摩根台灣股價指數期貨 "
    };
    private  String[] bond = {
            "World-Bond","Columbia Global Bond I","Amana Participation Investor","AlphaCentric Bond Rotation A ",
            "Victory CEMP Enhanced Fixed Income I ", "Morgan Stanley Global Fixed Inc Opps A ","PACE International Fixed Income A ",
            "Henderson Strategic Income A ","GuideStone Funds Global Bond Investor", "Janus Global Bond A "
    };
    private  String[] option = {
            "24Option","Boss Capital","CTOption","Opteck ","OptionsClick ","GOptions ","TradeRush ","Porter Finance ","Magnum Options",
            "Banc De Binary ","10Trade ","TopOption","Redwood Options ","AnyOption ","CherryTrade "
    };
    private  String[] etf = {
            "iShares Global Tech","iShares Global Consumer Staples","iShares Global Consumer Discr","Global X Social Media Index ","First Trust ISE Cloud Computing ",
            "Precidian Maxis Nikkei ","iShares Core High DividendiShares ","Intl Telecom Sect ETF ","First Trust NASDAQ Smartphone Index"
    };
    private  String[] favorite = {
            "2454  聯發科","2324  仁寶  "
    };//the list!!

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newlist);
        ListView lv = (ListView) findViewById(R.id.listview);


        generateListContent();
        lv.setAdapter(new MyListAdaper(this, R.layout.list_item, data));
        lv.setBackgroundColor(getResources().getColor(R.color.dark));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(bundle.getString("input").equalsIgnoreCase("stock")||bundle.getString("input").equalsIgnoreCase("favorite")) {
                    Toast.makeText(getApplicationContext(), list[position] + " 資料擷取中...", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent();
                    intent.setClass(newlist.this, stock.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("input", list[position]);
                    intent.putExtras(bundle);
                    startActivityForResult(intent, 2);
                }
            }
        });
    }

    private void generateListContent() {
        intent = this.getIntent();
        bundle = intent.getExtras();
        if(bundle.getString("input").equalsIgnoreCase("stock")){
            setTitle("股市");
            list = Arrays.copyOf(stock, stock.length);
        }
        else if(bundle.getString("input").equalsIgnoreCase("cash")){
            setTitle("外匯");
            list = Arrays.copyOf(cash, cash.length);
        }
        else if(bundle.getString("input").equalsIgnoreCase("mutualFund")){
            setTitle("共同基金");
            list = Arrays.copyOf(mutualFund, mutualFund.length);
        }
        else if(bundle.getString("input").equalsIgnoreCase("commodity")){
            setTitle("商品期貨");
            list = Arrays.copyOf(commodity, commodity.length);
        }
        else if(bundle.getString("input").equalsIgnoreCase("finance")){
            setTitle("金融期貨");
            list = Arrays.copyOf(finance, finance.length);
        }
        else if(bundle.getString("input").equalsIgnoreCase("bond")){
            setTitle("債券");
            list = Arrays.copyOf(bond, bond.length);
        }
        else if(bundle.getString("input").equalsIgnoreCase("option")){
            setTitle("選擇權");
            list = Arrays.copyOf(option, option.length);
        }
        else if(bundle.getString("input").equalsIgnoreCase("etf")){
            setTitle("ETFS");
            list = Arrays.copyOf(etf, etf.length);
        }
        else if(bundle.getString("input").equalsIgnoreCase("favorite")){
            setTitle("我的最愛");
            list = Arrays.copyOf(favorite, favorite.length);
        }

        for(int i = 0; i < list.length; i++) {
            data.add(list[i]);
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
            Intent intent = new Intent();
            intent.setClass(newlist.this, setting.class);
            Bundle bundle = new Bundle();
            bundle.putString("input", "option");
            intent.putExtras(bundle);
            startActivityForResult(intent, 2);
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
            //mainViewholder.button.setImageResource(R.drawable.ic_add_alert_white_24dp);
            mainViewholder.button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), list[position] + " 加入最愛成功!", Toast.LENGTH_SHORT).show();
                }
            });
            mainViewholder.button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), list[position] + " 加入提醒成功!", Toast.LENGTH_SHORT).show();
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
