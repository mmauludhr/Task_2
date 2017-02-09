/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;
/**
 * NIM  = 1301154166
 * Nama = Muhammad Maulud Hidayatullah Rambe
 */

/**
 *
 * @author M Maulud H R
 */
public class Mahasiswa {
    private String NIM, Nama, Status;
    private char nilai[];
    private int i;
    
    public Mahasiswa() {
        Status = "Tidak Lulus";
        this.i = 0;
        nilai = new char[10];
    }
    
    public Mahasiswa(String Nama, String NIM) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Status = "Tidak Lulus";
        this.i = 0;
        nilai = new char[10];
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public char[] getNilai() {
        return nilai;
    }

    public void setNilai(char[] nilai) {
        this.nilai = nilai;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    public void addNilai(char nilai) {
        if(i<10) {
            this.nilai[i] = nilai;
            i++;
        }
    }
    
    public char getNilai(int i) {
        return nilai[i];
    }
    
    public String toString() {
        String Mahasiswa;
        Mahasiswa = "\nNIM: " + NIM + "\nNama: " + Nama + "\nStatus: " + Status + "\nNilai: " + nilai;
        for(int x=0; x<i; x++) {
            Mahasiswa = Mahasiswa + nilai[x] + ", ";
        }
        return Mahasiswa;
    }
    
    public char cekNilai(Mahasiswa m) {
        int x = 0;
        int y = 0;
        char min = 'X';
        while(y != i) {
            while(x != i) {
                if(m.nilai[y] == m.nilai[x]) {
                    if(m.nilai[y]<min) {
                        min = m.nilai[y];
                    }
                }
                x++;
            }
            x = 0;
            y++;
        }
        return min;
    }
    
}
