package com.example.bayrammuradovmustafa.crocusofttask2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter{

    //properties
    ArrayList<MyModel> myModelList;
    Context context;
    //constructor
    public MyAdapter(Context cntxt, ArrayList<MyModel> myModelList) {
            this.myModelList=myModelList;
            context= cntxt;
    }

    @Override
    public int getCount() {
        return myModelList.size();
    }

    //methods
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
        ViewHolder holder;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        if (view == null) {
            view = inflater.inflate(R.layout.my_layout, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        holder.profilePic.setImageResource(myModelList.get(i).getImage());
        holder.myMessage.setText(myModelList.get(i).getMessage());
        holder.myTime.setText(myModelList.get(i).getTime());

        return view;
    }

}
