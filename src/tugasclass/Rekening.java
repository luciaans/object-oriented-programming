package tugasclass;

public class Rekening {
    private double saldo;
    private String namaPemilik;

    public Rekening(double saldo, String namaPemilik) {
        this.saldo = saldo;
        this.namaPemilik = namaPemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {   
        this.namaPemilik = namaPemilik;
    }

    @Override
    public String toString() {
        return "Nama Pemilik Rekening " + namaPemilik + " Memiliki Jumlah Saldo : " + saldo + " Rupiah ";
    }
}
