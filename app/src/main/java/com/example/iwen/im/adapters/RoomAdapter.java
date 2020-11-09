package com.example.iwen.im.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.iwen.im.R;
import com.example.iwen.im.model.ItemData;

import java.util.List;

/**
 * 房间适配器
 * author : Iwen大大怪
 * create : 2020/11/9 10:24
 */

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.ViewHolder> {

    private List<ItemData> mRoomList;

    public RoomAdapter(List<ItemData> msgList){
        mRoomList = msgList;
    }

    @NonNull
    @Override
    public RoomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.room_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RoomAdapter.ViewHolder holder, int position) {
        ItemData itemData = mRoomList.get(position);
        holder.mIconImg.setImageResource(itemData.drawable);
        holder.mMessage.setText(itemData.Message);
    }

    @Override
    public int getItemCount() {
        return mRoomList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        RecyclerView mRecyclerView;
        ImageView mIconImg;
        TextView mMessage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //mRecyclerView = itemView.findViewById(R.id.recycler_view_room);
            mIconImg = itemView.findViewById(R.id.contact_icon_image_view);
            mMessage = itemView.findViewById(R.id.room_num);
        }
    }
}
