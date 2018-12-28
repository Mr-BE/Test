package c.codeblaq.test;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DynamicListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final  int CATEGORY_LIST_ITEM_VIEW = 1;
    private static final int CATEGORY_LIST_ITEM_HEADER_VIEW =2;
    private static final int LOCATION_LIST_ITEM_VIEW = 3;

    private ArrayList<Category> mCategoryArrayList= new ArrayList<>();
    private ArrayList<Location> mLocationArrayList = new ArrayList<>();

    public DynamicListAdapter() {
    }

    public void setCategoryArrayList(ArrayList<Category> categoryArrayList) {
        mCategoryArrayList = categoryArrayList;
    }

    public void setLocationArrayList(ArrayList<Location> locationArrayList) {
        mLocationArrayList = locationArrayList;
    }

    /*View holder Subclass*/
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView mCategoryName;

        private ImageView mAttractionImage;
        private TextView mAttractionLocation;


        public ViewHolder(final View itemView) {
            //get element of Category list
            super(itemView);
            mCategoryName = itemView.findViewById(R.id.attraction_category_name);

        //nested list
            mAttractionImage = itemView.findViewById(R.id.attraction_image_horizontal);
            mAttractionLocation = itemView.findViewById(R.id.attraction_name_horizontal);
        }



        /*Second list*/
        public void bindNestedList (int pos){

            if (mLocationArrayList == null) pos = pos -1;
            else {
                if (mLocationArrayList.size() == 0 ) pos = pos-1;
                else pos = pos - mLocationArrayList.size() -2;
            }
            int attractionImage = mLocationArrayList.get(pos).getmPrimaryImageResource();
            String attractionLocation = mLocationArrayList.get(pos).getmLocationName();

            mAttractionImage.setImageResource(attractionImage);
            mAttractionLocation.setText(attractionLocation);
        }

        /*First List (Category List)*/
        public void bindCategoryList (int pos){
            pos = pos-1;
            String categoryName = mCategoryArrayList.get(pos).getCategoryName();

            mCategoryName.setText(categoryName);

        }

    }
    public class CategoryListViewHolder extends ViewHolder{
        public CategoryListViewHolder(View itemView) {
            super(itemView);
        }
        public class CategoryListHeaderViewHolder extends ViewHolder{

            public CategoryListHeaderViewHolder(View itemView) {
                super(itemView);
            }
        }
    }

    public class NestedListViewHolder extends ViewHolder{

        public NestedListViewHolder(View itemView) {
            super(itemView);
        }
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        if (viewType == LOCATION_LIST_ITEM_VIEW) {
            view = LayoutInflater.from(parent.getContext()).inflate(
                    R.layout.item_horizontal_list, parent, false);
            NestedListViewHolder viewHolder = new NestedListViewHolder(view);
            return viewHolder;
        }
//        else (viewType == CATEGORY_LIST_ITEM_VIEW){
        else{
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_attraction, parent, false);
            CategoryListViewHolder viewHolder = new CategoryListViewHolder(view);
            return viewHolder;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        try{
            if (holder instanceof NestedListViewHolder){
                NestedListViewHolder viewHolder = (NestedListViewHolder) holder;
                viewHolder.bindNestedList(position);
            }
            else if (holder instanceof CategoryListViewHolder){
                CategoryListViewHolder viewHolder = (CategoryListViewHolder) holder;
                viewHolder.bindCategoryList(position);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        int categoryListSize = 0;
        int locationListSize = 0;

        if (mLocationArrayList == null && mCategoryArrayList == null)
            return 0;

            if (mLocationArrayList != null){
                locationListSize = mLocationArrayList.size();
            return locationListSize;}

            if (mCategoryArrayList != null)
                categoryListSize = mCategoryArrayList.size();
            return categoryListSize;
    }

    @Override
    public int getItemViewType(int position) {
        int categoryListSize = 0;
        int locationListSize = 0;

        if (mLocationArrayList == null && mCategoryArrayList == null)
            return super.getItemViewType(position);

        if (mLocationArrayList != null)
            locationListSize = mLocationArrayList.size();
        if (mCategoryArrayList != null)
            categoryListSize = mCategoryArrayList.size();
        return super.getItemViewType(position);
    }
}
