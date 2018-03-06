
public class Alumne {

	    final int TOTAL_MODULS = 11;	/* total de mòduls del cicle */
	
		private String nom;
		private int edat;
		private int any_inici_cicle;
		private int M5_nota;
		private int qtat_moduls_aprovats;  /* quants mòduls del cicle té aprovats */

		public Alumne(String nom, int edat, int any_inici, int notaM5, int moduls_aprovats) {
			this.nom = nom;
			this.edat = edat;
			this.any_inici_cicle = any_inici;
			this.M5_nota = notaM5;
			this.qtat_moduls_aprovats = moduls_aprovats;
		}

		/* Diu si l'alumne és major d'edat */
		public boolean esMajorEdat() {
			return (this.edat >= 18);
		}

		/* Diu si l'alumne ha aprovat M5. Cal tenir una nota mínima de 5 i no 
		superar el 20% d'absentisme */
		public boolean aprovaM5(int assistencia_M5) {
			return ((this.M5_nota >= 5) && (assistencia_M5 >= 80));
		}

		/* Diu quants anys portava l'alumne matriculat en un cert any de referència */
		public int anysMatriculat(int any_referencia) {
			return (any_referencia - this.any_inici_cicle);
		}
		
		/* Cal tenir un mínim del 60% dels mòduls aprovat per a passar a segón. Això
		  significa aprovar com a mínim 8 mòduls */
		public boolean passaASegon() {
			
			return (((float)this.qtat_moduls_aprovats / this.TOTAL_MODULS) >= 0.6);
		}
	
}