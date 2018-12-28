//package c.codeblaq.test;
//
//import android.os.Parcel;
//import android.os.Parcelable;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Location implements Parcelable {
//
//    private final String mCategoryId;
//    private final List<Location> mLocations;
//    //Parcelable Creator
//    public static final Parcelable.Creator<AttractionCategory> CREATOR =
//            new Parcelable.Creator<AttractionCategory>(){
//
//                @Override
//                public AttractionCategory createFromParcel(Parcel source) {
//                    return new AttractionCategory(source);
//                }
//
//                @Override
//                public AttractionCategory[] newArray(int size) {
//                    return new AttractionCategory[size];
//                }
//            };
//
//
//    public AttractionCategory(String categoryId, List<Location> locations) {
//       this.mCategoryId = categoryId;
//       this.mLocations = locations;
//    }
//
//    private AttractionCategory(Parcel source) {
//        mCategoryId = source.readString();
//        mLocations = new ArrayList<>();
//        source.readTypedList(mLocations, Location.CREATOR);
//
//    }
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeString(mCategoryId);
//        dest.writeTypedList(mLocations);
//    }
//
//    public String getCategoryId() {
//        return mCategoryId;
//    }
//
//    public List<Location> getLocations() {
//        return mLocations;
//    }
//}
