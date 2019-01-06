package app.hayarasikhah.doa_fragment.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import app.hayarasikhah.doa_fragment.R;
import app.hayarasikhah.doa_fragment.adapter.JadwalAdapter;
import app.hayarasikhah.doa_fragment.model.ModelJadwal;

/**
 * Created by Haya Rasikhah on 1/4/2019.
 */

public class Home extends Fragment {
    private List<ModelJadwal>jadwals = new ArrayList<>();

    RecyclerView lstJadwal;
    LinearLayoutManager linear;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view= inflater.inflate(R.layout.fragment_home,container,false);
        lstJadwal=view.findViewById(R.id.rvJadwal);
        linear=new LinearLayoutManager(getActivity());
        lstJadwal.setLayoutManager(linear);

        JadwalAdapter adapter = new JadwalAdapter(jadwals);
        lstJadwal.setAdapter(adapter);

        jadwalsCollect();

        return view;
    }
    private void jadwalsCollect(){
        jadwals.add(new ModelJadwal("Imsak","03:55"));
        jadwals.add(new ModelJadwal("Subuh","04:05"));
        jadwals.add(new ModelJadwal("Fajr","05:22"));
        jadwals.add(new ModelJadwal("Dzuhur","11:39"));
        jadwals.add(new ModelJadwal("Ashar","15:00"));
        jadwals.add(new ModelJadwal("Maghrib","17:51"));
        jadwals.add(new ModelJadwal("Isya","19.04"));
    }
}
