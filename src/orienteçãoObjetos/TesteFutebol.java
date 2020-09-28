package orienteçãoObjetos;

public class TesteFutebol {
	

	public static void main(String[] args) {
		Futebol futebol = new Futebol("Ana", 0);
		Futebol futebol2 = new Futebol("eliza", 0);
		
		futebol.setIdade(50);
		futebol.setNome("ana");
		
		
		futebol2.setIdade(20);
		futebol2.setNome("eliza");
		
		CampeonatoBrasileiro camp = new CampeonatoBrasileiro();
		CampeonatoBrasileiro camp2 = new CampeonatoBrasileiro();
		
		
		camp.setFuncao("zagueira");
		camp.setTime("santos");
		
		camp2.setFuncao("atacante");
		camp2.setTime("palmeiras");
		
		
		System.out.println(futebol.getNome() + " ela tem "+ futebol.getIdade() + " joga no " + camp.getTime() + "  como " + camp.getFuncao());
		
		System.out.println(futebol2.getNome() + " ela tem "+ futebol2.getIdade() + " joga no " + camp2.getTime() + "  como " + camp2.getFuncao());
		
		
		
		
		
		
		
		
	}

}
