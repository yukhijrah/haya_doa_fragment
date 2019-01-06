package app.hayarasikhah.doa_fragment.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.hayarasikhah.doa_fragment.R;

/**
 * Created by Haya Rasikhah on 1/4/2019.
 */

public class Profile extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_profile,container,false);
    }
}
