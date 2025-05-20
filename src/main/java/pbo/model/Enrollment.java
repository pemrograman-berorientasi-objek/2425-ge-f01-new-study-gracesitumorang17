package pbo.model;

import javax.persistence.*;

@Entity
@Table(name = "Enrollment")

public class Enrollment {
    @Id
    @Column(name = "nim", nullable = false, length = 60)
    private String nim;
    @Column(name = "kode", nullable = false, length = 60)
    private String kode;

    public Enrollment() {

    }

    public Enrollment(String nim, String kode) {
        this.nim = nim;
        this.kode = kode;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    @Override
    public String toString() {
        return nim + "|" + kode;
    }

}
