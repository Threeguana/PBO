public class User {
    public String username;
    public String nama;
    public String email;
    public String alamat;
    public String pekerjaan;

    private User(String u, String n, String e){
        this.username = u;
        this.nama = n;
        this.email = e;
    }

    public void cetakinfo(){
        System.out.println("Username  : " + username);
        System.out.println("Nama      : " + nama);
        System.out.println("Email     : " + email);
        System.out.println("Alamat    : " + alamat);
        System.out.println("Pekerjaan : " + pekerjaan);
        System.out.println("===========================");
    }
}