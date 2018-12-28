package c.codeblaq.test;

import java.util.ArrayList;
import java.util.List;


public class DataManager {
       //Data manager instance
    private static DataManager ourInstance = null;

    //Set up array list
    private List<Location> mLocations = new ArrayList<>();
    private List<Category> mCategories = new ArrayList<>();

    private List<Location> mHistoricalLocations = new ArrayList<>();
    private List<Location> mArtLocations = new ArrayList<>();
    private List<Location> mCulturalLocations = new ArrayList<>();


    //Constructor
    public DataManager() {
    }

    /*Data Manager Instance*/
    public static DataManager getInstance(){
        if (ourInstance == null){
            ourInstance = new DataManager();
//            ourInstance.initializeHistoricalLocations();
//            ourInstance.initializeArtCategory();
            ourInstance.initializeCategories();
        }
        return ourInstance;
    }
    /*Set up categories*/
    private void initializeCategories() {
//        mCategories.add(new Category("Historical", initializeHistoricalCategory()));
//        mCategories.add(new Category("Art", mArtLocations));
//        mCategories.add(new Category("Culture", initializeCulture()));
//        mCategories.add(new Category("Fiestas", initializeHistoricalCategory()));
//        mCategories.add(new Category("Sports", initializeHistoricalCategory()));
//        mCategories.add(new Category("Nature", initializeHistoricalCategory()));
//        mCategories.add(new Category("Resort", initializeHistoricalCategory()));
//        mCategories.add(new Category("Festivals", initializeHistoricalCategory()));

//        return mCategories;

        mCategories.add(initializeCat1());
        mCategories.add(initializeCat2());
        mCategories.add(initializeCat3());
    }
    //Historical attraction Initialisation
//    private void initializeHistoricalLocations(){
//        mLocations.add(new Location("Old Residency","Calabar", R.drawable.old_residency, "This was originally the residence of the highest ranked\n" +
//                "    British personnel in Calabar. It had been transformed to the residence of the military governors\n" +
//                "    during the military regime in Nigeria.\n" +
//                "        \\nHowever, today, it serves a different purpose of a multifaceted museum.\n" +
//                "    "));
//        mLocations.add(new Location("Hope Waddell Training Institution","Calabar", R.drawable.hopewaddell, "Established in 1895, this is one of the oldest institutions in the Nigeria.\\n\n" +
//                "        Originally set up as a base for arriving Scottish missionaries, it quickly transformed\n" +
//                "        into an educational and skills acquisition center."));
//        mLocations.add(new Location("Slave History Museum", "Calabar", R.drawable.slavehistorymuseum1, "Located in the Marina Resort along the Calabar harbour,\n" +
//                "    the Slave History Museum shows explicitly, the travails of Nigeria slaves who were sold\n" +
//                "    through the Calabar sea port."));
//    }
    //Art attraction initialisation
    private List<Location> initializeArtCategory() {
        mArtLocations.add(new Location("Art1","artL1", R.mipmap.ic_launcher_round, "Art1 \nThis was originally the residence of the highest ranked\n" +
                "    British personnel in Calabar. It had been transformed to the residence of the military governors\n" +
                "    during the military regime in Nigeria.\n" +
                "        \\nHowever, today, it serves a different purpose of a multifaceted museum.\n" +
                "    ","Historical"));
        mArtLocations.add(new Location("Art2","artL2", R.drawable.ic_menu_send, "Art2 \nEstablished in 1895, this is one of the oldest institutions in the Nigeria.\\n\n" +
                "        Originally set up as a base for arriving Scottish missionaries, it quickly transformed\n" +
                "        into an educational and skills acquisition center.","Historical"));
        mArtLocations.add(new Location("Art3", "artL3", R.drawable.ic_menu_share, "Art3 \nLocated in the Marina Resort along the Calabar harbour,\n" +
                "    the Slave History Museum shows explicitly, the travails of Nigeria slaves who were sold\n" +
                "    through the Calabar sea port.","Historical"));

        return mArtLocations;
    }
    private List<Location> initializeCulture() {
        mCulturalLocations.add(new Location("Culture 1","cultureLoc1", R.mipmap.ic_launcher_round, "Cullture 1 \nThis was originally the residence of the highest ranked\n" +
                "    British personnel in Calabar. It had been transformed to the residence of the military governors\n" +
                "    during the military regime in Nigeria.\n" +
                "        \\nHowever, today, it serves a different purpose of a multifaceted museum.\n" +
                "    ","Culture"));
        mArtLocations.add(new Location("Culture 2","cultureLoc2", R.drawable.ic_menu_send, "Culture 2 \nEstablished in 1895, this is one of the oldest institutions in the Nigeria.\\n\n" +
                "        Originally set up as a base for arriving Scottish missionaries, it quickly transformed\n" +
                "        into an educational and skills acquisition center.","Culture"));
        mArtLocations.add(new Location("Culture 3", "cultureLoo3", R.drawable.ic_menu_share, "Culture 3 \nLocated in the Marina Resort along the Calabar harbour,\n" +
                "    the Slave History Museum shows explicitly, the travails of Nigeria slaves who were sold\n" +
                "    through the Calabar sea port.","Culture"));

        return mCulturalLocations;
    }
    //initialise data for historical activity
    private List<Location> initializeHistoricalCategory(){

        mHistoricalLocations.add(new Location("Old Residency","History Loc1", R.drawable.old_residency, "History1 \n This was originally the residence of the highest ranked\n" +
                "    British personnel in Calabar. It had been transformed to the residence of the military governors\n" +
                "    during the military regime in Nigeria.\n" +
                "        \\nHowever, today, it serves a different purpose of a multifaceted museum.\n" +
                "    ","Historical"));
        mHistoricalLocations.add(new Location("Hope Waddell Training Institution","History Loc2", R.drawable.hopewaddell, "History 2 \nEstablished in 1895, this is one of the oldest institutions in the Nigeria.\\n\n" +
                "        Originally set up as a base for arriving Scottish missionaries, it quickly transformed\n" +
                "        into an educational and skills acquisition center.","Historical"));
        mHistoricalLocations.add(new Location("Slave History Museum", "History Loc 3", R.drawable.slavehistorymuseum1, "History 3 \nLocated in the Marina Resort along the Calabar harbour,\n" +
                "    the Slave History Museum shows explicitly, the travails of Nigeria slaves who were sold\n" +
                "    through the Calabar sea port.","Historical"));

       return mHistoricalLocations;
    }
    private Category initializeCat1(){
        List<Location> locations = new ArrayList<>();
        locations.add(new Location("Old Residency","History Loc1", R.drawable.old_residency, "History1 \n This was originally the residence of the highest ranked\n" +
                "    British personnel in Calabar. It had been transformed to the residence of the military governors\n" +
                "    during the military regime in Nigeria.\n" +
                "        \\nHowever, today, it serves a different purpose of a multifaceted museum.\n" +
                "    ","Historical"));
        locations.add(new Location("Hope Waddell Training Institution","History Loc2", R.drawable.hopewaddell, "History 2 \nEstablished in 1895, this is one of the oldest institutions in the Nigeria.\\n\n" +
                "        Originally set up as a base for arriving Scottish missionaries, it quickly transformed\n" +
                "        into an educational and skills acquisition center.","Historical"));
        locations.add(new Location("Slave History Museum", "History Loc 3", R.drawable.slavehistorymuseum1, "History 3 \nLocated in the Marina Resort along the Calabar harbour,\n" +
                "    the Slave History Museum shows explicitly, the travails of Nigeria slaves who were sold\n" +
                "    through the Calabar sea port.","Historical"));

        return new Category("Historical",locations);
    }

