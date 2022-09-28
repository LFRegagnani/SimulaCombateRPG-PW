public class Personagem {

    private String nome;
    private String classe;
    private int level = 1;
    private int ataque;
    private double defesa;
    private double esquiva;
    private double vida;


    Personagem(String nome, String classe) {
        if (classe == "Barbaro" || classe == "barbaro" || classe == "WB") {

            this.nome = nome;
            this.classe = classe;
            this.ataque = 12;
            this.defesa = 0.5;
            this.esquiva = 0.05;
            this.vida = 220;
            System.out.println("Seu WB foi criado com sucesso");
            System.out.println();

        } else if (classe == "Arqueiro" || classe == "arqueiro" || classe == "EA") {

            this.nome = nome;
            this.classe = classe;
            this.ataque = 28;
            this.defesa = 0.2;
            this.esquiva = 0.4;
            this.vida = 150;
            System.out.println("Seu EA foi criado com sucesso");
            System.out.println();

        } else if (classe == "Mago" || classe == "mago" || classe == "MG") {

            this.nome = nome;
            this.classe = classe;
            this.ataque = 38;
            this.defesa = 0.3;
            this.esquiva = 0.01;
            this.vida = 110;
            System.out.println("Seu MG foi criado com sucesso");
            System.out.println();

        } else if (classe == "Guerreiro" || classe == "guerreiro" || classe == "WR") {

            this.nome = nome;
            this.classe = classe;
            this.ataque = 12;
            this.defesa = 0.6;
            this.esquiva = 0.2;
            this.vida = 175;
            System.out.println("Seu WR foi criado com sucesso");
            System.out.println();

        } else {
            System.out.println("ERRO:As classes são: Barbaro, Guerreiro, Mago, Arqueiro. Escreva corretamente");
        }

    }

    //METODOS DE COMBATE
    public int ataca() {
        return this.ataque;

    }

    public double tentaEsquiva() {
        return this.esquiva;
    }

    public double tentaDefesa() {
        return this.defesa;
    }

    public double tomaDano() {
        return this.vida;
    }


    //METODOS GET E SET

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getClasse() {//não vou fazer metodo set pq a classe é um atributo imutavel.
        return this.classe;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public double getDefesa() {
        return this.defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public double getEsquiva() {
        return this.esquiva;
    }

    public void setEsquiva(double esquiva) {
        this.esquiva = esquiva;
    }

    public double getVida() {
        return this.vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
}