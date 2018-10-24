package com.example.bayrammuradovmustafa.crocusofttask2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder {
    //properties
    ImageView profilePic;
    TextView myMessage;
    TextView myTime;

    //constructor
    ViewHolder(View view) {
        profilePic = (ImageView) view.findViewById(R.id.image);
        myMessage = (TextView) view.findViewById(R.id.tv_description);
        myTime = (TextView) view.findViewById(R.id.tv_time);
    }

}