    private Category initializeCat2(){
        List<Location> locations = new ArrayList<>();
        locations.add(new Location("Art1","artL1", R.mipmap.ic_launcher_round, "Art1 \nThis was originally the residence of the highest ranked\n" +
                "    British personnel in Calabar. It had been transformed to the residence of the military governors\n" +
                "    during the military regime in Nigeria.\n" +
                "        \\nHowever, today, it serves a different purpose of a multifaceted museum.\n" +
                "    ","Historical"));
        locations.add(new Location("Art2","artL2", R.drawable.ic_menu_send, "Art2 \nEstablished in 1895, this is one of the oldest institutions in the Nigeria.\\n\n" +
                "        Originally set up as a base for arriving Scottish missionaries, it quickly transformed\n" +
                "        into an educational and skills acquisition center.","Historical"));
        locations.add(new Location("Art3", "artL3", R.drawable.ic_menu_share, "Art3 \nLocated in the Marina Resort along the Calabar harbour,\n" +
                "    the Slave History Museum shows explicitly, the travails of Nigeria slaves who were sold\n" +
                "    through the Calabar sea port.","Historical"));
        return new Category("Art",locations);
    }

    private Category initializeCat3(){
        List<Location> locations = new ArrayList<>();
        locations.add(new Location("Culture 1","cultureLoc1", R.drawable.ic_menu_camera, "Cullture 1 \nThis was originally the residence of the highest ranked\n" +
                "    British personnel in Calabar. It had been transformed to the residence of the military governors\n" +
                "    during the military regime in Nigeria.\n" +
                "        \\nHowever, today, it serves a different purpose of a multifaceted museum.\n" +
                "    ","Culture"));
        locations.add(new Location("Culture 2","cultureLoc2", R.drawable.ic_menu_gallery, "Culture 2 \nEstablished in 1895, this is one of the oldest institutions in the Nigeria.\\n\n" +
                "        Originally set up as a base for arriving Scottish missionaries, it quickly transformed\n" +
                "        into an educational and skills acquisition center.","Culture"));
        locations.add(new Location("Culture 3", "cultureLoo3", R.drawable.ic_menu_slideshow, "Culture 3 \nLocated in the Marina Resort along the Calabar harbour,\n" +
                "    the Slave History Museum shows explicitly, the travails of Nigeria slaves who were sold\n" +
                "    through the Calabar sea port.","Culture"));

        return new Category("Cultural", locations);


    }

    //Get Locations
    public List<Location> getLocations(){
//        mLocations.add(new Location(mHistoricalLocations));


        return mHistoricalLocations;
    }
    //Get Attraction Categories
    public List<Category> getCategories() {
        return mCategories;
    }
}
