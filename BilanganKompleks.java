
package asistensi;

/**
 *
 * @author tsamarahrana
 */
public class BilanganKompleks {

    public static void main(String[] args) {
        BilanganKompleks c = new BilanganKompleks();
        BilanganKompleks a = new BilanganKompleks("1", "3");
        BilanganKompleks b = new BilanganKompleks ("2", "i");
        c.perkalian(a,b);
        c.penjumlahan(a,b);
        c.pengurangan(a,b);
    }
    
    private String real;
    private String imajiner;
    int resultr;
    int resulti;
    
    public BilanganKompleks(){
        
    }
    
    public BilanganKompleks(String real, String imajiner){
        this.real = real;
        this.imajiner = imajiner;
    }
    
    public void setReal(String r){
        real = r;
    }
    
    public void setImajiner(String i){
        imajiner = i;
    }
    
    public String getReal(){
        return real;
    }
    
    public String getImajiner(){
        return imajiner;
    }
    
    public static int convertString(String real){
	int resultr = Integer.parseInt(real);
        return resultr;
    }
    
    public static int convertStringi(String imajiner){
        int resulti = Integer.parseInt(imajiner);
        return resulti;
    }
    
    public static BilanganKompleks penjumlahan(BilanganKompleks a, BilanganKompleks b){
        BilanganKompleks hasilp1 = new BilanganKompleks("0","0");
        hasilp1.resultr = a.resultr+b.resultr;
        hasilp1.resulti = a.resulti+b.resulti;
        System.out.println("Hasil penjumlahannya adalah : " + hasilp1.resultr + " + " + hasilp1.resulti + "i");
        return hasilp1;
    }
    
    public static BilanganKompleks perkalian(BilanganKompleks a, BilanganKompleks b){
        BilanganKompleks hasilp2 = new BilanganKompleks("0","0");
        hasilp2.resultr = (a.resultr*b.resultr - b.resulti*a.resulti); 
	hasilp2.resulti = (a.resultr*b.resulti + a.resultr*b.resulti);
        System.out.println("Hasil perkaliannya adalah :" + hasilp2.resultr + " + " +hasilp2.resulti+ "i");
        return hasilp2;
    }   
    
    public static BilanganKompleks pengurangan(BilanganKompleks a, BilanganKompleks b){
        BilanganKompleks hasilp3 = new BilanganKompleks("0","0");
        hasilp3.resultr = a.resultr-b.resultr;
        hasilp3.resulti = a.resulti-b.resulti;
        System.out.println("Hasil perkaliannya adalah : " + hasilp3.resultr + " + " + hasilp3.resulti + "i");
        return (hasilp3);
    }
}
