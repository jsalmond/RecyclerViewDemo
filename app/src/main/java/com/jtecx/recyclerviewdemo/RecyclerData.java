package com.jtecx.recyclerviewdemo;


import java.util.ArrayList;
import java.util.List;

public class RecyclerData {

    private static final String[] titles = {"Nothingness cannot be defined", "The softest thing cannot be snapped",
    "Be like water, my friend."};


    private static final int[] icons = {android.R.drawable.ic_popup_reminder, android.R.drawable.ic_menu_add,
    android.R.drawable.ic_menu_delete};

    private static final String[] subTitles = {
            "Bruce Lee",
            "Marcus Aurelius",
            "Meng Tzu",
            "Carl Sagan",
            "Alhazen",
            "Jim Robin"
    };

    private static final int icon = R.drawable.ic_sentiment_neutral_black_36dp;




    public static List<ListItem> getListData(){
        List<ListItem> data = new ArrayList<>();

        for (int x = 0; x < 10; x++){
            for (int i = 0; i < titles.length && i < icons.length; i++ ){
                ListItem item = new ListItem();
                item.setImageResid(icons[i]);
                item.setTitle(titles[i]);
                data.add(item);
            }
        }

        return data;
    }
}
