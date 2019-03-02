package com.example.siebster.eventfriend;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Siebe on 1/03/2019.
 */

public class ChatListActivity extends AppCompatActivity {
    private List<Event> eventList;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatlist);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);

        eventList = new ArrayList<>();
        Event wth = new Event("WhatTheHack");
        Event ifr = new Event("Interfacultaire RockRally");
        Event bel = new Event("Beleuvenissen 2019");
        eventList.add(wth);
        eventList.add(ifr);
        eventList.add(bel);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        mAdapter = new Adapter(eventList);
        recyclerView.setAdapter(mAdapter);
    }
}
