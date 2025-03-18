public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String pilihPrabowo;

    public Mahasiswa(String nim, String nama, String jenisKelamin, String pilihPrabowo) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.pilihPrabowo = pilihPrabowo;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {this.nama = nama; }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setPilihPrabowo(String pilihPrabowo) {this.pilihPrabowo = Mahasiswa.this.pilihPrabowo;}

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public String getPilihPrabowo() {return this.pilihPrabowo; }
}
