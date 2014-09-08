package mindmine.com.welcometol;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import mindmine.com.welcometol.model.Country;

/**
 * Created by Trey Robinson on 8/3/14.
 * Copyright 2014 MindMine LLC.
 */
public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder>{

    private List<Country> countries;
    private int rowLayout;
    private Context mContext;

    public CountryAdapter(List<Country> countries, int rowLayout, Context context) {
        this.countries = countries;
        this.rowLayout = rowLayout;
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(rowLayout, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Country country = countries.get(i);
        viewHolder.countryName.setText(country.name);
        viewHolder.countryImage.setImageDrawable(mContext.getDrawable(country.getImageResourceId(mContext)));
    }

    @Override
    public int getItemCount() {
        return countries == null ? 0 : countries.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView countryName;
        public ImageView countryImage;

        public ViewHolder(View itemView) {
            super(itemView);
            countryName = (TextView) itemView.findViewById(R.id.countryName);
            countryImage = (ImageView)itemView.findViewById(R.id.countryImage);
        }

    }
}
