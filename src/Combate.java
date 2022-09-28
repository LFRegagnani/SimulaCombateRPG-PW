

public class Combate {
    //ATRIBUTOS DO COMBATE
//    Personagem lutador1;
//    Personagem lutador2;
    private double danoDeCombate;
    private double danoBonus;

    //CONSTRUTOR PARA INICIAR A LUTA
//    Combate(Personagem lutador1, Personagem lutador2) {
//        this.lutador1 = lutador1;
//        this.lutador2 = lutador2;
//    }



    //PRINCIPAL METODO
    public void ataca(Personagem atacante, Personagem atacado) {

        if (atacante.getVida() <= 0 || atacado.getVida() <= 0) {//verifica se algum dos combatentes ja está morto
            System.out.println("Esta luta já acabou...");
            return;
        }

        if (seraQueDesvia(atacado.tentaEsquiva())) {//chama o metodo que verifica se o defensor esquivou
            System.out.println("Incrivel! " + atacado.getNome() + " desviou do ataque de " + atacante.getNome() + " e por isso não tomou danos");
            this.danoDeCombate = 0;
            System.out.println();
            return;
        } else {
            System.out.println(atacante.getNome() + " Atacou " + atacado.getNome() + " que não conseguiu desviar do ataque");
        }

        //ESTA PARTE CALCULA O DANO DE COMBATE
        double dano = atacante.ataca() / atacado.tentaDefesa();
        qualidadeDoAtaque();//metodo que calcula o dano bonus
        this.danoDeCombate = (dano * this.danoBonus);
        System.out.println("O dano de combate causado por " + atacante.getNome() + " foi de " + this.danoDeCombate);
        computaDano(atacante,atacado);

    }

    public boolean seraQueDesvia(double chance) { // metodo que decide se o personagem desvia ou não
        double chanceDeDesvia = Math.random();

        if (chance >= chanceDeDesvia) {
            return true;
        } else {
            return false;
        }
    }

    public void qualidadeDoAtaque() {//metodo responsável por auferir a chance de dano bonus

        double qualidade = Math.random();
        if (qualidade < 0.30) {
            this.danoBonus = 1;

        } else if (qualidade >= 0.30 && qualidade < 0.60) {
            this.danoBonus = 1.2;

        } else if (qualidade >= 0.60 && qualidade <= 0.95) {
            this.danoBonus = 1.4;

        } else {
            this.danoBonus = 2;
            System.out.println("Este ataque foi um incrivel acerto critico!!!");
        }
    }

    public void computaDano(Personagem atacante, Personagem atacado) {//Metodo responsavel por causar o dano à vida do atacado
        double vidaAtual = atacado.tomaDano() - this.danoDeCombate;
        atacado.setVida(vidaAtual);
        System.out.println("Agora a vida atual de " + atacado.getNome() + " caiu para " + vidaAtual);

        if (vidaAtual <= 0) {
            System.out.println("Agora a vida atual de " + atacado.getNome()
                    + " chegou a ZERO... Ele está morto e precisará que um" +
                    " Sacerdote o ressuscite para que possa lutar novamente");
        }
        System.out.println();

    }

}
