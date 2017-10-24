package lucasmrthomaz.com.br.tabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by lucas on 21/10/2017.
 */

public class FragPagerAdapter extends FragmentPagerAdapter {

    private int tabCount;
    private String[] tabTitles;

    public FragPagerAdapter(FragmentManager fm, String[] tabTitles) {
        super(fm);
        this.tabTitles = tabTitles;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
               return new tabFragmentPage1();
            case 1:
                return new tabFragmentPage2();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return this.tabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return this.tabTitles[position];
    }
}
