package pbo1;

public class BukuDetail extends Buku{
    
    //polymorphism(Overriding)
    public BukuDetail(String Nama_Buku, String Kode) {
        super(Nama_Buku, Kode);
    }
    
    public int getTahunTerbit(){
        return Integer.parseInt(getKode().substring(0, 2))+2000;
    }
    
    public String getPenulis(){
        String kodPen = getKode().substring(2, 4);
        //seleksi if
        if(kodPen.equals("10")){
            return "Rahmida";
        } else {
            return "Maaf itu bukan penulisnya..!!";
        }
    }
    public String getJenis(){
        String kodJen = getKode().substring(4, 6);
        //seleksi switch
        switch(kodJen){
            case "01" :
                return "Pelajaran";
            case "02" :
                return "Novel";
            default :
                return "Jenis Lain";
        }
    }
    
    public int getHalaman(){
        return Integer.parseInt(getKode().substring(6));
    }
    
    
    //polymorphism(Overriding)
    @Override
    public String displayInfo(){
       return super.displayInfo()+
               "\nTahun Terbit : "+getTahunTerbit()+
               "\nPenulis : "+getPenulis()+
               "\nJenis : "+getJenis()+
               "\nHalaman : "+getHalaman();
    }
}

