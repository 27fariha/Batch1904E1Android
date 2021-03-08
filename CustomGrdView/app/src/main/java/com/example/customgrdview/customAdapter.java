package com.example.customgrdview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class customAdapter extends BaseAdapter {
    Context context;
    int[] images_index;
    LayoutInflater inflater;

    public customAdapter(Context context, int[] images_index) {
        this.context = context;
        this.images_index = images_index;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return images_index.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.grid_layout,null);
        ImageView a=view.findViewById(R.id.imageView);
        a.setImageResource(images_index[i]);

        return view;
    }
}
