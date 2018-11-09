package ali.naseem.tourguide.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ali.naseem.tourguide.R;
import ali.naseem.tourguide.fragments.HillStationFragment;
import ali.naseem.tourguide.fragments.ParksFragment;
import ali.naseem.tourguide.fragments.TemplesFragment;
import ali.naseem.tourguide.fragments.WaterParksFragment;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context context;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return ParksFragment.newInstance();
        } else if (position == 1) {
            return HillStationFragment.newInstance();
        } else if (position == 2) {
            return TemplesFragment.newInstance();
        } else {
            return WaterParksFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_parks);
        } else if (position == 1) {
            return context.getString(R.string.category_hill_stations);
        } else if (position == 2) {
            return context.getString(R.string.category_temples);
        } else {
            return context.getString(R.string.category_water_parks);
        }
    }
}


