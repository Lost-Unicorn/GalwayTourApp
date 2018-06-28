package com.example.donna.galwaytourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
//Create an arraylist
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.garden, R.string.gardenAdd, R.drawable.garden, R.string.gardenPh));
        places.add(new Place(R.string.traidphicnic, R.string.traidphicnicAdd, R.drawable.tradmusic, R.string.traidphicnicPh));
        places.add(new Place(R.string.roundstone, R.string.roundstoneAdd, R.drawable.roundstone, R.string.roundstonePh));
        places.add(new Place(R.string.westside, R.string.westsideAdd, R.drawable.westside, R.string.westsidePh));
        places.add(new Place(R.string.fringe, R.string.fringeAdd, R.drawable.fringe, R.string.fringePh));


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
