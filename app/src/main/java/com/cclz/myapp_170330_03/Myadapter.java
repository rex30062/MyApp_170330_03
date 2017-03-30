package com.cclz.myapp_170330_03;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
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
    public boolean chks[];
    public MyAdapter(Context c, ArrayList<String>d){
        context=c;
        data=d;
        chks =new boolean[d.size()];
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        Log.d("MyView", "p:" + position);
        View v=((Activity)context).getLayoutInflater().inflate(R.layout.myitem, null);  // 自訂Layout
        TextView tv=(TextView)v.findViewById(R.id.textView);    // 自訂 tv 大型字體
        CheckBox chk=(CheckBox)v.findViewById(R.id.checkBox);
        chk.setChecked(chks[position]);
        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                chks[position] = isChecked;
            }
        });
        tv.setText(data.get(position));

        return v;
    }
}
