/*

    	Nama	: Nurindah Sari

	Stambuk : 13020180004

	Tanggal	: 21 April 2020

	Waktu	: 19.45 WITA

*/



public class InheritanceMobil extends InheritanceKendaraan{

private int kapasitasBBM;

public InheritanceMobil() {}

public InheritanceMobil(String _nama,int _penumpang,String _warna,int _bbm){

super(_nama,_penumpang,_warna);

setKapasitasBBM(_bbm);

}

private void setKapasitasBBM(int _bbm){

kapasitasBBM = _bbm;

}

private int getKapasitasBBM(){

return kapasitasBBM;

}

public void cetakInfo(){

System.out.println("Nama Mobil : " + super.getNama() );

System.out.println("Kapasitas BBM : " + getKapasitasBBM() +

" liter" );

System.out.println("Kapasitas Penumpang : " +

super.getKapasitasPenumpang() + " orang" );

System.out.println("Warna : " + super.getWarna() );

System.out.println("");

}

}