package c.codeblaq.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import c.codeblaq.test.FullDetailsActivity;

import static c.codeblaq.test.FullDetailsActivity.LOCATION_POSITION;
import static c.codeblaq.test.FullDetailsActivity.POSITION_NOT_SET;

public class CategoryCatalogActivity extends AppCompatActivity {
    //Locate Views to be bound
    @BindView(R.id.attraction_image_horizontal)
    ImageView catalogImage;
    @BindView(R.id.attraction_name_horizontal)
    TextView catalogLocName;
    private Category mCategory;
    //Location position
    private  int mLocationPosition ;
    //DataManager Instance
    private DataManager mDataManager = DataManager.getInstance();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_horizontal_list);

        ButterKnife.bind(this);
        readDisplayValues();
        displayValues(catalogImage, catalogLocName);
    }

    private void displayValues(ImageView catalogImage, TextView catalogLocName) {
        catalogImage.setImageResource(mCategory.getImageInCat());
       String a = mCategory.getLocationInCat();
        catalogLocName.setText(mCategory.getLocationInCat());
    }

    private void readDisplayValues() {
        Intent intent = getIntent();
        //get position from intent
        mLocationPosition = intent.getIntExtra(LOCATION_POSITION, POSITION_NOT_SET);
        if(mLocationPosition!= POSITION_NOT_SET) //position exists in list
            mCategory = mDataManager.getCategories().get(mLocationPosition);
    }
}
