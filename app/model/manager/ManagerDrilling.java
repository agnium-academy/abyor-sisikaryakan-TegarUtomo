package model.manager;

/**
 * Created by User TEGAR on 2/5/2016.
 */
public class ManagerDrilling extends Manager{

    String jenisManager;

    public ManagerDrilling(Integer id, String nama, String alamat) {
        super(id, nama, alamat);
        this.jenisManager = "MANAGEER DRILLING";
    }

    public String getJenisManager() {
        return jenisManager;
    }

    public void setJenisManager(String jenisManager) {
        this.jenisManager = jenisManager;
    }

    public void tampilInformasi(){
        System.out.println("Id = "+getId());
        System.out.println("Nama = "+getNama());
        System.out.println("Alamat = "+getAlamat());
        System.out.println("Jenis Manager = "+getJenisManager());
    }

}