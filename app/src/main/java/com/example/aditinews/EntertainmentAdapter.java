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

public class EntertainmentAdapter extends BaseAdapter {

    Context context;
    ArrayList<EntertainmentPojo> entertainmentPojos;

    public EntertainmentAdapter(Context context, ArrayList<EntertainmentPojo> entertainmentPojos) {
        this.context = context;
        this.entertainmentPojos = entertainmentPojos;
    }

    @Override
    public int getCount() {
        return entertainmentPojos.size();
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

        convertView= LayoutInflater.from(context).inflate(R.layout.entertainment_custum_view,parent,false);

        TextView title = convertView.findViewById(R.id.title_entertainment);

        ImageView image = convertView.findViewById(R.id.image_entertainment);

        title.setText(entertainmentPojos.get(position).getTitle());

        image.setImageResource(entertainmentPojos.get(position).getImages());

        View finalView = convertView;

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Position " + position, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent( finalView.getContext(),EntertainmentWebView.class);
                intent.putExtra("news_story_entertainment",position);
                context.startActivity(intent);
            }
        });

        return convertView;
    }
}
