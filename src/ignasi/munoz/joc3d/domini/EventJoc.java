package ignasi.munoz.joc3d.domini;

import java.util.Random;

public class EventJoc implements Runnable {

	private static final Random RANDOM = new Random();

	private final String nomEvent;
	private final Integer maximSegonsEnPantalla;
	private final int maxAmplePantalla;
	private final int maxAlturaPantalla;
	private final int midaProfunditatPantalla;

	public EventJoc(String nomEvent, Integer maximSegonsEnPantalla, int maxAmplePantalla, int maxAlturaPantalla,
			int midaProfunditatPantalla) {
		this.nomEvent = nomEvent;
		this.maximSegonsEnPantalla = maximSegonsEnPantalla;
		this.maxAmplePantalla = maxAmplePantalla;
		this.maxAlturaPantalla = maxAlturaPantalla;
		this.midaProfunditatPantalla = midaProfunditatPantalla;
	}

	@Override
	public void run() {
		aparicions();
	}

	public void aparicions() {
		int segonsEnPantallaActuals = 0;

		while (maximSegonsEnPantalla == null || segonsEnPantallaActuals < maximSegonsEnPantalla) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				return;
			}

			int x = getPosicio(maxAmplePantalla, -maxAmplePantalla);
			int y = getPosicio(maxAlturaPantalla, -maxAlturaPantalla);
			int z = getPosicio(midaProfunditatPantalla, -midaProfunditatPantalla);

			System.out.println(nomEvent + " X:" + x + " Y:" + y + " Z:" + z);
			segonsEnPantallaActuals++;
		}
	}

	private int getPosicio(int max, int min) {
		return RANDOM.nextInt(max - min + 1) + min;
	}
}
