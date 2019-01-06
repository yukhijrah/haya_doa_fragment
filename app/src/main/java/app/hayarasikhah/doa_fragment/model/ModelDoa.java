package app.hayarasikhah.doa_fragment.model;

/**
 * Created by Haya Rasikhah on 1/4/2019.
 */

public class ModelDoa {


    private String judul;
    private String ayat;
    private String arti;

    public ModelDoa(String judul, String ayat, String arti) {
        this.judul = judul;
        this.ayat = ayat;
        this.arti = arti;
    }

    public String getNama() {
        return judul;
    }

    public String getSurah() {
        return ayat;
    }

    public String getArti() {
        return arti;
    }

}
