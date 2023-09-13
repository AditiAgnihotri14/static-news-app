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

public class PoliticalAdapter extends BaseAdapter {

    Context context;
    ArrayList<PoliticalPojo> politicalPojos;

    public PoliticalAdapter(Context context, ArrayList<PoliticalPojo> politicalPojos) {
        this.context = context;
        this.politicalPojos = politicalPojos;
    }

    @Override
    public int getCount() {
        return politicalPojos.size();
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

        convertView= LayoutInflater.from(context).inflate(R.layout.political_custum_view,parent,false);

        TextView title = convertView.findViewById(R.id.title_political);

        ImageView image = convertView.findViewById(R.id.image_political);

        title.setText(politicalPojos.get(position).getTitle());

        image.setImageResource(politicalPojos.get(position).getImages());

        View finalView = convertView;

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Position " + position, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent( finalView.getContext(),PoliticalWebView.class);
                intent.putExtra("news_story_political",position);
                context.startActivity(intent);
            }
        });

        return convertView;

    }
}
