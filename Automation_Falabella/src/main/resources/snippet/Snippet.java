package snippet;

public class Snippet {
	public static void main(String[] args) {
		Controlador.waits(oGenerarSiniestro.getBTN_AGREGARCOBERTURA_IN(),null,"Se habilita el area de agregar cobertura . ","No se habilita el area de agregar cobertura ");
						
						Controlador.Scripting("click", "BTN_AGREGARCOBERTURA_IN","","",oGenerarSiniestro.getBTN_AGREGARCOBERTURA_IN(),null);
						
	}
}

