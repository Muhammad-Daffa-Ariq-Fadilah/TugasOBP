class Nilai{
    String nim;
    String nama;
    int nilaiAbsen;
    int nilaiTugas;
    int nilaiUTS;
    int nilaiUAS;

    public Nilai(String nim,String nama,int nilaiAbsen,int nilaiTugas,int nilaiUTS,int nilaiUAS){
        this.nim = nim;
        this.nama = nama;
        this.nilaiAbsen = nilaiAbsen;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    public int hitungNilaiAkhir(){
        return (int) (0.1 * nilaiAbsen + 0.2 * nilaiTugas + 0.3 * nilaiUTS + 0.4 * nilaiUAS);
    }
    public void cetakNilai(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai Absen[10%]: " + nilaiAbsen);
        System.out.println("Nilai Tugas[20%]: " + nilaiTugas);
        System.out.println("Nilai UTS[30%]: " + nilaiUTS);
        System.out.println("Nilai UAS[40%]: " + nilaiUAS);
        System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
    }
}
