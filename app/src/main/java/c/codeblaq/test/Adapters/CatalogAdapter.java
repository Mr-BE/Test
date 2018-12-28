package c.codeblaq.test.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import c.codeblaq.test.CategoryCatalogActivity;
import c.codeblaq.test.DataManager;
import c.codeblaq.test.Category;
import c.codeblaq.test.FullDetailsActivity;
import c.codeblaq.test.Location;
import c.codeblaq.test.R;

public class CatalogAdapter extends RecyclerView.Adapter<CatalogAdapter.ViewHolder> {

    private Context mContext;
    private List<Category> mCategories;
    private final LayoutInflater mLayoutInflater;

    private DataManager mDataManager = DataManager.getInstance();

    public CatalogAdapter(Context context, List<Category> categories) {
        mContext = context;
        this.mCategories = categories;
        this.mLayoutInflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = mLayoutInflater.inflate(R.layout.item_horizontal_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       Category category = mCategories.get(position);
       holder.mCatalogImage.setImageResource(category.getImageInCat());
       holder.mCatalogLocation.setText(category.getLocationInCat());
    }

    @Override
    public int getItemCount() {
        return mCategories.size();

    }

    /** Horizontal view holder*/
    public class ViewHolder extends RecyclerView.ViewHolder{

        public final ImageView mCatalogImage;
        public final TextView mCatalogLocation;
        public int mCurrentPosition;


        public ViewHolder(View itemView) {
            super(itemView);
            //Get image
            mCatalogImage = itemView.findViewById(R.id.attraction_image_horizontal);
            mCatalogLocation = itemView.findViewById(R.id.attraction_name_horizontal);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, CategoryCatalogActivity.class);
                    intent.putExtra(FullDetailsActivity.LOCATION_POSITION, mCurrentPosition);
                    mContext.startActivity(intent);
                }
            });
        }
    }


}
