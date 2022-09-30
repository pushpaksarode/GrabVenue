package com.example.grabvenue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class VenueListAdapter extends BaseAdapter {

    Context context;
    String listVenue[];
    int listLogo[];
    LayoutInflater inflater;

    public VenueListAdapter(Context ctx, String[] venueTitles, int[] venueLogos){
        this.context = ctx;
        this.listVenue = venueTitles;
        this.listLogo = venueLogos;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return listVenue.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View convertView = inflater.inflate(R.layout.activity_venueitemlist, null);
        TextView txtView = convertView.findViewById(R.id.venueTitle);
        ImageView venueLogo = convertView.findViewById(R.id.venueLogo);
        txtView.setText(listVenue[i]);
        venueLogo.setImageResource(listLogo[i]);
        return convertView;
    }
}
