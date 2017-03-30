package com.cclz.myapp_170330_03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    String data[]={"蘋果", "檸檬", "香蕉", "橘子"};
    String data2[]={"Apple", "Lemon", "Banana", "Orange"};
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.listView);
        MyAdapter adapter=new MyAdapter();
        lv.setAdapter(adapter);

    }

    class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return data.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v=getLayoutInflater().inflate(R.layout.myitem, null);  // 自訂Layout
//            TextView tv=new TextView(MainActivity.this);
            TextView tv=(TextView)v.findViewById(R.id.textView);    // 自訂 tv 大型字體
            TextView tv2=(TextView)v.findViewById(R.id.textView2);    // 自訂 tv 大型字體
            tv.setText(data[position]);
            tv2.setText(data2[position]);
//            return tv;
            return v;
        }
    }
}
