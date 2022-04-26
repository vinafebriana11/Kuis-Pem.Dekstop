/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motherboardkuis.model;


public class Motherboardkuis {
    private String jenis;
    private String harga;
    private String processor;
    private String tahunrilis;
    private String brand;

    public Motherboardkuis(String npm, String nama, String tanggalLahir, String gender, String prodi) {
        this.jenis = jenis;
        this.harga = harga;
        this.processor = processor;
        this.tahunrilis = tahunrilis;
        this.brand = brand;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getTahunrilis() {
        return tahunrilis;
    }

    public void setTahunrilis(String tahunrilis) {
        this.tahunrilis = tahunrilis;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
    
}
