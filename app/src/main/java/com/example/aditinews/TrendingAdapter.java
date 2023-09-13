package com.example.aditinews;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TrendingAdapter extends BaseAdapter {
    Context context;
    ArrayList<TrendingPojo> trendingPojos;

    public TrendingAdapter(Context context, ArrayList<TrendingPojo> trendingPojos) {
        this.context = context;
        this.trendingPojos = trendingPojos;
    }

    @Override
    public int getCount() {
        return trendingPojos.size();
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

        view= LayoutInflater.from(context).inflate(R.layout.trending_custum_view,viewGroup,false);

        TextView title = view.findViewById(R.id.title_trending);

        ImageView image = view.findViewById(R.id.image_trending);

        title.setText(trendingPojos.get(i).getTitle());

        image.setImageResource(trendingPojos.get(i).getImages());

        View finalView = view;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Position " + i, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent( finalView.getContext(),TrendingWebView.class);
                intent.putExtra("news_story_trending",i);
                context.startActivity(intent);
            }
        });

        return view;
    }
}
