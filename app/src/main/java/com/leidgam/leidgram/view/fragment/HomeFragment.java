package com.leidgam.leidgram.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leidgam.leidgram.R;
import com.leidgam.leidgram.adapter.PictureAdapterRecycleView;
import com.leidgam.leidgram.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        showToolbar(getResources().getString(R.string.tab_home), false , view);

        RecyclerView picturesRecycle = (RecyclerView) view.findViewById(R.id.pictureRecycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        picturesRecycle.setLayoutManager(linearLayoutManager);

        PictureAdapterRecycleView pictureAdapterRecycleView =
                new PictureAdapterRecycleView(builPictures(), R.layout.cardview_picture, getActivity());
        picturesRecycle.setAdapter(pictureAdapterRecycleView);

        return view;
    }
    public ArrayList<Picture> builPictures(){
    ArrayList<Picture>   pictures = new ArrayList<>();
        pictures.add(new Picture("https://www.cleverfiles.com/howto/wp-content/uploads/2016/08/mini.jpg","Magdiel H.G.","4 Días","3 Me Gusta"));
        pictures.add(new Picture("https://dncache-mauganscorp.netdna-ssl.com/thumbseg/253/253989-bigthumbnail.jpg","Moises h.k.","9 Días","8 Me Gusta"));
        pictures.add(new Picture("https://vignette3.wikia.nocookie.net/filmguide/images/7/78/Iron_Man_%28Avengers%29.jpg","Jose Alb","1 Días","9 Me Gusta"));

        return pictures;
    }


    public void showToolbar(String title, Boolean upButton, View view){
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(title);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

    }
}
