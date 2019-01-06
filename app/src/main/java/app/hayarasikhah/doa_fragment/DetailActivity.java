package app.hayarasikhah.doa_fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by Haya Rasikhah on 1/4/2019.
 */
public class DetailActivity extends Activity {


    TextView txtDetailJudul, txtDetailAyat, txtDetailArti;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtDetailJudul = (TextView) findViewById(R.id.txt_detail_judul);
        txtDetailAyat = (TextView) findViewById(R.id.txt_detail_ayat);
        txtDetailArti = (TextView) findViewById(R.id.txt_detail_arti);

        getData();
    }

    private void getData() {
        txtDetailJudul.setText(getIntent().getStringExtra("id_nama"));
        txtDetailAyat.setText(getIntent().getStringExtra("id_surah"));
        txtDetailArti.setText(getIntent().getStringExtra("id_arti"));
    }
}
