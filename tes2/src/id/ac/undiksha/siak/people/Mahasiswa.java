package id.ac.undiksha.siak.people;

import id.ac.undiksha.siak.organisasi.Prodi;

public class Mahasiswa extends Manusia {

	private String nim;
	//private String prodi;
	
	public Mahasiswa() {
		super();
		this.nim			= "<masukan nim>";
		//this.prodi			= "<masukan prodi>";
	}

	public Mahasiswa(
			String nama, 
			String alamat, 
			String tanggalLahir, 
			boolean jenisKelamin, 
			
			String nim, 
			String prodi
		) {
		super(nama, alamat, tanggalLahir, jenisKelamin);
		
		this.nim = nim;
		//this.prodi = prodi;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}
	
	public String getNim() {
		return this.nim;
	}

	//public String getProdi() {
		//return prodi;
	//}

	//public void setProdi(String prodi) {
		//this.prodi = prodi;
	//}



	public void printAll() {
		super.printAll();
		System.out.println(this.getNim());
		//System.out.println(this.getProdi());
	}
	
	
	
	private Prodi prodi = new Prodi();
	public Prodi getProdi() {
		return prodi;
	}
	
	
}
