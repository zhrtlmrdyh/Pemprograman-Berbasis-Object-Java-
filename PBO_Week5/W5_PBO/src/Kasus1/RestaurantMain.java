/*
 * Nama		: Zahratul Mardiyah
 * NIM		: 211511064
 * Kelas	: 2B - D3 Teknik Informatika
 */

package Kasus1;
import java.util.scanner;

public class RestaurantMain {
	public static void main(String[] args) {
		Restaurant menu = new Restaurant();
		
		menu.tambahMenuMakanan("Bala-bala", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		Restaurant.nextId();
		
		//tampilkan pesanan
		System.out.println("\n-------------Stock Makanan------------------");
		menu.tampilMenuMakanan();
		menu.Pemesanan("Molen", 3);
		System.out.println("\n-------------Stock Makanan------------------");
		menu.tampilMenuMakanan();
	}

}