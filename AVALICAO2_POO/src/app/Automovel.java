package app;

class Automovel extends Veiculo {
    private int diametroRoda;

    public Automovel(String nome, int anoFabricacao, int capacidade, Fabricante fabricante, int diametroRoda) {
        super(nome, anoFabricacao, capacidade, fabricante);
        this.diametroRoda = diametroRoda;
    }

    public int getDiametroRoda() {
        return diametroRoda;
    }

    public void setDiametroRoda(int diametroRoda) {
        this.diametroRoda = diametroRoda;
    }

    public void abrirPortaMalas() {
        System.out.println("O porta-malas do carro foi aberto.");
    }

    @Override
    public void acelerar() {
        System.out.println("O automóvel acelerou.");
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Diâmetro da roda: " + diametroRoda);
    }
}