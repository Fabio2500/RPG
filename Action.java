import java.util.Scanner;


class Action{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Character personagem = new Character();
		Enemy inimigo = new Enemy();
		int max = 100;
		int min = 1;
		int range = max - min + 1;
		int escolha, escolha_ataque;
		int dificuldade;
		double turno;

		System.out.println("==========escolha a sua classe===========\n");
		System.out.println("1-guerreiro");
		System.out.println("2-feiticeiro");
		System.out.println("3-ladino");
		System.out.println("4-mago\n");
		System.out.println("digite o numero da sua escolha:");
        escolha = sc.nextInt();

        personagem.Classe_jogador(escolha);
        System.out.println("\n");
        System.out.println("digite o nivel de dificuldade:");
        dificuldade = sc.nextInt();

        inimigo.monster_type(dificuldade);
        inimigo.creature_status(dificuldade);
        
        while(inimigo.vida > 0 && personagem.vida > 0){
        	turno = (int)(Math.random()*range) + min;
        	
        	
        	if(turno % 2 != 0){
        		System.out.println("turno do jogador\n");
        	    System.out.println("escolha o que vai fazer?\n");
        	    personagem.ataques(escolha);
        	    escolha_ataque = sc.nextInt();
        	    personagem.ataque_pratica(escolha,escolha_ataque);
        	    inimigo.damage_taken(personagem.dano_causado);

        	 }else{
        	 	inimigo.damage_given(escolha);
        	 	personagem.damage_taken(inimigo.dano);
        		System.out.println("turno da criatura");
              }
            


        }

               
	}
}