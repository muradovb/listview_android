package com.example.bayrammuradovmustafa.crocusofttask2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static java.security.AccessController.getContext;

public class Welcome extends AppCompatActivity {
    Context cntxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        cntxt=Welcome.this;
        ListView myListView = (ListView) findViewById(R.id.listView);
        ArrayList<MyModel> myModelArrayList=fillList(12);
        //if(()!=null) {
            MyAdapter myAdapter = new MyAdapter(cntxt, myModelArrayList );
            myListView.setAdapter(myAdapter);
        //}
    }


    public static ArrayList<MyModel> fillList(int itemSize) {

        //getting data
        int[] MyImages = {R.drawable.cat1, R.drawable.cat2, R.drawable.cat3, R.drawable.cat4, R.drawable.cat5, R.drawable.cat6,
                R.drawable.cat7, R.drawable.cat8, R.drawable.cat9, R.drawable.cat1, R.drawable.cat2, R.drawable.cat3};
        String[] ImageTimes = {"21 20", "21 30", "21 40", "21 50", "22 30", "22 40", "22 50", "23 00", "00 00",
                "21 20", "21 30", "21 40"};
        String[] Descriptions = {"meow", "meouv", "meaw", "miiiaa", "mieaaa", "muaaai",
                "meoww", "meaiu", "meai", "meou", "meouv", "meai"};

        //filling array with data
        ArrayList<MyModel> myModelList= new ArrayList<MyModel>();
        for (int i = 0; i < itemSize; i++) {
            //create a temporary model instance
            MyModel temp = new MyModel();
            //fill it with required data
            temp.setMessage(Descriptions[i]);
            temp.setTime(ImageTimes[i]);
            temp.setMyImages(MyImages[i]);
            //add it to global arraylist
            myModelList.add(temp);
        }
        return myModelList;
    }


}
