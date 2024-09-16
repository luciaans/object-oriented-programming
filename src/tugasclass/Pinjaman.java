package tugasclass;

public class Pinjaman {
    private int cicilan;
    private double bunga;

    public Pinjaman() {
        this.cicilan = 0;
        this.bunga = 0.0;
    }

    public void setCicilan(int cicilan) {
        this.cicilan = cicilan;
        this.bunga = calculateBunga(cicilan);
    }

    public int getCicilan() {
        return cicilan;
    }

    public double getBunga() {
        return bunga;
    }

    private double calculateBunga(int cicilan) {
        if (cicilan >= 0 && cicilan <= 11) {
            return 0.005;
        } else if (cicilan >= 12 && cicilan <= 23) {
            return 0.01;
        } else if (cicilan >= 24 && cicilan <= 35) {
            return 0.015;
        } else if (cicilan >= 36 && cicilan <= 47) {
            return 0.02;
        } else if (cicilan >= 48 && cicilan <= 60) {
            return 0.025;
        } else {
            throw new IllegalArgumentException("Cicilan harus antara 0 dan 60 bulan.");
        }
    }

    @Override
    public String toString() {
        return "Pinjaman Dengan Cicilan " + cicilan + " Bulan Memiliki Bunga Sebesar : " + (bunga * 100) + "%";
    }
}
