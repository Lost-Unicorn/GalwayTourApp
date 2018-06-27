package com.example.donna.galwaytourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AccommodationsFragment extends Fragment {

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.clayton, R.string.claytonAdd, R.drawable.clayton, R.string.claytonPh));
        places.add(new Place(R.string.galwaybay, R.string.galwaybayAdd, R.drawable.galwaybay, R.string.galwaybayPh));
        places.add(new Place(R.string.connacht, R.string.connachtAdd, R.drawable.connacht, R.string.connachtPh));
        places.add(new Place(R.string.flannerys, R.string.flannerysAdd, R.drawable.flannerys, R.string.flannerysPh));
        places.add(new Place(R.string.salthill, R.string.salthillAdd, R.drawable.salthill, R.string.salthillPh));
        places.add(new Place(R.string.menlo, R.string.menloAdd, R.drawable.menlo, R.string.menloPh));
        places.add(new Place(R.string.galmont, R.string.galmontAdd, R.drawable.galmont, R.string.galmontPh));
        places.add(new Place(R.string.ardilaun, R.string.ardilaunAdd, R.drawable.ardilaun, R.string.ardilaunPh));
        places.add(new Place(R.string.park, R.string.parkAdd, R.drawable.park, R.string.parkPh));


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

