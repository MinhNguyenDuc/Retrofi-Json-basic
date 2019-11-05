package com.example.jsonbasic;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adapter extends BaseAdapter {

    private List<PostModel> listNews;
    private Activity activity;

    public Adapter(){

    }

    public Adapter(List<PostModel> listNews, Activity activity) {
        this.listNews = listNews;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return listNews.size();
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
        if(convertView == null){
            LayoutInflater layoutInflater = activity.getLayoutInflater();
            convertView = layoutInflater.inflate(R.layout.activity_main, parent, false);
            ViewHolder holder = new ViewHolder();
            holder.tvTitle = convertView.findViewById(R.id.tvTitle);
            holder.tvContent = convertView.findViewById(R.id.tvContent);
            holder.tvDate = convertView.findViewById(R.id.tvDate);
            holder.imgCover = convertView.findViewById(R.id.imgCover);
            convertView.setTag(holder);
        }

        ViewHolder holder = (ViewHolder) convertView.getTag();
        PostModel model = listNews.get(position);
        holder.tvTitle.setText(model.getTitle().getRendered());
        holder.tvDate.setText(model.getDate());
        if(model.getExcerpt() != null){
            holder.tvContent.setText(model.getExcerpt().getRendered());
        }
        if(model.getBetter_featureed_image() != null){
            Glide.with(activity).load(model.getBetter_featureed_image().getSource_url()).into(holder.imgCover);
        }
        return convertView;
    }

    public static class ViewHolder {
        TextView tvTitle;
        TextView tvDate;
        ImageView imgCover;
        TextView tvContent;
    }
}
