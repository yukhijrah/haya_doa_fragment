package app.hayarasikhah.doa_fragment.model;

/**
 * Created by Haya Rasikhah on 1/4/2019.
 */

public class ModelJadwal {

    private String waktu;
    private  String jam;

    public ModelJadwal(String waktu, String jam){
        this.waktu=waktu;
        this.jam=jam;
    }

    public String getWaktu(){
        return waktu;
    }
    public String getJam(){
        return jam;
    }
}
