package app.hayarasikhah.doa_fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import app.hayarasikhah.doa_fragment.fragment.Doa;
import app.hayarasikhah.doa_fragment.fragment.Home;
import app.hayarasikhah.doa_fragment.fragment.Profile;

/**
 * Created by Haya Rasikhah on 1/4/2019.
 */
public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager pager;
    private Button btn_home, btn_doa, btn_profil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=(Toolbar) findViewById(R.id.tabs);

        btn_home=(Button) findViewById(R.id.btnHome);
        btn_doa=(Button) findViewById(R.id.btnDoa);
        btn_profil=(Button) findViewById(R.id.btnProfile);

        if (savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().add(R.id.frameL,new Home(),Home.class.getSimpleName()).commit();
        }

        btn_home.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).
                        replace(R.id.frameL,new Home(),Home.class.getSimpleName()).addToBackStack(null).commit();
            }
        });

        btn_doa.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).
                        replace(R.id.frameL,new Doa(),Doa.class.getSimpleName()).addToBackStack(null).commit();
            }
        });

        btn_profil.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).
                        replace(R.id.frameL,new Profile(),Profile.class.getSimpleName()).addToBackStack(null).commit();
            }
        });

    }


}
