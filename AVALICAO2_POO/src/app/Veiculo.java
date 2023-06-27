package app;

	abstract class Veiculo {
	 	protected String nome;
	    protected int anoFabricacao;
	    protected int capacidade;
	    protected Fabricante fabricante;

	    public Veiculo(String nome, int anoFabricacao, int capacidade, Fabricante fabricante) {
	        this.nome = nome;
	        this.anoFabricacao = anoFabricacao;
	        this.capacidade = capacidade;
	        this.fabricante = fabricante;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public int getAnoFabricacao() {
	        return anoFabricacao;
	    }

	    public void setAnoFabricacao(int anoFabricacao) {
	        this.anoFabricacao = anoFabricacao;
	    }

	    public int getCapacidade() {
	        return capacidade;
	    }

	    public void setCapacidade(int capacidade) {
	        this.capacidade = capacidade;
	    }

	    public Fabricante getFabricante() {
	        return fabricante;
	    }

	    public void setFabricante(Fabricante fabricante) {
	        this.fabricante = fabricante;
	    }

	    public abstract void acelerar();

	    public void mostrarDetalhes() {
	        System.out.println("Detalhes do veículo:");
	        System.out.println("Nome: " + nome);
	        System.out.println("Ano de fabricação: " + anoFabricacao);
	        System.out.println("Capacidade: " + capacidade);
	        System.out.println("Fabricante: " + fabricante.getNome());
	        System.out.println("País de origem do fabricante: " + fabricante.getPaisDeOrigem());
	    }
}
