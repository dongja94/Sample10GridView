package com.example.dongja94.samplegridview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dongja94 on 2016-01-18.
 */
public class MyAdapter extends BaseAdapter {
    List<ImageTextData> items = new ArrayList<ImageTextData>();

    public void add(ImageTextData data) {
        items.add(data);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemView view;
        if (convertView == null) {
            view = new ItemView(parent.getContext());
        } else {
            view = (ItemView)convertView;
        }
        view.setImageTextData(items.get(position));
        return view;
    }
}
