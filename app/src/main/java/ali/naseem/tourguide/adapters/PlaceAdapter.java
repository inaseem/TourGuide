package ali.naseem.tourguide.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import ali.naseem.tourguide.R;
import ali.naseem.tourguide.models.Place;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, ArrayList<Place> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Place place = (Place) getItem(position);
        TextView placeTextView = listItemView.findViewById(R.id.place);
        TextView descriptionTextView = listItemView.findViewById(R.id.description);
        ImageView imageView = listItemView.findViewById(R.id.imageView);
        placeTextView.setText(place.getPlaceName());
        descriptionTextView.setText(place.getDescription());
        imageView.setImageResource(place.getImageResourceId());
        return listItemView;
    }
}