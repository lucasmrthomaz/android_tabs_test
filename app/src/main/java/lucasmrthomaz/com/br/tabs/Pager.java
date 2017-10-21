package lucasmrthomaz.com.br.tabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by lucas on 21/10/2017.
 */

public class Pager extends FragmentStatePagerAdapter {

    int tabCount;

    public Pager(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                tabFragmentPage1 frag1 = new tabFragmentPage1();
                return frag1;
            case 1:
                tabFragmentPage2 frag2 = new tabFragmentPage2();
                return frag2;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
