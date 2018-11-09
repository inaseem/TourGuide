package ali.naseem.tourguide.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import ali.naseem.tourguide.Constants;
import ali.naseem.tourguide.DetailActivity;
import ali.naseem.tourguide.R;
import ali.naseem.tourguide.adapters.PlaceAdapter;
import ali.naseem.tourguide.models.Place;

public class TemplesFragment extends Fragment {

    public TemplesFragment() {
        // Required empty public constructor
    }

    public static TemplesFragment newInstance() {
        TemplesFragment fragment = new TemplesFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_temples, container, false);
        ListView listView = (ListView) view.findViewById(R.id.list);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.badrinath, R.drawable.badrinath, R.string.badrinath_description));
        places.add(new Place(R.string.kedarnath, R.drawable.kedarnath, R.string.kedarnath_description));
        places.add(new Place(R.string.haridwar, R.drawable.haridwar, R.string.haridwar_description));
        PlaceAdapter placeAdapter = new PlaceAdapter(getContext(), places);
        listView.setAdapter(placeAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Place place = places.get(position);
                Intent intent = new Intent(getContext(), DetailActivity.class);
                intent.putExtra(Constants.IMAGE, place.getImageResourceId());
                intent.putExtra(Constants.PLACE, place.getPlaceName());
                intent.putExtra(Constants.DESCRIPTION, place.getDescription());
                getContext().startActivity(intent);
            }
        });
        return view;
    }

}
