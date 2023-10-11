class DemoNilai{
    public static void main(String[] args){
        String nim = "2210631170083";
        String nama = "Muhammad Daffa Ariq Fadilah";
        int nilaiAbsen = 100;
        int nilaiTugas = 90;
        int nilaiUTS = 80;
        int nilaiUAS = 80;

        Nilai nilaiMahasiswa = new Nilai(nim,nama,nilaiAbsen,nilaiTugas,nilaiUTS,nilaiUAS);

        nilaiMahasiswa.cetakNilai();
    }
}