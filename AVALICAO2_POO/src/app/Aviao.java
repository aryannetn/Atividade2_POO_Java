package app;

class Aviao extends Veiculo {
    private int numTurbinas;

    public Aviao(String nome, int anoFabricacao, int capacidade, Fabricante fabricante, int numTurbinas) {
        super(nome, anoFabricacao, capacidade, fabricante);
        this.numTurbinas = numTurbinas;
    }

    public int getNumTurbinas() {
        return numTurbinas;
    }

    public void setNumTurbinas(int numTurbinas) {
        this.numTurbinas = numTurbinas;
    }

    public void decolar() {
        System.out.println("O avião decolou.");
    }

    public void pousar() {
        System.out.println("O avião pousou.");
    }

    @Override
    public void acelerar() {
        System.out.println("O avião está acelerando.");
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Número de turbinas: " + numTurbinas);
    }
}