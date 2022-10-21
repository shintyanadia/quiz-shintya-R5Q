import java.text.DecimalFormat;
import java.util.Scanner;

class gajiKaryawan {
    String nik,nama,bagian,shift;
    double gaji_karyawan;

    double getgajikaryawan(){
        if (bagian == "Keuangan") {
            gaji_karyawan = 5000000;
        }else if (bagian == "IT Support") {
            gaji_karyawan = 4700000;
        }else if (bagian == "Administrasi") {
            gaji_karyawan = 3000000;
        }else if (bagian == "Customer Service") {
            gaji_karyawan = 2500000;
        }else{ 
            gaji_karyawan = 2000000;
        } 
        return gaji_karyawan;
    }
    void hasil(){
        DecimalFormat df = new DecimalFormat ("##0,000");
        
        Object system;
        System.out.print("---------- Program Gaji Karyawan ------------");
        System.out.print("NIP          : "+ this.nik);
        System.out.print("Nama         : "+ this.nama);
        System.out.print("Bagian       : "+ this.bagian);
        System.out.print("Shift        : "+ this.shift);
        System.out.print("Gaji karyawan: "+ df.format(getgajikaryawan()));
    }
}

class mainpenggajian{
    public static void main(String[] args) {
        Object system;
        Scanner sc = new Scanner (System.in);
        gajiKaryawan k = new gajiKaryawan();

        System.out.println("NIP   : ");
        k.nik = sc.next();
        System.out.println("Nama  : ");
        k.nama = sc.next();
        System.out.println("Bagian: ");
        k.bagian = sc.next();
        System.out.println("Shift : ");
        k.shift = sc.next();

        k.hasil();
    }   
}