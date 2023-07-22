package pbo1;

//class
public class Buku {
    //atribut dan encapsulation
    private String Nama_Buku;
    private String Kode;

    //construktor
    public Buku(String Nama_Buku, String Kode) {
        this.Nama_Buku = Nama_Buku;
        this.Kode = Kode;
    }
    
    //mutator
    public void setNama_Buku(String Nama_Buku) {
        this.Nama_Buku = Nama_Buku;
    }

    public void setKode(String Kode) {
        this.Kode = Kode;
    }
    
    //accessor
    public String getNama_Buku() {
        return Nama_Buku;
    }

    public String getKode() {
        return Kode;
    }
    
    public String displayInfo(){
        return "Nama Buku : "+getNama_Buku()+
                "\nKode :"+getKode();
    }
    
    //polymorphism(Overloading)
    public String displayInfo(String Penerbit){
        return displayInfo()+"\nNama Penerbit :"+Penerbit;
    }
    
    
    
}
