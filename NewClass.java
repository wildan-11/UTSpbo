import java.io.PrintWriter;
import java.io.FileReader;

public class NewClass {
    public static void main(String[] args) throws Exception {
        // instansiasi class pembaca file
        PrintWriter read = new PrintWriter("data.txt");
        Identitas data = new Identitas();
        int[] NilaiInt = {2,4,6,9,2,4,8,4,5,7};
        String[] nama = {"Dono", "Kasino", "Indro", "Tata", "Titi"};

        for(int n : NilaiInt){
            read.print(n + ", ");
        }
        read.println();
        for(String n : nama){
            read.print(n + ", ");
        }
        read.println();
        read.println("Nama         : " + data.nama);
        read.println("NIM          : " + data.NIM);
        read.println("Usia         : " + data.usia);
        read.println("Tinggi badan : " + data.tinggi);
        read.println("Alamat       : " + data.alamat);
        read.close();

        try (
            FileReader file = new FileReader("data.txt")) {
            int character;
            while ((character = file.read()) != -1) {
                System.out.print((char) character);
            }
        }
    }
}

class Identitas{
    String nama = "Wildan";
    int NIM = 22201114;
    int usia = 20;
    Double tinggi = 170.0;
    String alamat = "JL. dahlia";
}