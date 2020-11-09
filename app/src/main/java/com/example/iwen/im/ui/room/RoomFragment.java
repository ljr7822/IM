package com.example.iwen.im.ui.room;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.iwen.im.R;
import com.example.iwen.im.adapters.RoomAdapter;
import com.example.iwen.im.model.ItemData;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RoomFragment extends Fragment {

    private RoomViewModel roomViewModel;
    private List<ItemData> mList;
    private int mDrawable;
    private ItemData mItem;
    RoomAdapter roomAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        roomViewModel = ViewModelProviders.of(this).get(RoomViewModel.class);
        View root = inflater.inflate(R.layout.fragment_room, container, false);
        final RecyclerView recyclerView = root.findViewById(R.id.recycler_view_room);
        mList = generateDummyList(50);
        roomAdapter = new RoomAdapter(mList);
        recyclerView.setAdapter(roomAdapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);
        return root;
    }

    private List<ItemData> generateDummyList(int size) {

        mList = new ArrayList<ItemData>();
        for (int i = 0; i < size; i++) {
            mDrawable = R.drawable.img_5;
            mItem = new ItemData(mDrawable, "1", "6889大大怪");
            mList.add(mItem);
        }
        return mList;
    }
}