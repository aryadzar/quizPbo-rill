/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizpbo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aryad
 */

class Point{
   private double x;
   private double y;

   public Point(double x, double y) {
       this.x = x;
       this.y = y;
   }

   public double getX() {
       return x;
   }

   public void setX(double x) {
       this.x = x;
   }

   public double getY() {
       return y;
   }

   public void setY(double y) {
       this.y = y;
   }
   public double distance(Point other){
       double result = Math.sqrt(Math.pow((other.getX() - this.x), 2) + Math.pow((other.getY() - this.y), 2) );
       return result;
   }
}

abstract class Shape{
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Trapezoid extends Shape{
    private double base1;
    private double base2;
    private double height;

    public Trapezoid(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public double getBase1() {
        return base1;
    }

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public double getBase2() {
        return base2;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double calculateArea(){
        return ((this.getBase1() + this.getBase2()) * this.getHeight())/2;
    }
    
    @Override
    public double calculatePerimeter(){
        double result = (this.getBase2() - this.getBase1())/2;
        double result2 = Math.pow(result, 2) + Math.pow(this.getHeight(), 2);
        double result3 = Math.sqrt(result2);
        return this.getBase1() + this.getBase2() + (result3*2);
     
    }
    
}

class Kite extends Shape{
    private double diagonal1;
    private double diagonal2;

    public Kite(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }
    @Override
    public double calculateArea(){
        return (this.getDiagonal1() * this.getDiagonal2())/2;
    }
    
    @Override
    public double calculatePerimeter(){
        double result = Math.pow((this.getDiagonal1()/2),2) + Math.pow((this.getDiagonal2()/2),2);
        double result2 = Math.sqrt(result);
        return result2 * 4;
    }
    
}
class Penulis{
    List<Buku> daftarBuku = new ArrayList<>();
    public void tambahBuku(Buku buku){
        this.daftarBuku.add(buku);
    }
    public List<Buku> getDaftarBuku(){
        return daftarBuku;
    }
}

class Buku{
    private String judul;
    private int tahunTerbit;
    private String penerbit;
    private String isbn;

    public Buku(String judul, int tahunTerbit, String penerbit, String isbn) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.penerbit = penerbit;
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }
    
}

//
class Rectangle extends Shape{
   private double length;
   private double width;

   public Rectangle(double length, double width) {
       this.length = length;
       this.width = width;
   }

   public double getLength() {
       return length;
   }

   public void setLength(double length) {
       this.length = length;
   }

   public double getWidth() {
       return width;
   }

   public void setWidth(double width) {
       this.width = width;
   }
   
   @Override
   public double calculateArea(){
       return this.getLength() * this.getWidth();
   }
   
   @Override
   public double calculatePerimeter(){
       return (2 * this.getLength()) + (2 * this.getWidth());
   }
}

class Classroom{
   protected static String [] roomList = {"GIK L1 C", "GIK L2", "MIPA T L1 A", "MIPA T L1 B"};

   public static String[] getRoomList() {
       return roomList;
   }
   
   public static boolean isValidRoom(String room){
       for(String i : roomList){
           if(i.equals(room)){
               return true;
           }
       }
       
       return false;
   }
   
}
public class QuizPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
       Point point1 = new Point(10, 30);
       Point point2 = new Point(76, 85);

       // Menghitung jarak antara dua titik
       double distance = point1.distance(point2);
       System.out.println("Distance between points: " + distance);
       Rectangle rectangle = new Rectangle(4.0, 5.0);
       System.out.println("Rectangle Area: " + rectangle.calculateArea());
       System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        System.out.println(Classroom.isValidRoom("LOP"));
        Shape trapezoid1 = new Trapezoid(3.0, 7.0, 4.0);
        Shape trapezoid2 = new Trapezoid(5.0, 9.0, 6.0);

        // Memanggil metode calculateArea dan calculatePerimeter
        System.out.println("Trapezoid 1 Area: " + trapezoid1.calculateArea());
        System.out.println("Trapezoid 1 Perimeter: " + trapezoid1.calculatePerimeter());

        System.out.println("Trapezoid 2 Area: " + trapezoid2.calculateArea());
        System.out.println("Trapezoid 2 Perimeter: " + trapezoid2.calculatePerimeter());
        // Menggunakan polimorfisme untuk Kite
        Shape kite1 = new Kite(8.0, 10.0);
        Shape kite2 = new Kite(12.0, 15.0);

        // Memanggil metode calculateArea dan calculatePerimeter
        System.out.println("Kite 1 Area: " + kite1.calculateArea());
        System.out.println("Kite 1 Perimeter: " + kite1.calculatePerimeter());

        System.out.println("Kite 2 Area: " + kite2.calculateArea());
        System.out.println("Kite 2 Perimeter: " + kite2.calculatePerimeter());
       Penulis penulis = new Penulis();

       // Menambahkan buku baru
       Buku bukuBaru = new Buku("Judul Buku", 2022, "Penerbit Terbit", "ISBN123456");
       penulis.tambahBuku(bukuBaru);

       // Menampilkan informasi buku setelah penambahan
       List<Buku> daftarBuku = penulis.getDaftarBuku();
       for (Buku buku : daftarBuku) {
           System.out.println("Judul: " + buku.getJudul());
           System.out.println("Tahun Terbit: " + buku.getTahunTerbit());
           System.out.println("Penerbit: " + buku.getPenerbit());
           System.out.println("ISBN: " + buku.getISBN());
           System.out.println("--------------");
       }
    }
    
}
