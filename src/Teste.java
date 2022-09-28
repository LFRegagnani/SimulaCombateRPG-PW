public class Teste {
    public static void main(String[] args) {

        Personagem charDoLuiz = new Personagem("MALIIGNUS","WB");

        Personagem charDoRafa = new Personagem("VIIRUS","WR");

        Personagem charDoZe = new Personagem("AchKiira","EA");

        Personagem charDoIron = new Personagem("Iron","MG");

        Combate duelo = new Combate();

        duelo.ataca(charDoLuiz,charDoZe);
        duelo.ataca(charDoZe,charDoLuiz);
        duelo.ataca(charDoLuiz,charDoZe);
        duelo.ataca(charDoZe,charDoLuiz);
        duelo.ataca(charDoLuiz,charDoZe);
        duelo.ataca(charDoZe,charDoLuiz);
        duelo.ataca(charDoLuiz,charDoZe);
        duelo.ataca(charDoZe,charDoLuiz);



        duelo.ataca(charDoRafa,charDoIron);
        duelo.ataca(charDoIron,charDoRafa);
        duelo.ataca(charDoRafa,charDoIron);
        duelo.ataca(charDoIron,charDoRafa);
        duelo.ataca(charDoRafa,charDoIron);
        duelo.ataca(charDoIron,charDoRafa);
        duelo.ataca(charDoLuiz,charDoIron);


//        new Combate(charDoLuiz,charDoZe);
//        new Combate(charDoZe,charDoLuiz);
//        new Combate(charDoLuiz,charDoZe);
//        new Combate(charDoZe,charDoLuiz);
//        new Combate(charDoLuiz,charDoZe);
//        new Combate(charDoZe,charDoLuiz);
//        new Combate(charDoLuiz,charDoZe);
//        new Combate(charDoZe,charDoLuiz);
//        new Combate(charDoLuiz,charDoZe);
//        new Combate(charDoZe,charDoLuiz);
//        new Combate(charDoLuiz,charDoZe);
//        new Combate(charDoZe,charDoLuiz);
//        new Combate(charDoLuiz,charDoZe);
//        new Combate(charDoZe,charDoLuiz);
//        new Combate(charDoLuiz,charDoZe);
//        new Combate(charDoZe,charDoLuiz);
//        new Combate(charDoLuiz,charDoZe);
//        new Combate(charDoZe,charDoLuiz);
//        new Combate(charDoLuiz,charDoZe);
//        new Combate(charDoZe,charDoLuiz);


    }
}