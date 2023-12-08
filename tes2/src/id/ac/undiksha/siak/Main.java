package id.ac.undiksha.siak;

import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Manusia;
import id.ac.undiksha.siak.people.Dosen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mahasiswa ani = new Mahasiswa();
		Dosen yanto = new Dosen();
		
		/*ani.setNim("1234");
		ani.setNama("Ani");
		ani.setAlamat("Singaraja");
		ani.setTanggalLahir("1 Januari 2000");
		ani.setJeniskelamin(true);
		ani.setProdi("Ilmu Komputer");*/
		
		yanto.setNidn("54321");
		yanto.setNama("Yanto");
		yanto.setAlamat("Bali");
		yanto.setTanggalLahir("5 Februari 1991");
		yanto.setJeniskelamin(false);
		yanto.setProdi("Teknologi Web");
		
		//ani.printAll();
		
		
		
		/*ani.nim				= "12345";
		ani.nama			= "Ani";
		ani.alamat			= "Singaraja";
		ani.tanggalLahir	= "1 Januari 2000";
		ani.jeniskelamin	= true;
		ani.prodi			= "Ilmu Komputer";
		
		System.out.println(ani.nim);
		System.out.println(ani.nama);
		System.out.println(ani.alamat);
		System.out.println(ani.tanggalLahir);
		System.out.println(ani.jeniskelamin);
		System.out.println(ani.prodi)*/
		
		/*System.out.println(ani.getNim());
		System.out.println(ani.getNama());
		System.out.println(ani.getAlamat());
		System.out.println(ani.getTanggalLahir());
		System.out.println(ani.getJeniskelamin());
		System.out.println(ani.getProdi());*/
		
		/*System.out.println("------------------");
		Mahasiswa budi = new Mahasiswa()*/
		
		System.out.println(yanto.getNidn());
		System.out.println(yanto.getNama());
		System.out.println(yanto.getAlamat());
		System.out.println(yanto.getTanggalLahir());
		System.out.println(yanto.getJeniskelamin());
		System.out.println(yanto.getProdi());
		
		System.out.println("----------");
		
		//Mahasiswa caca = new Mahasiswa(
				//"1234",
			//	"Caca",
				//"Gianyar",
		//		"Geografi",
		//		"1 Februari 2000",
			//	true
		//	);
		
		//caca.printAll();
		
		System.out.println("----------");
		
		Mahasiswa budi = new Mahasiswa(
				"Budi",
				"Singaraja",
				"1 Januari 2000",
				false,
				
				"10101010110",
				"ILKOM"
				);
		
		budi.printAll();
		
		System.out.println("----------");
		
		Mahasiswa mhs1 = new Mahasiswa();
		mhs1.printAll();
		mhs1.getProdi().setKodeProdi("10");
		mhs1.getProdi().setNamaProdi("ILKOM");		
		System.out.println("----------");
		
		//Manusia mn1 = new Manusia();
		//mn1.printAll();
		
		System.out.println("----------");
		
		Manusia mn2 = new Mahasiswa();
		
		// Mahasiswa mhs2 = new Manusia();
	}

}
