package c.codeblaq.test.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import c.codeblaq.test.Category;
import c.codeblaq.test.DataManager;
import c.codeblaq.test.FullDetailsActivity;
import c.codeblaq.test.Location;
import c.codeblaq.test.R;

import static c.codeblaq.test.FullDetailsActivity.LOCATION_POSITION;

public class LocationRecyclerAdapter extends RecyclerView.Adapter<LocationRecyclerAdapter.ViewHolder> {
    //Context for Activity
    private final Context mContext;
    private final LayoutInflater mLayoutInflater;
    //    List for locations
    private final List<Location> mLocations;

    /*Constructor*/
    public LocationRecyclerAdapter(Context context, List<Location> locations) {
        mContext = context;
        mLocations = locations;
        mLayoutInflater = LayoutInflater.from(mContext);
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       //Create a view for the View Holder
//        View itemView = mLayoutInflater.inflate(R.layout.item_horizontal_list, parent,false);
        View itemView = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_horizontal_list, parent, false
        );
        return new ViewHolder(itemView);
    }
    /*Bind data to views*/
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
                 //Get location corresponding to location
        Location location = mLocations.get(position);

                //Get each value from View Holder
                holder.mAttractionImage.setImageResource(location.getmPrimaryImageResource());
                holder.mAttractionText.setText(location.getmAttractionName());
//        holder.mAttractionLocationText.setText(location.getmLocationName());
                holder.mCurrentPosition = position;

    }

    /*Determine list size*/
    @Override
    public int getItemCount() {
        return mLocations.size();
    }

    /**View Holder class*/

public class ViewHolder extends RecyclerView.ViewHolder{

public  final TextView mAttractionText;
public final ImageView mAttractionImage;
//public final TextView mAttractionLocationText;
//ViewHolder position
        public int mCurrentPosition;

    public ViewHolder(View itemView) {
        super(itemView);
       //Get References to items for Locations
        mAttractionText = itemView.findViewById(R.id.attraction_name_horizontal);
        mAttractionImage = itemView.findViewById(R.id.attraction_image_horizontal);
//        mAttractionLocationText = itemView.findViewById(R.id.location_name);

        //Set up OnClickListener
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, FullDetailsActivity.class);
                intent.putExtra(LOCATION_POSITION, mCurrentPosition );
                mContext.startActivity(intent);
            }
        });
    }
}
}
