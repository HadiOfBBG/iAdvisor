package com.example.jonathan.iadvisor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        setTitle("設定");

        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter adapter3 = new ArrayAdapter(this,R.layout.spinner_item2,new String[]{"資訊軟體系統類","行銷╱企劃╱專案管理類",
                "餐飲╱旅遊 ╱美容美髮類","操作╱技術╱維修類","營建╱製圖類","文字╱傳媒工作類","經營╱人資類","學術╱教育╱輔導類",
                "生產製造╱品管╱環衛類","財會╱金融專業類","客服╱門市╱業務╱貿易類","行政╱總務╱法務類","資材╱物流╱運輸類",
                "醫療╱保健服務類","研發相關類","軍警消╱保全類","其他職類"});
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);

        Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);
        ArrayAdapter adapter4 = new ArrayAdapter(this,R.layout.spinner_item2,new String[]{"NT25,000以下","NT25,000~40,000",
                "NT40,000~60,000","NT60,000以上"});
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);

        Spinner spinner5 = (Spinner) findViewById(R.id.spinner5);
        ArrayAdapter adapter5 = new ArrayAdapter(this,R.layout.spinner_item2,new String[]{"高","中高","中","中低","低"});
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);

        Spinner spinner6 = (Spinner) findViewById(R.id.spinner6);
        ArrayAdapter adapter6 = new ArrayAdapter(this,R.layout.spinner_item2,new String[]{"男","女"});
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(adapter6);

        Spinner spinner7 = (Spinner) findViewById(R.id.spinner7);
        ArrayAdapter adapter7 = new ArrayAdapter(this,R.layout.spinner_item2,new String[]{"19歲以下","20~30歲","30~40歲","40~50歲",
                "40~50歲","50~60歲","60歲以上"});
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner7.setAdapter(adapter7);
    }
}
