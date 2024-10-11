public class CthFor01 {
    public static void main(String[] args) {  
        int a, jum;
        jum = 0;
        for (a= 1; a<=5; a++) {
            if ((a % 2) != 0) {
                System.out.println(a);  
                jum = jum + a;               
            }              
            System.out.println("Jumlah = " + jum);         
        }  
        System.out.println("Nilai A terakhir = " + a);
    }
}
