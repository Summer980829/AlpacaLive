package com.mercy.alpacalive.adapter;


import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;

public class EventListAdapter extends ArrayAdapter<EventList> {


    public EventListAdapter(@NonNull Context context, int resource, @NonNull List<EventList> list) {
        super(context, resource, list);
    }
}
