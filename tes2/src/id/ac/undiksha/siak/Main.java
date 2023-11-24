package id.ac.undiksha.siak;

import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Dosen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mahasiswa ani = new Mahasiswa();
		Dosen yanto = new Dosen();
		
		ani.setNim("1234");
		ani.setNama("Ani");
		ani.setAlamat("Singaraja");
		ani.setTanggalLahir("1 Januari 2000");
		ani.setJeniskelamin(true);
		ani.setProdi("Ilmu Komputer");
		
		yanto.setNidn("54321");
		yanto.setNama("Yanto");
		yanto.setAlamat("Bali");
		yanto.setTanggalLahir("5 Februari 1991");
		yanto.setJeniskelamin(false);
		yanto.setProdi("Teknologi Web");
		
		
		
		
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
		
		System.out.println(ani.getNim());
		System.out.println(ani.getNama());
		System.out.println(ani.getAlamat());
		System.out.println(ani.getTanggalLahir());
		System.out.println(ani.getJeniskelamin());
		System.out.println(ani.getProdi());
		
		System.out.println(yanto.getNidn());
		System.out.println(yanto.getNama());
		System.out.println(yanto.getAlamat());
		System.out.println(yanto.getTanggalLahir());
		System.out.println(yanto.getJeniskelamin());
		System.out.println(yanto.getProdi());

	}

}
