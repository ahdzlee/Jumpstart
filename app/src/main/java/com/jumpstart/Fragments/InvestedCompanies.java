package com.jumpstart.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jumpstart.R;
import com.jumpstart.adapter.CardAdapter;
import com.jumpstart.recycler_model.Category;

import java.util.ArrayList;

/**
 * Created by junvir on 4/21/2016.
 */
public class InvestedCompanies extends Fragment {

    String[] mobileArray = {"Samsung","Capsure","N9NE","TaxiLie","Summy","BBYGURL","Olors","Gabi9"};
    RecyclerView mRecyclerView;
    CardAdapter mAdapter;



    public static InvestedCompanies newInstance() {
        return new InvestedCompanies();
    }    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_category, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mAdapter = new CardAdapter(new ArrayList<Category>());
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        addCategories();
    }
        // find all the views

//        ListView listView = (ListView) view.findViewById(R.id.mobile_list);
//
//        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(),R.layout.container_fragment, mobileArray);
//
//
//
//
//        listView.setAdapter(adapter);

//    }


    private void addCategories() {
        String content = "Lorem Ipsum";

        Category category = new Category("Samsung", "Mobile Tech", R.drawable.ic_launcher);
        mAdapter.addCategory(category);

        category = new Category("Capsure", "Meaure", R.drawable.ic_launcher);
        mAdapter.addCategory(category);

        category = new Category("N9NE", "Solar System",  R.drawable.ic_launcher);
        mAdapter.addCategory(category);

        category = new Category("TaxiLie", "LTO",  R.drawable.ic_launcher);
        mAdapter.addCategory(category);


        category = new Category("Summy", "Summary", R.drawable.ic_launcher);
        mAdapter.addCategory(category);


        category = new Category("BBYGURL", "KC arante", R.drawable.ic_launcher);
        mAdapter.addCategory(category);


        category = new Category("PAds", "Commercial", R.drawable.ic_launcher);
        mAdapter.addCategory(category);


        category = new Category("JUNVIRGWAPO", "haloder",  R.drawable.ic_launcher);
        mAdapter.addCategory(category);

        mAdapter.notifyDataSetChanged();
    }
}
