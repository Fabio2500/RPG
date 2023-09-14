class Character{
	int dano_inicial;
	int vida;
	int vida_dano;
	int dano_final;
	int dano_causado;
	int feitico;

	public int ataque_pratica(int escolha,int escolha2){
		if(escolha == 1){
			switch(escolha2){
			case 1:
				dano_causado = dano_inicial + 120;
				System.out.println("estocada causou:"+ dano_causado);
				break;
			case 2: 
				System.out.println("imbuiu a arma,agora ela causa:"+ buff(300) + " de dano");
				break;
			case 3:
				dano_causado = dano_inicial + 80;
				break;

			}	
        }
        if(escolha == 2){
            switch(escolha2){
            case 1:
            	spell_damage(200);
            	dano_causado = feitico;
            	System.out.println("causou:"+ dano_causado + " de dano por fogo ");
            	break;
            case 2:
            	spell_damage(500);
            	dano_causado = feitico;
            	System.out.println("causou:"+ dano_causado + " de dano por raio ");
            	break;
            case 3:
            	spell_damage(160);
                dano_causado = feitico;
                System.out.println("causou:"+ dano_causado + " de dano por congelamento ");
            	break;
            case 4:
            	spell_damage(130);
            	dano_causado = feitico;
            	System.out.println("causou:"+ dano_causado + " de dano por magia ");
            	break;
            }
        }
            if(escolha == 3){
            	switch(escolha2){
            	case 1:
            		dano_causado = dano_inicial + 90;
            		System.out.println("o dano causado pela apunhalada: " + dano_causado);
            		break;
            	case 2:
            		System.out.println("embebeu a arma com veneno,agora ela causa:" + buff(100) +" de dano ");
            		break;
            	case 3:
            		dano_causado = dano_inicial + 100;
            		System.out.println("o dano causado pelo ataque:" + dano_causado);
            		break;
            	}
            }
            	if(escolha == 4){
            		switch(escolha2){
            		case 1:
            		   spell_damage(150);
            		   dano_causado  = feitico;
            		   System.out.println("causou:" + dano_causado +" de fogo ");
            		   break;
            		case 2:
            			spell_damage(145);
            			dano_causado = feitico;
            			System.out.println("causou:" + dano_causado + " de frio ");
            			break;
            		case 3:
            			spell_damage(769);
            			dano_causado = feitico;
            			System.out.println("causou:" + dano_causado + " de luz");
            		}
            	}

       return dano_causado;
	}

	public void ataques(int escolha){
		if(escolha == 1){
			System.out.println("1-estocada");
			System.out.println("2-imbuir arma");
			System.out.println("3-cortar");
        }
		if(escolha == 2){
			System.out.println("1-bola de fogo");
			System.out.println("2-raios");
			System.out.println("3-estaca de gelo");
			System.out.println("4-esfera magica");
			
		}
		if(escolha == 3){
			System.out.println("1-apunhalada");
			System.out.println("2-envenenar arma");
			System.out.println("3-atacar");
			
		}
		if(escolha == 4){
			System.out.println("1-fogo");
			System.out.println("2-congelamento");
			System.out.println("3-luz ardente");
			
		}
	}

	public int Classe_jogador(int escolha){
		if(escolha == 1){
			vida = 2500;
			dano_inicial = 100;
		}
		if(escolha == 2){
			vida = 1000;
			dano_inicial = 800;
		}
		if(escolha == 3){
			vida = 900;
		    dano_inicial = 500;
		}
		if(escolha == 4){
			vida = 800;
			dano_inicial = 650;
		}
		System.out.println("status iniciais:"+ vida +" de vida inicial e " + dano_inicial + " de dano inicial ");

		return vida;
	}
        

	public int damage_taken(int dano_levado){
		vida_dano = vida;
		vida = vida_dano - dano_levado;
		System.out.println("depois do dano sua vida ficou:"+ vida);
		if(vida < 0){
			System.out.println("infelizmente vc perdeu");
		}
		return vida;
	}

    
    public int spell_damage(int elemento){
    	feitico = elemento + dano_final * 50/100;
    	return feitico;
    }

	public int buff(int spell){
		dano_final = dano_inicial + spell;
		System.out.println("seu dano atual:" + dano_final);

        dano_inicial = dano_final;
		return dano_final;
	}

   
	

}