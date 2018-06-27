package com.example.donna.galwaytourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SitesFragment extends Fragment{

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.turoe, R.string.turoeAdd, R.drawable.turoe, R.string.turoePh));
        places.add(new Place(R.string.rinville, R.string.rinvilleAdd, R.drawable.rinville, R.string.rinvillePh));
        places.add(new Place(R.string.portumna, R.string.portumnaAdd, R.drawable.portumna, R.string.portumnaPh));
        places.add(new Place(R.string.spiddal, R.string.spiddalAdd, R.drawable.spiddal, R.string.spiddalPh));
        places.add(new Place(R.string.connemara, R.string.connemaraAdd, R.drawable.connemara, R.string.connemaraPh));
        places.add(new Place(R.string.kylemore, R.string.kylemoreAdd, R.drawable.kylemore, R.string.kylemorePh));
        places.add(new Place(R.string.kiltartan, R.string.kiltartanAdd, R.drawable.kiltratan, R.string.kiltartanPh));
        places.add(new Place(R.string.athenry, R.string.athenryAdd, R.drawable.athenry, R.string.athenryPh));
        places.add(new Place(R.string.faller, R.string.fallerAdd, R.drawable.faller, R.string.fallerPh));


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

