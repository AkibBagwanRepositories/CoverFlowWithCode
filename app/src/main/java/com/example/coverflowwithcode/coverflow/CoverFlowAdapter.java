package com.example.coverflowwithcode.coverflow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by Bagwan Akib Rafiq on 10/29/2019.
 */
public class CoverFlowAdapter extends BaseAdapter {

    private int text_view_id, resource, image_id;
    private ArrayList<GameEntity> mData = new ArrayList<>(0);
    private Context mContext;

    public CoverFlowAdapter(Context context, int resource, int text_view_id, int image_resource_id) {
        mContext = context;
        this.resource = resource;
        this.text_view_id = text_view_id;
        this.image_id = image_resource_id;
    }

    public void setData(ArrayList<GameEntity> data) {
        mData = data;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int pos) {
        return mData.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = convertView;

        if (rowView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(resource, null);

            ViewHolder viewHolder = new ViewHolder();
            viewHolder.text = (TextView) rowView.findViewById(text_view_id);
            viewHolder.image = (ImageView) rowView
                    .findViewById(image_id);
            rowView.setTag(viewHolder);
        }

        ViewHolder holder = (ViewHolder) rowView.getTag();

        holder.image.setImageResource(mData.get(position).imageResId);
        if (mData.get(position) != null && holder.text != null)
            holder.text.setText(position+"");

        return rowView;
    }


    static class ViewHolder {
        public TextView text;
        public ImageView image;
    }

    public static class GameEntity {
        public int imageResId;
        public int titleResId;

        public GameEntity(int imageResId, int titleResId) {
            this.imageResId = imageResId;
            this.titleResId = titleResId;
        }
    }
}

