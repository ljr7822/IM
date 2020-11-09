package com.example.iwen.im.ui.contact;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.iwen.im.R;
import com.example.iwen.im.adapters.ContactAdapter;
import com.example.iwen.im.adapters.RoomAdapter;
import com.example.iwen.im.model.ItemData;
import com.example.iwen.im.ui.room.RoomViewModel;

import java.util.ArrayList;
import java.util.List;

public class ContactFragment extends Fragment {

    private ContactFragment contactFragment;
    private List<ItemData> mList;
    private int mDrawable;
    private ItemData mItem;
    ContactAdapter contactAdapter;

    private ContactViewModel contactViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        contactViewModel =
                ViewModelProviders.of(this).get(ContactViewModel.class);
        View root = inflater.inflate(R.layout.fragment_contact, container, false);
        final RecyclerView recyclerView = root.findViewById(R.id.recycler_view_contact);
        mList = generateDummyList(50);
        contactAdapter = new ContactAdapter(mList);
        recyclerView.setAdapter(contactAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        return root;
    }

    private List<ItemData> generateDummyList(int size) {

        mList = new ArrayList<ItemData>();
        for (int i = 0; i < size; i++) {
            mDrawable = R.drawable.bm;
            mItem = new ItemData(mDrawable, "UserName", "message");
            mList.add(mItem);
        }
        return mList;
    }
}