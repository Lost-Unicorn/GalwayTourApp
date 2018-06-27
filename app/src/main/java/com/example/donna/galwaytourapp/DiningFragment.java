package com.example.donna.galwaytourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class DiningFragment extends Fragment {



        @Override
        public View onCreateView (LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState){
            View rootView = inflater.inflate(R.layout.word_list, container, false);

            ArrayList<Place> places = new ArrayList<Place>();
            places.add(new Place(R.string.aniar, R.string.aniarAdd, R.drawable.aniar, R.string.aniarPh));
            places.add(new Place(R.string.pullman, R.string.pullmanAdd, R.drawable.pullman, R.string.pullmanPh));
            places.add(new Place(R.string.kirwans, R.string.kirwansAdd, R.drawable.kirwan, R.string.kirwansPh));
            places.add(new Place(R.string.italian, R.string.italianAdd, R.drawable.venice, R.string.italianPh));
            places.add(new Place(R.string.western, R.string.westernAdd, R.drawable.western, R.string.westernPh));
            places.add(new Place(R.string.nimmos, R.string.nimmosAdd, R.drawable.nimmos, R.string.nimmosPh));
            places.add(new Place(R.string.dock, R.string.dockAdd, R.drawable.dock, R.string.dockPh));
            places.add(new Place(R.string.corner, R.string.cornerAdd, R.drawable.corner, R.string.cornerPh));
            places.add(new Place(R.string.lock, R.string.lockAdd, R.drawable.lock, R.string.lockPh));


            // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
            // adapter knows how to create list items for each item in the list.
            PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.linen);

            // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
            // There should be a {@link ListView} with the view ID called list, which is declared in the
            // word_list.xml layout file.
            ListView listView = (ListView) rootView.findViewById(R.id.list);

            // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
            // {@link ListView} will display list items for each {@link Word} in the list.
            listView.setAdapter(adapter);

    // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
            // the ListView.
            return rootView;

        }

    }
