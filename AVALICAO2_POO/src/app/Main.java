package app;

public class Main {

	public static void main(String[] args) {
		// Criando objetos da classe Automovel
        Fabricante fabricanteAutomovel1 = new Fabricante("FIAT", "Italia");
        Automovel automovel1 = new Automovel("FastBack", 2022, 5, fabricanteAutomovel1, 19);

        Fabricante fabricanteAutomovel2 = new Fabricante("Volkswagen", "Alemanha");
        Automovel automovel2 = new Automovel("Taos", 2021, 4, fabricanteAutomovel2, 18);

        // Chamando métodos da classe Automovel
        automovel1.mostrarDetalhes();
        automovel1.acelerar();
        automovel1.abrirPortaMalas();

        automovel2.mostrarDetalhes();
        automovel2.acelerar();
        automovel2.abrirPortaMalas(); 

        //Criando objetos da classe Aviao
        Fabricante fabricanteAviao1 = new Fabricante("Embraer", "Brasil");
        Aviao aviao1 = new Aviao("Legacy 650", 2023, 15, fabricanteAviao1, 2);

        Fabricante fabricanteAviao2 = new Fabricante("Bombardier ", "Canadá");
        Aviao aviao2 = new Aviao("Global 7000", 2016, 19, fabricanteAviao2, 2);

        // Chamando métodos da classe Aviao
        aviao1.mostrarDetalhes();
        aviao1.acelerar();
        aviao1.decolar();
        aviao1.pousar();

        aviao2.mostrarDetalhes();
        aviao2.acelerar();
        aviao2.decolar();
        aviao2.pousar(); 

        // Criando objetos da classe Barco
        Fabricante fabricanteBarco1 = new Fabricante("EMGEPRON", "Brasil");
        Barco barco1 = new Barco("Lancha de Transporte Escolar", 2018, 20, fabricanteBarco1, 0);

        Fabricante fabricanteBarco2 = new Fabricante("Colombo Leopoldo", "Brasil");
        Barco barco2 = new Barco("Vela Ligeira", 2017, 2, fabricanteBarco2, 1);

        // Chamando métodos da classe Barco
        barco1.mostrarDetalhes();
        barco1.acelerar();
        barco1.icarVelas();
        barco1.recolherVelas();

        barco2.mostrarDetalhes();
        barco2.acelerar();
        barco2.icarVelas();
        barco2.recolherVelas(); 

	}

}
