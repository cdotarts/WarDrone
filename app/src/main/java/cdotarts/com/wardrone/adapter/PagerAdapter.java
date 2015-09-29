package cdotarts.com.wardrone.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import cdotarts.com.wardrone.fragment.DashboardFragment;
import cdotarts.com.wardrone.fragment.ShirtsGridFragment;

/**
 * Created by Dell Pc on 9/29/2015.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    private int mNumOfTabs;

    public PagerAdapter(FragmentManager fragmentManager,int nTabs){
        super(fragmentManager);
        mNumOfTabs=nTabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                DashboardFragment dashboardFragment=new DashboardFragment();
                return dashboardFragment;
            case 1:
                ShirtsGridFragment shirtsGridFragment=new ShirtsGridFragment();
                return shirtsGridFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
