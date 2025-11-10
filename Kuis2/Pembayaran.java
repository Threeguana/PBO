package Kuis2;
public abstract class Pembayaran{
    private double nominal;
    private String status;

    public Pembayaran(double n, String s){
        this.nominal = n;
        this.status = s;
    }

    // getter dan setter
    public double getNominal() {
        return nominal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String s) {
        this.status = s;
    }

    public abstract void prosesTransaksi(); //abstract method

    public void tampilkanInfo(){
        System.out.println("Nominal   : Rp." + nominal);
        System.out.println("Status    : " + status);
    }
}
