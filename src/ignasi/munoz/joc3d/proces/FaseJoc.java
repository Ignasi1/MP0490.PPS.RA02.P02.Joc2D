package ignasi.munoz.joc3d.proces;

import ignasi.munoz.joc3d.domini.EventJoc;

public class FaseJoc {

	public static void main(String[] args) {
		int maxAmplePantalla = 800;
		int maxAlturaPantalla = 600;
		int midaProfunditatPantalla = 1000;

		EventJoc eventJoc1 = new EventJoc("mina", 10, maxAmplePantalla, maxAlturaPantalla, midaProfunditatPantalla);
		EventJoc eventJoc2 = new EventJoc("cactus", 5, maxAmplePantalla, maxAlturaPantalla, midaProfunditatPantalla);
		EventJoc eventJoc3 = new EventJoc("sotrac", 7, maxAmplePantalla, maxAlturaPantalla, midaProfunditatPantalla);
		EventJoc eventJoc4 = new EventJoc("lo clot", null, maxAmplePantalla, maxAlturaPantalla,
				midaProfunditatPantalla);
		EventJoc eventJoc5 = new EventJoc("columna", 11, maxAmplePantalla, maxAlturaPantalla, midaProfunditatPantalla);

		Thread t1 = new Thread(eventJoc1);
		Thread t2 = new Thread(eventJoc2);
		Thread t3 = new Thread(eventJoc3);
		Thread t4 = new Thread(eventJoc4);
		Thread t5 = new Thread(eventJoc5);

		System.out.println("Inici");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		System.out.println("Final");
	}
}
