package com.example.integrationcalender;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class CalendarAdapter extends BaseAdapter {
    private Context context;
   private ArrayList<Calendars> cal;
    private ArrayList<Calendars> filterData;

    public CalendarAdapter(@NonNull Context context, ArrayList<Calendars> calendars) {
        this.context = context;
        this.cal = calendars;
        filterData =new ArrayList<Calendars>();
        filterData.addAll(this.cal);
    }
    @Override
    public int getCount() {
    return filterData.size();
    }
    @Nullable
    @Override
    public Calendars getItem(int position) {
        return filterData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.cal_list, parent, false);
        }
        Calendars calendar = getItem(position);
        TextView titleView = view.findViewById(R.id.title_event);
        titleView.setText(calendar.getTitle());

        TextView locationView = view.findViewById(R.id.location);
        locationView.setText(calendar.getLocation());

        TextView startTimeView = view.findViewById(R.id.start_time);
        startTimeView.setText(calendar.getStartTime());

        TextView endTimeView = view.findViewById(R.id.end_time);

        endTimeView.setText(calendar.getEndTime());
        return view;
    }

}