package app.hayarasikhah.doa_fragment.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import app.hayarasikhah.doa_fragment.R;
import app.hayarasikhah.doa_fragment.model.ModelJadwal;

/**
 * Created by Haya Rasikhah on 1/4/2019.
 */

public class JadwalAdapter extends RecyclerView.Adapter<JadwalHolder> {

    private List<ModelJadwal> jadwals;
    public JadwalAdapter(List<ModelJadwal>jadwals){
        this.jadwals=jadwals;
    }
    @Override
    public JadwalHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new JadwalHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_jadwal,null));

    }

    @Override
    public void onBindViewHolder(JadwalHolder holder, int position) {
        holder.txtWaktu.setText(jadwals.get(position).getWaktu());
        holder.txtJam.setText(jadwals.get(position).getJam());

    }

    @Override
    public int getItemCount() {
        return jadwals.size();
    }


}

class JadwalHolder extends RecyclerView.ViewHolder{

    public TextView txtWaktu;
    public  TextView txtJam;
    public View cardItemJadwal;

    public JadwalHolder(View itemView) {
        super(itemView);
        cardItemJadwal=itemView.findViewById(R.id.carditem_jadwal);
        txtWaktu=itemView.findViewById(R.id.txt_Waktu);
        txtJam=itemView.findViewById(R.id.txt_Jam);
    }
}
