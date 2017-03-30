package com.cclz.myapp_170330_03;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by YVTC on 2017/3/30.
 */

public class MyAdapter extends BaseAdapter {

    Context context;
//    String data[];
//    String data2[];
    ArrayList<String>data;

//    public MyAdapter(Context c, String[] d, String d2[]){
    public MyAdapter(Context c, ArrayList<String>d){
        context=c;
        data=d;
//        data2=d2;
    }



    @Override
    public int getCount() {
//        return data.length;
        return data.size();
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
        View v=((Activity)context).getLayoutInflater().inflate(R.layout.myitem, null);  // 自訂Layout
//            TextView tv=new TextView(MainActivity.this);
        TextView tv=(TextView)v.findViewById(R.id.textView);    // 自訂 tv 大型字體
//        TextView tv2=(TextView)v.findViewById(R.id.textView2);    // 自訂 tv 大型字體
//        tv.setText(data[position]);
//        tv2.setText(data2[position]);
        tv.setText(data.get(position));
//            return tv;
        return v;
    }
}
