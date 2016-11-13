package id.sch.smktelkom_mlg.project.xiirpl108172635.lifewithtoga.model;

import java.io.Serializable;

/**
 * Created by Bayu on 08/11/2016.
 */

public class Toga implements Serializable {
    public String judul;
    public String deskripsi;
    public String detail;
    public String lokasi;
    public String foto;

    public Toga(String judul, String deskripsi, String detail, String lokasi, String foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.detail = detail;
        this.lokasi = lokasi;
        this.foto = foto;
    }
}
