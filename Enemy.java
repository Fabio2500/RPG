class Enemy{
   int vida_dano;
   int vida;
   int dano;
   int dano_causado;
   String tipo;

   
   public void monster_type(int dificuldade){

      if(dificuldade < 10){
      	tipo = "goblin";
        System.out.println("inimigo:" + tipo);
      }
      if (dificuldade < 20 && dificuldade >= 10){
      	tipo = "orc";
      	System.out.println("inimigo:" + tipo);
      }

      if(dificuldade >= 20 && dificuldade < 30){
      	tipo = "wyvern";
      	System.out.println("inimigo:" + tipo);
      }
      if(dificuldade >= 30){
      	tipo = "dragao";
      	System.out.println("inimigo:" + tipo);
      }

   }
   public int damage_given(int dificuldade){
      if(dificuldade < 10){
         System.out.println("a criatura te causa:" + dano);
         if(dificuldade < 10 && dificuldade >= 5){
           dano_causado = dano + 100;
           System.out.println("a criatura te causa:" + dano_causado);
           }

      }
      if(dificuldade < 20 && dificuldade >=10){
          System.out.println("a criatura te causa:"+ dano);
         if(dificuldade < 20 && dificuldade >= 15){
            dano_causado = dano + 300;
             System.out.println("a criatura te causa:"+ dano_causado);
         }

      }
      if(dificuldade >= 20 && dificuldade < 30 ){
          System.out.println("a criatura te causa:" + dano);
          if(dificuldade >=25 && dificuldade < 30 ){
            dano_causado = dano + 50;
             System.out.println("a criatura te causa:" + dano_causado);
          }

      }
      if(dificuldade >= 30){
         dano = 450;

      }

     return dano_causado;
   }

   public int damage_taken(int dano){
      vida_dano = vida;
      vida = vida_dano - dano;
      if(vida <= 0){
         System.out.println("boa! vc venceu, vc merece 500 kwanzas");
      }else{
         System.out.println("agora a criatura ta com:"+ vida + " de vida");
      }
      
      return vida;
   }



   public int creature_status(int dificuldade){
      if(dificuldade < 10){
         vida = 100; 
         dano = 30;
          System.out.println("vida atual da criatura:" + vida);
      }
      if(dificuldade < 20 && dificuldade >= 10){
         vida = 400;
         dano = 100 ;
          System.out.println("vida atual da criatura:" + vida);
      }
      if(dificuldade >= 20 && dificuldade < 30 ){
         vida = 1400;
         dano = 300;
          System.out.println("vida atual da criatura:" + vida);
      }
      if(dificuldade >= 30){
         vida = 3000;
         dano = 450;
          System.out.println("vida atual da criatura:" + vida);
      }
      

      return vida;

   }

   
}