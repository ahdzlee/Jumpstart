package com.jumpstart.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jumpstart.R;

/**
 * Created by junvir on 4/21/2016.
 */
public class Balance extends Fragment {


    public static Balance newInstance() {

        return new Balance();
    }    @Override
         public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_balance, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {


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



}
