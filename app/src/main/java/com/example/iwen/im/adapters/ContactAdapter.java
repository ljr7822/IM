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
 * 联系人适配器
 * author : Iwen大大怪
 * create : 2020/11/9 11:05
 */
public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder>  {

    private List<ItemData> mRoomList;

    public ContactAdapter(List<ItemData> msgList){
        mRoomList = msgList;
    }

    @NonNull
    @Override
    public ContactAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_item,parent,false);
        return new ContactAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.ViewHolder holder, int position) {
        ItemData itemData = mRoomList.get(position);
        holder.mIconImg.setImageResource(itemData.drawable);
        holder.mUserName.setText(itemData.userName);
        holder.mMessage.setText(itemData.Message);
    }

    @Override
    public int getItemCount() {
        return mRoomList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mIconImg;
        TextView mUserName;
        TextView mMessage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mIconImg = itemView.findViewById(R.id.contact_icon_image_view);
            mUserName = itemView.findViewById(R.id.username_text_view);
            mMessage = itemView.findViewById(R.id.message_text_view);
        }
    }
}
