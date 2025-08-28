/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan2;

/**
 *
 * @author MyBook Hype AMD
 */
public class Manusia { 

    /**
     * @return the berjalan
     */
    protected String getBerjalan() {
        return berjalan;
    }

    /**
     * @param berjalan the berjalan to set
     */
    protected void setBerjalan(String berjalan) {
        this.berjalan = berjalan;
    }

    /**
     * @return the makan
     */
    protected String getMakan() {
        return makan;
    }

    /**
     * @param makan the makan to set
     */
    protected void setMakan(String makan) {
        this.makan = makan;
    }

    /**
     * @return the jenisKelamin
     */
    protected String getJenisKelamin() {
        return jenisKelamin;
    }

    /**
     * @param jenisKelamin the jenisKelamin to set
     */
    protected void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    private String berjalan;
    private String makan;
    private String jenisKelamin;

    public Manusia(String berjalan, String makan, String jenisKelamin) {
        this.berjalan = berjalan;
        this.makan = makan;
        this.jenisKelamin = jenisKelamin;
    }
    
}
