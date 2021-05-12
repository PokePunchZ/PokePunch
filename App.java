import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws Exception {

        int resp, escolherPokemons_cont = 3, cont = 1;
        System.out.println("Ola Jogador Bem-Vindo ao PokePunch");
        System.out.println();

        // PRIMEIRA PARTE DO PROJETO

        do {

            do {

                Scanner sc = new Scanner(System.in);
                System.out.println("Jogador " + cont + " Escolha 3 Pokemons na Lista, Digite 0 Para Sair...");
                System.out.println();
                System.out.println("1- " + Pokemon_Charmander.pokemon_Nome);
                System.out.println("2- " + Pokemon_Squirtle.pokemon_Nome);
                System.out.println("3- " + Pokemon_Raichu.pokemon_Nome);
                System.out.println("4- " + Pokemon_Bulbasaur.pokemon_Nome);
                System.out.println("5- " + Pokemon_Alakazan.pokemon_Nome);
                System.out.println("6- " + Pokemon_Slaking.pokemon_Nome);
                System.out.println();
                resp = sc.nextInt();
                System.out.println();

                if (cont == 1) {

                    if (resp == 1) {

                        Mecanismo.Charmander_Player1();

                    } else if (resp == 2) {

                        Mecanismo.Squirtle_Player1();

                    } else if (resp == 3) {

                        Mecanismo.Raichu_Player1();
                    }

                    else if (resp == 4) {
                        Mecanismo.Bulbasaur_Player1();

                    } else if (resp == 5) {

                        Mecanismo.Alakazan_Player1();

                    } else if (resp == 6) {

                        Mecanismo.Slaking_Player1();
                    }

                    else if (resp == 0) {

                        System.out.println("Voce Optou Sair...");
                        System.exit(0);

                    } else {

                        System.out.println("Voce digitou um valor errado...Voltando para o Lobby...");
                        System.exit(0);

                    }

                } else if (cont == 2) {

                    if (resp == 1) {

                        Mecanismo.Charmander_Player2();

                    } else if (resp == 2) {

                        Mecanismo.Squirtle_Player2();

                    } else if (resp == 3) {

                        Mecanismo.Raichu_Player2();

                    } else if (resp == 4) {

                        Mecanismo.Bulbasaur_Player2();

                    } else if (resp == 5) {

                        Mecanismo.Alakazan_Player2();
                    }

                    else if (resp == 6) {

                        Mecanismo.Slaking_Player2();
                    }

                    else if (resp == 0) {

                        System.out.println("Voce Optou Sair...");
                        System.exit(0);

                    } else {

                        System.out.println("Voce digitou um valor errado...Voltando para o Lobby...");
                        System.exit(0);

                    }
                }

                escolherPokemons_cont--;

            } while (escolherPokemons_cont > 0);

            cont++;
            escolherPokemons_cont = escolherPokemons_cont + 3;

        } while (cont < 3);

        // SEGUNDA PARTE DO PROJETO

        System.out.println("JOGADORES BEM-VINDO À ARENA...");
        System.out.println();
        System.out.println("Jogador 1 Seus Pokemons São...");
        System.out.println();

        if (Mecanismo.adicionar_Charmander_Player1.size() == 0) {

        } else {

            Mecanismo2.Charmander();

        }

        if (Mecanismo.adicionar_Squirtle_Player1.size() == 0) {

        } else {

            Mecanismo2.Squirtle();

        }

        if (Mecanismo.adicionar_Raichu_Player1.size() == 0) {

        } else {

            Mecanismo2.Raichu();

        }

        if (Mecanismo.adicionar_Bulbasaur_Player1.size() == 0) {

        } else {

            Mecanismo2.Bulbasaur();

        }

        if (Mecanismo.adicionar_Alakazan_Player1.size() == 0) {

        } else {

            Mecanismo2.Alakazan();

        }

        if (Mecanismo.adicionar_Slaking_Player1.size() == 0) {

        } else {

            Mecanismo2.Slaking();

        }

        TimeUnit.SECONDS.sleep(5);
        System.out.println();
        System.out.println("Jogador 2 Seus Pokemons São...");
        System.out.println();

        if (Mecanismo.adicionar_Charmander_Player2.size() == 0) {

        } else {

            Mecanismo2.Charmander2();

        }

        if (Mecanismo.adicionar_Squirtle_Player2.size() == 0) {

        } else {

            Mecanismo2.Squirtle2();

        }

        if (Mecanismo.adicionar_Raichu_Player2.size() == 0) {

        } else {

            Mecanismo2.Raichu2();

        }

        if (Mecanismo.adicionar_Bulbasaur_Player2.size() == 0) {

        } else {

            Mecanismo2.Bulbasaur2();

        }

        if (Mecanismo.adicionar_Alakazan_Player2.size() == 0) {

        } else {

            Mecanismo2.Alakazan2();

        }

        if (Mecanismo.adicionar_Slaking_Player2.size() == 0) {

        } else {

            Mecanismo2.Slaking2();

        }

        // TERCEIRA PARTE PROGRAMA

        TimeUnit.SECONDS.sleep(5);
        String pokemon = "", golpe_Nome_Dois = "", pokemon2 = "", golpe_Nome_Um = "", golpe2_Nome_Um = "",
                golpe2_Nome_Dois = "", golpe_Tipo_Um = "", golpe_Tipo_Dois = "", golpe2_Tipo_Um = "",
                golpe2_Tipo_Dois = "";
        int troca, troca2, contadorMorteP1 = 0, contadorMorteP2 = 0;
        Object pokemon_Vel = 0, pokemon_Vel2 = 0, pokemon_Forca = 0, pokemon2_Forca = 0, pokemon_Vida = 0,
                pokemon2_Vida = 0, pokemon_Def = 0, pokemon_Def2 = 0, pokemon_DanoUm = 0, pokemon_DanoDois = 0,
                pokemon2_DanoUm = 0, pokemon2_DanoDois = 0;
        String tipo_GolpeUm = "", tipo_GolpeDois = "", tipo2_GolpeUm = "", tipo2_GolpeDois = "";
        int resp_Batalha_Dois = 0, soma = 0, soma1 = 0, somaFinal = 0, vida = 0, vida2 = 0, resp_Batalha_Um = 0,
                Velocidade = 0, Velocidade2 = 0, Defesa = 0, Defesa2 = 0, forca = 0, forca2 = 0, golpeUm = 0,
                golpeDois = 0, golpe2Um = 0, golpe2Dois = 0;

        System.out.println("Duelo Dos Pokemons");
        System.out.println();
        System.out.println("Jogador 1 Escolha Um De Seus Pokemons Para O Primeiro Duelo...");
        System.out.println();
        System.out.println("1- " + Mecanismo2.pokemon_Batalha_Nome.get(0));
        System.out.println("2- " + Mecanismo2.pokemon_Batalha_Nome.get(1));
        System.out.println("3- " + Mecanismo2.pokemon_Batalha_Nome.get(2));

        Scanner y = new Scanner(System.in);
        int resp_Batalha = y.nextInt();

        if (resp_Batalha == 1) {

            System.out.println();
            System.out.println("Voce Escolheu " + Mecanismo2.pokemon_Batalha_Nome.get(0));
            pokemon = Mecanismo2.pokemon_Batalha_Nome.get(0).toString();
            golpe_Nome_Um = Mecanismo2.pokemon_Batalha_GolpeUm.get(0).toString();
            golpe_Nome_Dois = Mecanismo2.pokemon_Batalha_GolpeDois.get(0).toString();
            pokemon_Vel = Mecanismo2.pokemon_Batalha_Velocidade.get(0);
            pokemon_Def = Mecanismo2.pokemon_Batalha_Defesa.get(0);
            pokemon_DanoUm = Mecanismo2.pokemon_Batalha_DanoUm.get(0);
            pokemon_DanoDois = Mecanismo2.pokemon_Batalha_DanoDois.get(0);
            tipo_GolpeUm = Mecanismo2.pokemon_Tipo_Um.get(0).toString();
            tipo_GolpeDois = Mecanismo2.pokemon_Tipo_Dois.get(0).toString();
            pokemon_Vida = Mecanismo2.pokemon_Batalha_Vida.get(0);
            pokemon_Forca = Mecanismo2.pokemon_Batalha_Forca.get(0);

            Velocidade = Integer.valueOf((int) pokemon_Vel);
            vida = Integer.valueOf((int) pokemon_Vida);
            Defesa = Integer.valueOf((int) pokemon_Def);
            forca = Integer.valueOf((int) pokemon_Forca);
            golpeUm = Integer.valueOf((int) pokemon_DanoUm);
            golpeDois = Integer.valueOf((int) pokemon_DanoDois);

        }

        if (resp_Batalha == 2) {

            System.out.println();
            System.out.println("Voce Escolheu " + Mecanismo2.pokemon_Batalha_Nome.get(1));
            pokemon = Mecanismo2.pokemon_Batalha_Nome.get(1).toString();
            golpe_Nome_Um = Mecanismo2.pokemon_Batalha_GolpeUm.get(1).toString();
            golpe_Nome_Dois = Mecanismo2.pokemon_Batalha_GolpeDois.get(1).toString();
            pokemon_Vel = Mecanismo2.pokemon_Batalha_Velocidade.get(1);
            pokemon_Def = Mecanismo2.pokemon_Batalha_Defesa.get(1);
            pokemon_DanoUm = Mecanismo2.pokemon_Batalha_DanoUm.get(1);
            pokemon_DanoDois = Mecanismo2.pokemon_Batalha_DanoDois.get(1);
            tipo_GolpeUm = Mecanismo2.pokemon_Tipo_Um.get(1).toString();
            tipo_GolpeDois = Mecanismo2.pokemon_Tipo_Dois.get(1).toString();
            pokemon_Vida = Mecanismo2.pokemon_Batalha_Vida.get(1);
            pokemon_Forca = Mecanismo2.pokemon_Batalha_Forca.get(1);

            Velocidade = Integer.valueOf((int) pokemon_Vel);
            vida = Integer.valueOf((int) pokemon_Vida);
            Defesa = Integer.valueOf((int) pokemon_Def);
            forca = Integer.valueOf((int) pokemon_Forca);
            golpeUm = Integer.valueOf((int) pokemon_DanoUm);
            golpeDois = Integer.valueOf((int) pokemon_DanoDois);

        }

        if (resp_Batalha == 3) {

            System.out.println();
            System.out.println("Voce Escolheu " + Mecanismo2.pokemon_Batalha_Nome.get(2));
            pokemon = Mecanismo2.pokemon_Batalha_Nome.get(2).toString();
            golpe_Nome_Um = Mecanismo2.pokemon_Batalha_GolpeUm.get(2).toString();
            golpe_Nome_Dois = Mecanismo2.pokemon_Batalha_GolpeDois.get(2).toString();
            pokemon_Vel = Mecanismo2.pokemon_Batalha_Velocidade.get(2);
            pokemon_Def = Mecanismo2.pokemon_Batalha_Defesa.get(2);
            pokemon_DanoUm = Mecanismo2.pokemon_Batalha_DanoUm.get(2);
            pokemon_DanoDois = Mecanismo2.pokemon_Batalha_DanoDois.get(2);
            tipo_GolpeUm = Mecanismo2.pokemon_Tipo_Um.get(2).toString();
            tipo_GolpeDois = Mecanismo2.pokemon_Tipo_Dois.get(2).toString();
            pokemon_Vida = Mecanismo2.pokemon_Batalha_Vida.get(2);
            pokemon_Forca = Mecanismo2.pokemon_Batalha_Forca.get(2);

            Velocidade = Integer.valueOf((int) pokemon_Vel);
            vida = Integer.valueOf((int) pokemon_Vida);
            Defesa = Integer.valueOf((int) pokemon_Def);
            forca = Integer.valueOf((int) pokemon_Forca);
            golpeUm = Integer.valueOf((int) pokemon_DanoUm);
            golpeDois = Integer.valueOf((int) pokemon_DanoDois);

        }

        System.out.println();
        System.out.println("Jogador 2 Escolha Um De Seus Pokemons Para O Primeiro Duelo...");
        System.out.println();
        System.out.println("1- " + Mecanismo2.pokemon_Batalha2_Nome.get(0));
        System.out.println("2- " + Mecanismo2.pokemon_Batalha2_Nome.get(1));
        System.out.println("3- " + Mecanismo2.pokemon_Batalha2_Nome.get(2));

        Scanner h = new Scanner(System.in);
        int resp_Batalha2 = y.nextInt();

        if (resp_Batalha2 == 1) {

            System.out.println();
            System.out.println("Voce Escolheu " + Mecanismo2.pokemon_Batalha2_Nome.get(0));

            pokemon2 = Mecanismo2.pokemon_Batalha2_Nome.get(0).toString();
            golpe2_Nome_Um = Mecanismo2.pokemon_Batalha2_GolpeUm.get(0).toString();
            golpe2_Nome_Dois = Mecanismo2.pokemon_Batalha2_GolpeDois.get(0).toString();
            pokemon_Vel2 = Mecanismo2.pokemon_Batalha2_Velocidade.get(0);
            pokemon_Def2 = Mecanismo2.pokemon_Batalha2_Defesa.get(0);
            pokemon2_DanoUm = Mecanismo2.pokemon_Batalha2_DanoUm.get(0);
            pokemon2_DanoDois = Mecanismo2.pokemon_Batalha2_DanoDois.get(0);
            tipo2_GolpeUm = Mecanismo2.pokemon_Tipo2_Um.get(0).toString();
            tipo2_GolpeDois = Mecanismo2.pokemon_Tipo2_Dois.get(0).toString();
            pokemon2_Vida = Mecanismo2.pokemon_Batalha2_Vida.get(0);
            pokemon2_Forca = Mecanismo2.pokemon_Batalha2_Forca.get(0);

            Velocidade2 = Integer.valueOf((int) pokemon_Vel2);
            vida2 = Integer.valueOf((int) pokemon2_Vida);
            Defesa2 = Integer.valueOf((int) pokemon_Def2);
            forca2 = Integer.valueOf((int) pokemon2_Forca);
            golpe2Um = Integer.valueOf((int) pokemon2_DanoUm);
            golpe2Dois = Integer.valueOf((int) pokemon2_DanoDois);

        }

        if (resp_Batalha2 == 2) {

            System.out.println();
            System.out.println("Voce Escolheu " + Mecanismo2.pokemon_Batalha2_Nome.get(1));

            pokemon2 = Mecanismo2.pokemon_Batalha2_Nome.get(1).toString();
            golpe2_Nome_Um = Mecanismo2.pokemon_Batalha2_GolpeUm.get(1).toString();
            golpe2_Nome_Dois = Mecanismo2.pokemon_Batalha2_GolpeDois.get(1).toString();
            pokemon_Vel2 = Mecanismo2.pokemon_Batalha2_Velocidade.get(1);
            pokemon_Def2 = Mecanismo2.pokemon_Batalha2_Defesa.get(1);
            pokemon2_DanoUm = Mecanismo2.pokemon_Batalha2_DanoUm.get(1);
            pokemon2_DanoDois = Mecanismo2.pokemon_Batalha2_DanoDois.get(1);
            tipo2_GolpeUm = Mecanismo2.pokemon_Tipo2_Um.get(1).toString();
            tipo2_GolpeDois = Mecanismo2.pokemon_Tipo2_Dois.get(1).toString();
            pokemon2_Vida = Mecanismo2.pokemon_Batalha2_Vida.get(1);
            pokemon2_Forca = Mecanismo2.pokemon_Batalha2_Forca.get(1);

            Velocidade2 = Integer.valueOf((int) pokemon_Vel2);
            vida2 = Integer.valueOf((int) pokemon2_Vida);
            Defesa2 = Integer.valueOf((int) pokemon_Def2);
            forca2 = Integer.valueOf((int) pokemon2_Forca);
            golpe2Um = Integer.valueOf((int) pokemon2_DanoUm);
            golpe2Dois = Integer.valueOf((int) pokemon2_DanoDois);

        }

        if (resp_Batalha2 == 3) {

            System.out.println();
            System.out.println("Voce Escolheu " + Mecanismo2.pokemon_Batalha2_Nome.get(2));

            pokemon2 = Mecanismo2.pokemon_Batalha2_Nome.get(2).toString();
            golpe2_Nome_Um = Mecanismo2.pokemon_Batalha2_GolpeUm.get(2).toString();
            golpe2_Nome_Dois = Mecanismo2.pokemon_Batalha2_GolpeDois.get(2).toString();
            pokemon_Vel2 = Mecanismo2.pokemon_Batalha2_Velocidade.get(2);
            pokemon_Def2 = Mecanismo2.pokemon_Batalha2_Defesa.get(2);
            pokemon2_DanoUm = Mecanismo2.pokemon_Batalha2_DanoUm.get(2);
            pokemon2_DanoDois = Mecanismo2.pokemon_Batalha2_DanoDois.get(2);
            tipo2_GolpeUm = Mecanismo2.pokemon_Tipo2_Um.get(2).toString();
            tipo2_GolpeDois = Mecanismo2.pokemon_Tipo2_Dois.get(2).toString();
            pokemon2_Vida = Mecanismo2.pokemon_Batalha2_Vida.get(2);
            pokemon2_Forca = Mecanismo2.pokemon_Batalha2_Forca.get(2);

            Velocidade2 = Integer.valueOf((int) pokemon_Vel2);
            vida2 = Integer.valueOf((int) pokemon2_Vida);
            Defesa2 = Integer.valueOf((int) pokemon_Def2);
            forca2 = Integer.valueOf((int) pokemon2_Forca);
            golpe2Um = Integer.valueOf((int) pokemon2_DanoUm);
            golpe2Dois = Integer.valueOf((int) pokemon2_DanoDois);

        }

        System.out.println();
        System.out.println("Primeiro Duelo Dos Pokemons");
        System.out.println();
        System.out.println(pokemon + " X " + pokemon2);

        System.out.println();

        do {

            System.out.println("Jogador 1 Escolha um De Seus Golpes");
            System.out.println();
            System.out.println("1- " + golpe_Nome_Um);
            System.out.println("2- " + golpe_Nome_Dois);

            System.out.println();
            System.out.println("Jogador 2 Escolha um De Seus Golpes");
            System.out.println();
            System.out.println("1- " + golpe2_Nome_Um);
            System.out.println("2- " + golpe2_Nome_Dois);

            System.out.println();
            Scanner s = new Scanner(System.in);
            resp_Batalha_Um = s.nextInt();
            System.out.println();
            Scanner t = new Scanner(System.in);
            resp_Batalha_Dois = s.nextInt();
            System.out.println();

            if (Velocidade > Velocidade2) {

                System.out.println("O pokemon " + pokemon + " Atacou primeiro pois é mais rapido... ");
                System.out.println();

                if (resp_Batalha_Um == 1 && resp_Batalha_Dois == 1) {

                    if (golpe_Nome_Um == "Flame" || golpe_Nome_Um == "Flamethrower" && pokemon2 == "Bulbasaur") {

                        System.out.println("O pokemon: " + pokemon2 + " Recebeu um dano critico...");
                        System.out.println();
                        soma = vida2 - golpeUm * 2;
                        vida2 = soma;
                        System.out.println("O pokemon " + pokemon + " Deu um Hit De: " + golpeUm * 2);
                        System.out.println();

                    } else if (golpe_Nome_Um == "BombSeed" || golpe_Nome_Um == "PowerWhip" && pokemon2 == "Squirtle") {

                        System.out.println("O pokemon: " + pokemon2 + " Recebeu um dano critico...");
                        System.out.println();
                        soma = vida2 - golpeUm * 2;
                        vida2 = soma;
                        System.out.println("O pokemon " + pokemon + " Deu um Hit De: " + golpeUm * 2);
                        System.out.println();

                    } else if (golpe_Nome_Um == "AquaTail" || golpe_Nome_Um == "AquaJet" && pokemon2 == "Charmander") {

                        System.out.println("O pokemon: " + pokemon2 + " Recebeu um dano critico...");
                        System.out.println();
                        soma = vida2 - golpeUm * 2;
                        vida2 = soma;
                        System.out.println("O pokemon " + pokemon + " Deu um Hit De: " + golpeUm * 2);
                        System.out.println();

                    } else {

                        soma = vida2 - golpeUm;
                        vida2 = soma;

                    }

                    if (vida2 < 0) {

                        System.out.println("O pokemon " + pokemon2 + " Ficou com: 0 De Vida");
                        System.out.println("A troca é agora obrigatoria, pois seu Pokemon Morreu...");
                        Mecanismo2.pokemon_Batalha2_Nome.remove(pokemon2);
                        System.out.println();
                        contadorMorteP2++;

                    } else {

                        System.out.println("O pokemon " + pokemon2 + " Ficou com: " + vida2 + " De Vida");
                        System.out.println();

                    }

                    soma = 0;

                    if (golpe_Nome_Dois == "Flame" || golpe_Nome_Dois == "Flamethrower" && pokemon2 == "Bulbasaur") {

                        System.out.println("O pokemon: " + pokemon + " Recebeu um dano critico...");
                        System.out.println();
                        soma = vida2 - golpeUm * 2;
                        vida2 = soma;
                        System.out.println("O pokemon " + pokemon2 + " Deu um Hit De: " + golpe2Um * 2);
                        System.out.println();

                    } else if (golpe_Nome_Dois == "BombSeed"
                            || golpe_Nome_Dois == "PowerWhip" && pokemon2 == "Squirtle") {

                        System.out.println("O pokemon: " + pokemon + " Recebeu um dano critico...");
                        System.out.println();
                        soma = vida2 - golpeUm * 2;
                        vida2 = soma;
                        System.out.println("O pokemon " + pokemon2 + " Deu um Hit De: " + golpe2Um * 2);
                        System.out.println();

                    } else if (golpe_Nome_Dois == "AquaTail"
                            || golpe_Nome_Dois == "AquaJet" && pokemon2 == "Charmander") {

                        System.out.println("O pokemon: " + pokemon + " Recebeu um dano critico...");
                        System.out.println();
                        soma = vida2 - golpeUm * 2;
                        vida2 = soma;
                        System.out.println("O pokemon " + pokemon2 + " Deu um Hit De: " + golpe2Um * 2);
                        System.out.println();

                    } else {

                        soma = vida - golpe2Um;
                        vida = soma;
                    }

                    System.out.println("O pokemon " + pokemon2 + " Deu um Hit De: " + golpe2Um);
                    System.out.println();

                    if (vida < 0) {

                        System.out.println("O pokemon " + pokemon + " Ficou com: 0 De Vida");
                        System.out.println("A troca é agora obrigatoria, pois seu Pokemon Morreu...");
                        Mecanismo2.pokemon_Batalha_Nome.remove(pokemon);
                        System.out.println();
                        contadorMorteP1++;

                    } else {

                        System.out.println("O pokemon " + pokemon + " Ficou com: " + vida + " De Vida");
                        System.out.println();

                    }

                } else if (resp_Batalha_Um == 2 && resp_Batalha_Dois == 2) {

                    soma = vida2 - golpeDois;
                    vida2 = soma;

                    System.out.println("O pokemon " + pokemon + " Deu um Hit De: " + golpeDois);
                    System.out.println();

                    if (vida2 < 0) {

                        System.out.println("O pokemon " + pokemon2 + " Ficou com: 0 De Vida");
                        System.out.println("A troca é agora obrigatoria, pois seu Pokemon Morreu...");
                        Mecanismo2.pokemon_Batalha2_Nome.remove(pokemon2);
                        System.out.println();
                        contadorMorteP2++;

                    } else {

                        System.out.println("O pokemon " + pokemon2 + " Ficou com: " + vida2 + " De Vida");
                        System.out.println();

                    }

                    soma = 0;

                    soma = vida - golpe2Dois;
                    vida = soma;

                    System.out.println("O pokemon " + pokemon2 + " Deu um Hit De: " + golpe2Dois);
                    System.out.println();

                    if (vida < 0) {

                        System.out.println("O pokemon " + pokemon + " Ficou com: 0 De Vida");
                        System.out.println("A troca é agora obrigatoria, pois seu Pokemon Morreu...");
                        Mecanismo2.pokemon_Batalha_Nome.remove(pokemon);
                        System.out.println();
                        contadorMorteP1++;

                    } else {

                        System.out.println("O pokemon " + pokemon + " Ficou com: " + vida + " De Vida");
                        System.out.println();

                    }

                }

            } else {

                System.out.println("O pokemon " + pokemon2 + " Atacou primeiro pois é mais rapido... ");
                System.out.println();

                if (resp_Batalha_Dois == 1 && resp_Batalha_Um == 1) {

                    soma = vida - golpe2Um;
                    vida = soma;

                    System.out.println("O pokemon " + pokemon2 + " Deu um Hit De: " + golpe2Um);
                    System.out.println();

                    if (vida < 0) {

                        System.out.println("O pokemon " + pokemon + " Ficou com: 0 De Vida");
                        System.out.println("A troca é agora obrigatoria, pois seu Pokemon Morreu...");
                        Mecanismo2.pokemon_Batalha_Nome.remove(pokemon);
                        System.out.println();
                        contadorMorteP1++;

                    } else {

                        System.out.println("O pokemon " + pokemon + " Ficou com: " + vida + " De Vida");
                        System.out.println();

                    }

                    soma = 0;

                    soma = vida2 - golpeUm;
                    vida2 = soma;

                    System.out.println("O pokemon " + pokemon + " Deu um Hit De: " + golpeUm);
                    System.out.println();

                    if (vida2 < 0) {

                        System.out.println("O pokemon " + pokemon2 + " Ficou com: 0 De Vida");
                        System.out.println("A troca é agora obrigatoria, pois seu Pokemon Morreu...");
                        Mecanismo2.pokemon_Batalha2_Nome.remove(pokemon2);
                        System.out.println();
                        contadorMorteP2++;

                    } else {

                        System.out.println("O pokemon " + pokemon2 + " Ficou com: " + vida2 + " De Vida");
                        System.out.println();

                    }

                } else if (resp_Batalha_Dois == 2 && resp_Batalha_Um == 2) {

                    soma = vida - golpe2Dois;
                    vida = soma;

                    System.out.println("O pokemon " + pokemon2 + " Deu um Hit De: " + golpe2Dois);
                    System.out.println();

                    if (vida < 0) {

                        System.out.println("O pokemon " + pokemon + " Ficou com: 0 De Vida");
                        System.out.println("A troca é agora obrigatoria, pois seu Pokemon Morreu...");
                        Mecanismo2.pokemon_Batalha_Nome.remove(pokemon);
                        System.out.println();
                        contadorMorteP1++;

                    } else {

                        System.out.println("O pokemon " + pokemon + " Ficou com: " + vida + " De Vida");
                        System.out.println();

                    }

                    soma = 0;

                    soma = vida2 - golpeDois;
                    vida2 = soma;

                    System.out.println("O pokemon " + pokemon + " Deu um Hit De: " + golpeDois);
                    System.out.println();

                    if (vida2 < 0) {

                        System.out.println("O pokemon " + pokemon2 + " Ficou com: 0 De Vida");
                        System.out.println("A troca é agora obrigatoria, pois seu Pokemon Morreu...");
                        Mecanismo2.pokemon_Batalha2_Nome.remove(pokemon2);
                        System.out.println();
                        contadorMorteP2++;

                    } else {

                        System.out.println("O pokemon " + pokemon2 + " Ficou com: " + vida2 + " De Vida");
                        System.out.println();

                    }
                }
            }

            Scanner g = new Scanner(System.in);
            System.out.println("Jogador 1 deseja fazer a troca? 1-Sim 2-Não");
            System.out.println();
            troca = g.nextInt();

            if (troca == 1) {

                System.out.println();
                System.out.println("Qual Pokemon?");
                System.out.println();

                if (Mecanismo2.pokemon_Batalha_Nome.size() == 1) {

                    System.out.println("1- " + Mecanismo2.pokemon_Batalha_Nome.get(0));

                }

                if (Mecanismo2.pokemon_Batalha_Nome.size() == 2) {

                    System.out.println("1- " + Mecanismo2.pokemon_Batalha_Nome.get(0));
                    System.out.println("2- " + Mecanismo2.pokemon_Batalha_Nome.get(1));

                }

                if (Mecanismo2.pokemon_Batalha_Nome.size() == 3) {

                    System.out.println("1- " + Mecanismo2.pokemon_Batalha_Nome.get(0));
                    System.out.println("2- " + Mecanismo2.pokemon_Batalha_Nome.get(1));
                    System.out.println("3- " + Mecanismo2.pokemon_Batalha_Nome.get(2));

                }

                Scanner l = new Scanner(System.in);
                int tr = l.nextInt();

                if (tr == 1) {

                    System.out.println("Nova batalha...");
                    pokemon = Mecanismo2.pokemon_Batalha_Nome.get(0).toString();
                    golpe_Nome_Um = Mecanismo2.pokemon_Batalha_GolpeUm.get(0).toString();
                    golpe_Nome_Dois = Mecanismo2.pokemon_Batalha_GolpeDois.get(0).toString();
                    pokemon_Vel = Mecanismo2.pokemon_Batalha_Velocidade.get(0);
                    pokemon_Def = Mecanismo2.pokemon_Batalha_Defesa.get(0);
                    pokemon_DanoUm = Mecanismo2.pokemon_Batalha_DanoUm.get(0);
                    pokemon_DanoDois = Mecanismo2.pokemon_Batalha_DanoDois.get(0);
                    tipo_GolpeUm = Mecanismo2.pokemon_Tipo_Um.get(0).toString();
                    tipo_GolpeDois = Mecanismo2.pokemon_Tipo_Dois.get(0).toString();
                    pokemon_Vida = Mecanismo2.pokemon_Batalha_Vida.get(0);
                    pokemon_Forca = Mecanismo2.pokemon_Batalha_Forca.get(0);

                    Velocidade = Integer.valueOf((int) pokemon_Vel);
                    vida = Integer.valueOf((int) pokemon_Vida);
                    Defesa = Integer.valueOf((int) pokemon_Def);
                    forca = Integer.valueOf((int) pokemon_Forca);
                    golpeUm = Integer.valueOf((int) pokemon_DanoUm);
                    golpeDois = Integer.valueOf((int) pokemon_DanoDois);

                    System.out.println(pokemon + " X " + pokemon2);

                    System.out.println();

                } else if (tr == 2) {

                    System.out.println("Nova batalha...");
                    pokemon = Mecanismo2.pokemon_Batalha_Nome.get(1).toString();
                    golpe_Nome_Um = Mecanismo2.pokemon_Batalha_GolpeUm.get(1).toString();
                    golpe_Nome_Dois = Mecanismo2.pokemon_Batalha_GolpeDois.get(1).toString();
                    pokemon_Vel = Mecanismo2.pokemon_Batalha_Velocidade.get(1);
                    pokemon_Def = Mecanismo2.pokemon_Batalha_Defesa.get(1);
                    pokemon_DanoUm = Mecanismo2.pokemon_Batalha_DanoUm.get(1);
                    pokemon_DanoDois = Mecanismo2.pokemon_Batalha_DanoDois.get(1);
                    tipo_GolpeUm = Mecanismo2.pokemon_Tipo_Um.get(1).toString();
                    tipo_GolpeDois = Mecanismo2.pokemon_Tipo_Dois.get(1).toString();
                    pokemon_Vida = Mecanismo2.pokemon_Batalha_Vida.get(1);
                    pokemon_Forca = Mecanismo2.pokemon_Batalha_Forca.get(1);

                    Velocidade = Integer.valueOf((int) pokemon_Vel);
                    vida = Integer.valueOf((int) pokemon_Vida);
                    Defesa = Integer.valueOf((int) pokemon_Def);
                    forca = Integer.valueOf((int) pokemon_Forca);
                    golpeUm = Integer.valueOf((int) pokemon_DanoUm);
                    golpeDois = Integer.valueOf((int) pokemon_DanoDois);

                    System.out.println(pokemon + " X " + pokemon2);

                    System.out.println();

                } else {

                    System.out.println("Nova batalha...");
                    pokemon = Mecanismo2.pokemon_Batalha_Nome.get(2).toString();
                    golpe_Nome_Um = Mecanismo2.pokemon_Batalha_GolpeUm.get(2).toString();
                    golpe_Nome_Dois = Mecanismo2.pokemon_Batalha_GolpeDois.get(2).toString();
                    pokemon_Vel = Mecanismo2.pokemon_Batalha_Velocidade.get(2);
                    pokemon_Def = Mecanismo2.pokemon_Batalha_Defesa.get(2);
                    pokemon_DanoUm = Mecanismo2.pokemon_Batalha_DanoUm.get(2);
                    pokemon_DanoDois = Mecanismo2.pokemon_Batalha_DanoDois.get(2);
                    tipo_GolpeUm = Mecanismo2.pokemon_Tipo_Um.get(2).toString();
                    tipo_GolpeDois = Mecanismo2.pokemon_Tipo_Dois.get(2).toString();
                    pokemon_Vida = Mecanismo2.pokemon_Batalha_Vida.get(2);
                    pokemon_Forca = Mecanismo2.pokemon_Batalha_Forca.get(2);

                    Velocidade = Integer.valueOf((int) pokemon_Vel);
                    vida = Integer.valueOf((int) pokemon_Vida);
                    Defesa = Integer.valueOf((int) pokemon_Def);
                    forca = Integer.valueOf((int) pokemon_Forca);
                    golpeUm = Integer.valueOf((int) pokemon_DanoUm);
                    golpeDois = Integer.valueOf((int) pokemon_DanoDois);

                    System.out.println(pokemon + " X " + pokemon2);

                    System.out.println();

                }

            }

            Scanner p = new Scanner(System.in);
            System.out.println("Jogador 2 deseja fazer a troca? 1-Sim 2-Não");
            troca2 = p.nextInt();

            if (troca2 == 1) {

                System.out.println();
                System.out.println("Qual Pokemon?");

                if (Mecanismo2.pokemon_Batalha2_Nome.size() == 1) {

                    System.out.println("1- " + Mecanismo2.pokemon_Batalha2_Nome.get(0));

                }

                if (Mecanismo2.pokemon_Batalha2_Nome.size() == 2) {

                    System.out.println("1- " + Mecanismo2.pokemon_Batalha2_Nome.get(0));
                    System.out.println("2- " + Mecanismo2.pokemon_Batalha2_Nome.get(1));

                }

                if (Mecanismo2.pokemon_Batalha2_Nome.size() == 3) {

                    System.out.println("1- " + Mecanismo2.pokemon_Batalha2_Nome.get(0));
                    System.out.println("2- " + Mecanismo2.pokemon_Batalha2_Nome.get(1));
                    System.out.println("3- " + Mecanismo2.pokemon_Batalha2_Nome.get(2));

                }

                Scanner oi = new Scanner(System.in);
                int pp = oi.nextInt();

                if (pp == 1) {

                    System.out.println("Nova batalha...");
                    pokemon2 = Mecanismo2.pokemon_Batalha2_Nome.get(0).toString();
                    golpe2_Nome_Um = Mecanismo2.pokemon_Batalha2_GolpeUm.get(0).toString();
                    golpe2_Nome_Dois = Mecanismo2.pokemon_Batalha2_GolpeDois.get(0).toString();
                    pokemon_Vel2 = Mecanismo2.pokemon_Batalha2_Velocidade.get(0);
                    pokemon_Def2 = Mecanismo2.pokemon_Batalha2_Defesa.get(0);
                    pokemon2_DanoUm = Mecanismo2.pokemon_Batalha2_DanoUm.get(0);
                    pokemon2_DanoDois = Mecanismo2.pokemon_Batalha2_DanoDois.get(0);
                    tipo2_GolpeUm = Mecanismo2.pokemon_Tipo2_Um.get(0).toString();
                    tipo2_GolpeDois = Mecanismo2.pokemon_Tipo2_Dois.get(0).toString();
                    pokemon2_Vida = Mecanismo2.pokemon_Batalha2_Vida.get(0);
                    pokemon2_Forca = Mecanismo2.pokemon_Batalha2_Forca.get(0);

                    Velocidade2 = Integer.valueOf((int) pokemon_Vel2);
                    vida2 = Integer.valueOf((int) pokemon2_Vida);
                    Defesa2 = Integer.valueOf((int) pokemon_Def2);
                    forca2 = Integer.valueOf((int) pokemon2_Forca);
                    golpe2Um = Integer.valueOf((int) pokemon2_DanoUm);
                    golpe2Dois = Integer.valueOf((int) pokemon2_DanoDois);

                    System.out.println(pokemon + " X " + pokemon2);

                    System.out.println();

                } else if (pp == 2) {

                    System.out.println("Nova batalha...");
                    pokemon2 = Mecanismo2.pokemon_Batalha2_Nome.get(1).toString();
                    golpe2_Nome_Um = Mecanismo2.pokemon_Batalha2_GolpeUm.get(1).toString();
                    golpe2_Nome_Dois = Mecanismo2.pokemon_Batalha2_GolpeDois.get(1).toString();
                    pokemon_Vel2 = Mecanismo2.pokemon_Batalha2_Velocidade.get(1);
                    pokemon_Def2 = Mecanismo2.pokemon_Batalha2_Defesa.get(1);
                    pokemon2_DanoUm = Mecanismo2.pokemon_Batalha2_DanoUm.get(1);
                    pokemon2_DanoDois = Mecanismo2.pokemon_Batalha2_DanoDois.get(1);
                    tipo2_GolpeUm = Mecanismo2.pokemon_Tipo2_Um.get(1).toString();
                    tipo2_GolpeDois = Mecanismo2.pokemon_Tipo2_Dois.get(1).toString();
                    pokemon2_Vida = Mecanismo2.pokemon_Batalha2_Vida.get(1);
                    pokemon2_Forca = Mecanismo2.pokemon_Batalha2_Forca.get(1);

                    Velocidade2 = Integer.valueOf((int) pokemon_Vel2);
                    vida2 = Integer.valueOf((int) pokemon2_Vida);
                    Defesa2 = Integer.valueOf((int) pokemon_Def2);
                    forca2 = Integer.valueOf((int) pokemon2_Forca);
                    golpe2Um = Integer.valueOf((int) pokemon2_DanoUm);
                    golpe2Dois = Integer.valueOf((int) pokemon2_DanoDois);

                    System.out.println(pokemon + " X " + pokemon2);

                    System.out.println();

                } else {

                    System.out.println("Nova batalha...");
                    pokemon2 = Mecanismo2.pokemon_Batalha2_Nome.get(2).toString();
                    golpe2_Nome_Um = Mecanismo2.pokemon_Batalha2_GolpeUm.get(2).toString();
                    golpe2_Nome_Dois = Mecanismo2.pokemon_Batalha2_GolpeDois.get(2).toString();
                    pokemon_Vel2 = Mecanismo2.pokemon_Batalha2_Velocidade.get(2);
                    pokemon_Def2 = Mecanismo2.pokemon_Batalha2_Defesa.get(2);
                    pokemon2_DanoUm = Mecanismo2.pokemon_Batalha2_DanoUm.get(2);
                    pokemon2_DanoDois = Mecanismo2.pokemon_Batalha2_DanoDois.get(2);
                    tipo2_GolpeUm = Mecanismo2.pokemon_Tipo2_Um.get(2).toString();
                    tipo2_GolpeDois = Mecanismo2.pokemon_Tipo2_Dois.get(2).toString();
                    pokemon2_Vida = Mecanismo2.pokemon_Batalha2_Vida.get(2);
                    pokemon2_Forca = Mecanismo2.pokemon_Batalha2_Forca.get(2);

                    Velocidade2 = Integer.valueOf((int) pokemon_Vel2);
                    vida2 = Integer.valueOf((int) pokemon2_Vida);
                    Defesa2 = Integer.valueOf((int) pokemon_Def2);
                    forca2 = Integer.valueOf((int) pokemon2_Forca);
                    golpe2Um = Integer.valueOf((int) pokemon2_DanoUm);
                    golpe2Dois = Integer.valueOf((int) pokemon2_DanoDois);
                    System.out.println(pokemon + " X " + pokemon2);

                    System.out.println();

                }
            }
        } while (contadorMorteP1 != 3 && contadorMorteP2 != 3);

        if (contadorMorteP1 == 3) {

            System.out.println("Parabens Jogador 2 Você Ganhou...");

        } else {

        }

        if (contadorMorteP2 == 3) {

            System.out.println("Parabens Jogador 1 Você Ganhou...");

        }
    }
}
