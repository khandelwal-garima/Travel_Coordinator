package com.travelbphc;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.travelbphc.R;
import com.travelbphc.travelList;

import java.util.ArrayList;

/**
 * Created by Garima on 26-07-2018.
 */

public class ListAdapter extends ArrayAdapter<travelList> {

    public ListAdapter(Activity context, ArrayList<travelList> lists){
        super(context,0,lists);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        travelList currentList = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView w =  listItemView.findViewById(R.id.name_profile);
        w.setText(currentList.getmProfileName());

        TextView x =  listItemView.findViewById(R.id.time_group);
        x.setText(currentList.getmTimeTravel());

        // Find the TextView in the list_item.xml layout with the ID version_number
        ImageView Image =  listItemView.findViewById(R.id.image);
        Image.setImageResource(currentList.getmProfileImage());


        return listItemView;
    }




}
