package ssvvl1;


import repository.Repository;
import ui.DoctorUI;
import controller.DoctorController;

public class App {

	public static void main(String[] args) {
		String patients = "C:\\Users\\Paula\\Documents\\NetBeansProjects\\SSVVL1\\src\\ssvvl1\\FilePatients.txt";
		String consultations = "C:\\Users\\Paula\\Documents\\NetBeansProjects\\SSVVL1\\src\\ssvvl1\\FileConsultations.txt";
		Repository repo = new Repository(patients, consultations);
		DoctorController ctrl = new DoctorController(repo);
		
		DoctorUI console = new DoctorUI(ctrl);
		console.Run();
	}
}
