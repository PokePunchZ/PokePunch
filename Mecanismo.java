import java.util.List;
import java.util.ArrayList;

public abstract class Mecanismo {

    static List <Object> adicionar_Charmander_Player1 = new ArrayList();
    static List <Object> adicionar_Squirtle_Player1 = new ArrayList();
    static List <Object> adicionar_Raichu_Player1 = new ArrayList();
    static List <Object> adicionar_Bulbasaur_Player1 = new ArrayList();
    static List <Object> adicionar_Alakazan_Player1 = new ArrayList();
    static List <Object> adicionar_Slaking_Player1 = new ArrayList();
    static List <Object> adicionar_Charmander_Player2 = new ArrayList();
    static List <Object> adicionar_Squirtle_Player2 = new ArrayList();
    static List <Object> adicionar_Raichu_Player2 = new ArrayList();
    static List <Object> adicionar_Bulbasaur_Player2 = new ArrayList();
    static List <Object> adicionar_Alakazan_Player2 = new ArrayList();
    static List <Object> adicionar_Slaking_Player2 = new ArrayList();

    static String pokemon_Nome_Charmander, pokemon_Nome_Squirtle, pokemon_Nome_Raichu, pokemon_Nome_Bulbasaur, pokemon_Nome_Alakazan, pokemon_Nome_Slaking;
    static String pokemon_Tipo_Charmander, pokemon_Tipo_Squirtle, pokemon_Tipo_Raichu, pokemon_Tipo_Bulbasaur, pokemon_Tipo_Alakazan, pokemon_Tipo_Slaking;
    static Object pokemon_Vida_Charmander, pokemon_Vida_Squirtle, pokemon_Vida_Raichu, pokemon_Vida_Bulbasaur, pokemon_Vida_Alakazan, pokemon_Vida_Slaking;
    static Object pokemon_Forca_Charmander, pokemon_Forca_Squirtle, pokemon_Forca_Raichu, pokemon_Forca_Bulbasaur, pokemon_Forca_Alakazan, pokemon_Forca_Slaking;
    static Object pokemon_Velocidade_Charmander, pokemon_Velocidade_Squirtle, pokemon_Velocidade_Raichu, pokemon_Velocidade_Bulbasaur, pokemon_Velocidade_Alakazan, pokemon_Velocidade_Slaking;
    static Object pokemon_Defesa_Charmander, pokemon_Defesa_Squirtle, pokemon_Defesa_Raichu, pokemon_Defesa_Bulbasaur, pokemon_Defesa_Alakazan, pokemon_Defesa_Slaking;
    static Object pokemon_NomeGolpe_Um_Charmander, pokemon_NomeGolpe_Um_Squirtle, pokemon_NomeGolpe_Um_Raichu, pokemon_NomeGolpe_Um_Bulbasaur, pokemon_NomeGolpe_Um_Alakazan, pokemon_NomeGolpe_Um_Slaking;
    static Object pokemon_DanoGolpe_Um_Charmander, pokemon_DanoGolpe_Um_Squirtle, pokemon_DanoGolpe_Um_Raichu, pokemon_DanoGolpe_Um_Bulbasaur, pokemon_DanoGolpe_Um_Alakazan, pokemon_DanoGolpe_Um_Slaking;
    static Object pokemon_NomeGolpe_Dois_Charmander, pokemon_NomeGolpe_Dois_Squirtle, pokemon_NomeGolpe_Dois_Raichu, pokemon_NomeGolpe_Dois_Bulbasaur, pokemon_NomeGolpe_Dois_Alakazan, pokemon_NomeGolpe_Dois_Slaking;
    static Object pokemon_DanoGolpe_Dois_Charmander, pokemon_DanoGolpe_Dois_Squirtle, pokemon_DanoGolpe_Dois_Raichu, pokemon_DanoGolpe_Dois_Bulbasaur, pokemon_DanoGolpe_Dois_Alakazan, pokemon_DanoGolpe_Dois_Slaking;
    static Object pokemon_TipoGolpe_Dois_Charmander, pokemon_TipoGolpe_Dois_Squirtle, pokemon_TipoGolpe_Dois_Raichu, pokemon_TipoGolpe_Dois_Bulbasaur, pokemon_TipoGolpe_Dois_Alakazan, pokemon_TipoGolpe_Dois_Slaking;
    static Object pokemon_TipoGolpe_Um_Charmander, pokemon_TipoGolpe_Um_Squirtle, pokemon_TipoGolpe_Um_Raichu, pokemon_TipoGolpe_Um_Bulbasaur, pokemon_TipoGolpe_Um_Alakazan, pokemon_TipoGolpe_Um_Slaking;

    public static void Charmander_Player1(){

        adicionar_Charmander_Player1.add(Pokemon_Charmander.pokemon_Nome);
        adicionar_Charmander_Player1.add(Pokemon_Charmander.tipo_Pokemon);
        adicionar_Charmander_Player1.add(Pokemon_Charmander.vida_Pokemon);
        adicionar_Charmander_Player1.add(Pokemon_Charmander.forca_Pokemon);
        adicionar_Charmander_Player1.add(Pokemon_Charmander.velocidade_Pokemon);
        adicionar_Charmander_Player1.add(Pokemon_Charmander.defesa_Pokemon);
        adicionar_Charmander_Player1.add(Pokemon_Charmander.golpe_Nome_Flamethrower);
        adicionar_Charmander_Player1.add(Pokemon_Charmander.golpe_Dano_Flamethrower);
        adicionar_Charmander_Player1.add(Pokemon_Charmander.golpe_Tipo_Flamethrower);
        adicionar_Charmander_Player1.add(Pokemon_Charmander.golpe_Nome_Flame);
        adicionar_Charmander_Player1.add(Pokemon_Charmander.golpe_Dano_Flame);
        adicionar_Charmander_Player1.add(Pokemon_Charmander.golpe_Tipo_Flame);
        

        pokemon_Nome_Charmander = adicionar_Charmander_Player1.get(0).toString();
        pokemon_Tipo_Charmander = adicionar_Charmander_Player1.get(1).toString();
        pokemon_Vida_Charmander = adicionar_Charmander_Player1.get(2);
        pokemon_Forca_Charmander = adicionar_Charmander_Player1.get(3);
        pokemon_Velocidade_Charmander = adicionar_Charmander_Player1.get(4);
        pokemon_Defesa_Charmander = adicionar_Charmander_Player1.get(5);
        pokemon_NomeGolpe_Um_Charmander = adicionar_Charmander_Player1.get(6);
        pokemon_DanoGolpe_Um_Charmander= adicionar_Charmander_Player1.get(7);
        pokemon_TipoGolpe_Um_Charmander = adicionar_Charmander_Player1.get(8);
        pokemon_NomeGolpe_Dois_Charmander = adicionar_Charmander_Player1.get(9);
        pokemon_DanoGolpe_Dois_Charmander = adicionar_Charmander_Player1.get(10);
        pokemon_TipoGolpe_Dois_Charmander = adicionar_Charmander_Player1.get(11);


    }

    public static void Squirtle_Player1(){

        adicionar_Squirtle_Player1.add(Pokemon_Squirtle.pokemon_Nome);
        adicionar_Squirtle_Player1.add(Pokemon_Squirtle.tipo_Pokemon);
        adicionar_Squirtle_Player1.add(Pokemon_Squirtle.vida_Pokemon);
        adicionar_Squirtle_Player1.add(Pokemon_Squirtle.forca_Pokemon);
        adicionar_Squirtle_Player1.add(Pokemon_Squirtle.velocidade_Pokemon);
        adicionar_Squirtle_Player1.add(Pokemon_Squirtle.defesa_Pokemon);
        adicionar_Squirtle_Player1.add(Pokemon_Squirtle.golpe_Nome_aguaJet);
        adicionar_Squirtle_Player1.add(Pokemon_Squirtle.golpe_Dano_aguaJet);
        adicionar_Squirtle_Player1.add(Pokemon_Squirtle.golpe_Tipo_AguaJet);
        adicionar_Squirtle_Player1.add(Pokemon_Squirtle.golpe_Nome_aguaTail);
        adicionar_Squirtle_Player1.add(Pokemon_Squirtle.golpe_Dano_aguaTail);
        adicionar_Squirtle_Player1.add(Pokemon_Squirtle.golpe_Tipo_AguaTail);

        pokemon_Nome_Squirtle = adicionar_Squirtle_Player1.get(0).toString();
        pokemon_Tipo_Squirtle = adicionar_Squirtle_Player1.get(1).toString();
        pokemon_Vida_Squirtle = adicionar_Squirtle_Player1.get(2);
        pokemon_Forca_Squirtle = adicionar_Squirtle_Player1.get(3);
        pokemon_Velocidade_Squirtle = adicionar_Squirtle_Player1.get(4);
        pokemon_Defesa_Squirtle = adicionar_Squirtle_Player1.get(5);
        pokemon_NomeGolpe_Um_Squirtle = adicionar_Squirtle_Player1.get(6);
        pokemon_DanoGolpe_Um_Squirtle= adicionar_Squirtle_Player1.get(7);
        pokemon_TipoGolpe_Um_Squirtle = adicionar_Squirtle_Player1.get(8);
        pokemon_NomeGolpe_Dois_Squirtle = adicionar_Squirtle_Player1.get(9);
        pokemon_DanoGolpe_Dois_Squirtle = adicionar_Squirtle_Player1.get(10);
        pokemon_TipoGolpe_Dois_Squirtle = adicionar_Squirtle_Player1.get(11);

    }

    public static void Raichu_Player1(){

        adicionar_Raichu_Player1.add(Pokemon_Raichu.pokemon_Nome);
        adicionar_Raichu_Player1.add(Pokemon_Raichu.tipo_Pokemon);
        adicionar_Raichu_Player1.add(Pokemon_Raichu.vida_Pokemon);
        adicionar_Raichu_Player1.add(Pokemon_Raichu.forca_Pokemon);
        adicionar_Raichu_Player1.add(Pokemon_Raichu.velocidade_Pokemon);
        adicionar_Raichu_Player1.add(Pokemon_Raichu.defesa_Pokemon);
        adicionar_Raichu_Player1.add(Pokemon_Raichu.golpe_Nome_Thunder);
        adicionar_Raichu_Player1.add(Pokemon_Raichu.golpe_Dano_Thunder);
        adicionar_Raichu_Player1.add(Pokemon_Raichu.golpe_Tipo_Thunder);
        adicionar_Raichu_Player1.add(Pokemon_Raichu.golpe_Nome_Discharge);
        adicionar_Raichu_Player1.add(Pokemon_Raichu.golpe_Dano_Discharge);
        adicionar_Raichu_Player1.add(Pokemon_Raichu.golpe_Tipo_Discharge);

        pokemon_Nome_Raichu = adicionar_Raichu_Player1.get(0).toString();
        pokemon_Tipo_Raichu = adicionar_Raichu_Player1.get(1).toString();
        pokemon_Vida_Raichu = adicionar_Raichu_Player1.get(2);
        pokemon_Forca_Raichu = adicionar_Raichu_Player1.get(3);
        pokemon_Velocidade_Raichu = adicionar_Raichu_Player1.get(4);
        pokemon_Defesa_Raichu = adicionar_Raichu_Player1.get(5);
        pokemon_NomeGolpe_Um_Raichu = adicionar_Raichu_Player1.get(6);
        pokemon_DanoGolpe_Um_Raichu= adicionar_Raichu_Player1.get(7);
        pokemon_TipoGolpe_Um_Raichu = adicionar_Raichu_Player1.get(8);
        pokemon_NomeGolpe_Dois_Raichu = adicionar_Raichu_Player1.get(9);
        pokemon_DanoGolpe_Dois_Raichu = adicionar_Raichu_Player1.get(10);
        pokemon_TipoGolpe_Dois_Raichu = adicionar_Raichu_Player1.get(11);

    }

    public static void Bulbasaur_Player1(){

        adicionar_Bulbasaur_Player1.add(Pokemon_Bulbasaur.pokemon_Nome);
        adicionar_Bulbasaur_Player1.add(Pokemon_Bulbasaur.tipo_Pokemon);
        adicionar_Bulbasaur_Player1.add(Pokemon_Bulbasaur.vida_Pokemon);
        adicionar_Bulbasaur_Player1.add(Pokemon_Bulbasaur.forca_Pokemon);
        adicionar_Bulbasaur_Player1.add(Pokemon_Bulbasaur.velocidade_Pokemon);
        adicionar_Bulbasaur_Player1.add(Pokemon_Bulbasaur.defesa_Pokemon);
        adicionar_Bulbasaur_Player1.add(Pokemon_Bulbasaur.golpe_Nome_Seed);
        adicionar_Bulbasaur_Player1.add(Pokemon_Bulbasaur.golpe_Dano_Seed);
        adicionar_Bulbasaur_Player1.add(Pokemon_Bulbasaur.golpe_Tipo_Seed);
        adicionar_Bulbasaur_Player1.add(Pokemon_Bulbasaur.golpe_Nome_PowerWhip);
        adicionar_Bulbasaur_Player1.add(Pokemon_Bulbasaur.golpe_Dano_PowerWhip);
        adicionar_Bulbasaur_Player1.add(Pokemon_Bulbasaur.golpe_Tipo_PowerWhip);

        pokemon_Nome_Bulbasaur = adicionar_Bulbasaur_Player1.get(0).toString();
        pokemon_Tipo_Bulbasaur = adicionar_Bulbasaur_Player1.get(1).toString();
        pokemon_Vida_Bulbasaur = adicionar_Bulbasaur_Player1.get(2);
        pokemon_Forca_Bulbasaur = adicionar_Bulbasaur_Player1.get(3);
        pokemon_Velocidade_Bulbasaur = adicionar_Bulbasaur_Player1.get(4);
        pokemon_Defesa_Bulbasaur = adicionar_Bulbasaur_Player1.get(5);
        pokemon_NomeGolpe_Um_Bulbasaur = adicionar_Bulbasaur_Player1.get(6);
        pokemon_DanoGolpe_Um_Bulbasaur= adicionar_Bulbasaur_Player1.get(7);
        pokemon_TipoGolpe_Um_Bulbasaur = adicionar_Bulbasaur_Player1.get(8);
        pokemon_NomeGolpe_Dois_Bulbasaur = adicionar_Bulbasaur_Player1.get(9);
        pokemon_DanoGolpe_Dois_Bulbasaur = adicionar_Bulbasaur_Player1.get(10);
        pokemon_TipoGolpe_Dois_Bulbasaur = adicionar_Bulbasaur_Player1.get(11);

    }

    public static void Alakazan_Player1(){

        adicionar_Alakazan_Player1.add(Pokemon_Alakazan.pokemon_Nome);
        adicionar_Alakazan_Player1.add(Pokemon_Alakazan.tipo_Pokemon);
        adicionar_Alakazan_Player1.add(Pokemon_Alakazan.vida_Pokemon);
        adicionar_Alakazan_Player1.add(Pokemon_Alakazan.forca_Pokemon);
        adicionar_Alakazan_Player1.add(Pokemon_Alakazan.velocidade_Pokemon);
        adicionar_Alakazan_Player1.add(Pokemon_Alakazan.defesa_Pokemon);
        adicionar_Alakazan_Player1.add(Pokemon_Alakazan.golpe_Nome_Psycho);
        adicionar_Alakazan_Player1.add(Pokemon_Alakazan.golpe_Dano_Psycho);
        adicionar_Alakazan_Player1.add(Pokemon_Alakazan.golpe_Tipo_Psycho);
        adicionar_Alakazan_Player1.add(Pokemon_Alakazan.golpe_Nome_ZenHeadButt);
        adicionar_Alakazan_Player1.add(Pokemon_Alakazan.golpe_Dano_ZenHeadButt);
        adicionar_Alakazan_Player1.add(Pokemon_Alakazan.golpe_Tipo_ZenHeadButt);

        pokemon_Nome_Alakazan = adicionar_Alakazan_Player1.get(0).toString();
        pokemon_Tipo_Alakazan = adicionar_Alakazan_Player1.get(1).toString();
        pokemon_Vida_Alakazan = adicionar_Alakazan_Player1.get(2);
        pokemon_Forca_Alakazan = adicionar_Alakazan_Player1.get(3);
        pokemon_Velocidade_Alakazan = adicionar_Alakazan_Player1.get(4);
        pokemon_Defesa_Alakazan = adicionar_Alakazan_Player1.get(5);
        pokemon_NomeGolpe_Um_Alakazan = adicionar_Alakazan_Player1.get(6);
        pokemon_DanoGolpe_Um_Alakazan= adicionar_Alakazan_Player1.get(7);
        pokemon_TipoGolpe_Um_Alakazan = adicionar_Alakazan_Player1.get(8);
        pokemon_NomeGolpe_Dois_Alakazan = adicionar_Alakazan_Player1.get(9);
        pokemon_DanoGolpe_Dois_Alakazan = adicionar_Alakazan_Player1.get(10);
        pokemon_TipoGolpe_Dois_Alakazan = adicionar_Alakazan_Player1.get(11);

    }

    public static void Slaking_Player1(){

        adicionar_Slaking_Player1.add(Pokemon_Slaking.pokemon_Nome);
        adicionar_Slaking_Player1.add(Pokemon_Slaking.tipo_Pokemon);
        adicionar_Slaking_Player1.add(Pokemon_Slaking.vida_Pokemon);
        adicionar_Slaking_Player1.add(Pokemon_Slaking.forca_Pokemon);
        adicionar_Slaking_Player1.add(Pokemon_Slaking.velocidade_Pokemon);
        adicionar_Slaking_Player1.add(Pokemon_Slaking.defesa_Pokemon);
        adicionar_Slaking_Player1.add(Pokemon_Slaking.golpe_Nome_HornAttack);
        adicionar_Slaking_Player1.add(Pokemon_Slaking.golpe_Nome_HornAttack);
        adicionar_Slaking_Player1.add(Pokemon_Slaking.golpe_Tipo_HornAttack);
        adicionar_Slaking_Player1.add(Pokemon_Slaking.golpe_Nome_BodySlam);
        adicionar_Slaking_Player1.add(Pokemon_Slaking.golpe_Nome_BodySlam);
        adicionar_Slaking_Player1.add(Pokemon_Slaking.golpe_Tipo_BodySlam);

        pokemon_Nome_Slaking = adicionar_Slaking_Player1.get(0).toString();
        pokemon_Tipo_Slaking = adicionar_Slaking_Player1.get(1).toString();
        pokemon_Vida_Slaking = adicionar_Slaking_Player1.get(2);
        pokemon_Forca_Slaking = adicionar_Slaking_Player1.get(3);
        pokemon_Velocidade_Slaking = adicionar_Slaking_Player1.get(4);
        pokemon_Defesa_Slaking = adicionar_Slaking_Player1.get(5);
        pokemon_NomeGolpe_Um_Slaking = adicionar_Slaking_Player1.get(6);
        pokemon_DanoGolpe_Um_Slaking= adicionar_Slaking_Player1.get(7);
        pokemon_TipoGolpe_Um_Slaking = adicionar_Slaking_Player1.get(8);
        pokemon_NomeGolpe_Dois_Slaking = adicionar_Slaking_Player1.get(9);
        pokemon_DanoGolpe_Dois_Slaking = adicionar_Slaking_Player1.get(10);
        pokemon_TipoGolpe_Dois_Slaking = adicionar_Slaking_Player1.get(11);

    }

    public static void Charmander_Player2(){

        adicionar_Charmander_Player2.add(Pokemon_Charmander.pokemon_Nome);
        adicionar_Charmander_Player2.add(Pokemon_Charmander.tipo_Pokemon);
        adicionar_Charmander_Player2.add(Pokemon_Charmander.vida_Pokemon);
        adicionar_Charmander_Player2.add(Pokemon_Charmander.forca_Pokemon);
        adicionar_Charmander_Player2.add(Pokemon_Charmander.velocidade_Pokemon);
        adicionar_Charmander_Player2.add(Pokemon_Charmander.defesa_Pokemon);
        adicionar_Charmander_Player2.add(Pokemon_Charmander.golpe_Nome_Flamethrower);
        adicionar_Charmander_Player2.add(Pokemon_Charmander.golpe_Dano_Flamethrower);
        adicionar_Charmander_Player2.add(Pokemon_Charmander.golpe_Tipo_Flamethrower);
        adicionar_Charmander_Player2.add(Pokemon_Charmander.golpe_Nome_Flame);
        adicionar_Charmander_Player2.add(Pokemon_Charmander.golpe_Dano_Flame);
        adicionar_Charmander_Player2.add(Pokemon_Charmander.golpe_Tipo_Flame);
        

        pokemon_Nome_Charmander = adicionar_Charmander_Player2.get(0).toString();
        pokemon_Tipo_Charmander = adicionar_Charmander_Player2.get(1).toString();
        pokemon_Vida_Charmander = adicionar_Charmander_Player2.get(2);
        pokemon_Forca_Charmander = adicionar_Charmander_Player2.get(3);
        pokemon_Velocidade_Charmander = adicionar_Charmander_Player2.get(4);
        pokemon_Defesa_Charmander = adicionar_Charmander_Player2.get(5);
        pokemon_NomeGolpe_Um_Charmander = adicionar_Charmander_Player2.get(6);
        pokemon_DanoGolpe_Um_Charmander= adicionar_Charmander_Player2.get(7);
        pokemon_TipoGolpe_Um_Charmander = adicionar_Charmander_Player2.get(8);
        pokemon_NomeGolpe_Dois_Charmander = adicionar_Charmander_Player2.get(9);
        pokemon_DanoGolpe_Dois_Charmander = adicionar_Charmander_Player2.get(10);
        pokemon_TipoGolpe_Dois_Charmander = adicionar_Charmander_Player2.get(11);

    }

    public static void Squirtle_Player2(){

        adicionar_Squirtle_Player2.add(Pokemon_Squirtle.pokemon_Nome);
        adicionar_Squirtle_Player2.add(Pokemon_Squirtle.tipo_Pokemon);
        adicionar_Squirtle_Player2.add(Pokemon_Squirtle.vida_Pokemon);
        adicionar_Squirtle_Player2.add(Pokemon_Squirtle.forca_Pokemon);
        adicionar_Squirtle_Player2.add(Pokemon_Squirtle.velocidade_Pokemon);
        adicionar_Squirtle_Player2.add(Pokemon_Squirtle.defesa_Pokemon);
        adicionar_Squirtle_Player2.add(Pokemon_Squirtle.golpe_Nome_aguaJet);
        adicionar_Squirtle_Player2.add(Pokemon_Squirtle.golpe_Dano_aguaJet);
        adicionar_Squirtle_Player2.add(Pokemon_Squirtle.golpe_Tipo_AguaJet);
        adicionar_Squirtle_Player2.add(Pokemon_Squirtle.golpe_Nome_aguaTail);
        adicionar_Squirtle_Player2.add(Pokemon_Squirtle.golpe_Dano_aguaTail);
        adicionar_Squirtle_Player2.add(Pokemon_Squirtle.golpe_Tipo_AguaTail);

        pokemon_Nome_Squirtle = adicionar_Squirtle_Player2.get(0).toString();
        pokemon_Tipo_Squirtle = adicionar_Squirtle_Player2.get(1).toString();
        pokemon_Vida_Squirtle = adicionar_Squirtle_Player2.get(2);
        pokemon_Forca_Squirtle = adicionar_Squirtle_Player2.get(3);
        pokemon_Velocidade_Squirtle = adicionar_Squirtle_Player2.get(4);
        pokemon_Defesa_Squirtle = adicionar_Squirtle_Player2.get(5);
        pokemon_NomeGolpe_Um_Squirtle = adicionar_Squirtle_Player2.get(6);
        pokemon_DanoGolpe_Um_Squirtle= adicionar_Squirtle_Player2.get(7);
        pokemon_TipoGolpe_Um_Squirtle = adicionar_Squirtle_Player2.get(8);
        pokemon_NomeGolpe_Dois_Squirtle = adicionar_Squirtle_Player2.get(9);
        pokemon_DanoGolpe_Dois_Squirtle = adicionar_Squirtle_Player2.get(10);
        pokemon_TipoGolpe_Dois_Squirtle = adicionar_Squirtle_Player2.get(11);

    }

    public static void Raichu_Player2(){

        adicionar_Raichu_Player2.add(Pokemon_Raichu.pokemon_Nome);
        adicionar_Raichu_Player2.add(Pokemon_Raichu.tipo_Pokemon);
        adicionar_Raichu_Player2.add(Pokemon_Raichu.vida_Pokemon);
        adicionar_Raichu_Player2.add(Pokemon_Raichu.forca_Pokemon);
        adicionar_Raichu_Player2.add(Pokemon_Raichu.velocidade_Pokemon);
        adicionar_Raichu_Player2.add(Pokemon_Raichu.defesa_Pokemon);
        adicionar_Raichu_Player2.add(Pokemon_Raichu.golpe_Nome_Thunder);
        adicionar_Raichu_Player2.add(Pokemon_Raichu.golpe_Dano_Thunder);
        adicionar_Raichu_Player2.add(Pokemon_Raichu.golpe_Tipo_Thunder);
        adicionar_Raichu_Player2.add(Pokemon_Raichu.golpe_Nome_Discharge);
        adicionar_Raichu_Player2.add(Pokemon_Raichu.golpe_Dano_Discharge);
        adicionar_Raichu_Player2.add(Pokemon_Raichu.golpe_Tipo_Discharge);

        pokemon_Nome_Raichu = adicionar_Raichu_Player2.get(0).toString();
        pokemon_Tipo_Raichu = adicionar_Raichu_Player2.get(1).toString();
        pokemon_Vida_Raichu = adicionar_Raichu_Player2.get(2);
        pokemon_Forca_Raichu = adicionar_Raichu_Player2.get(3);
        pokemon_Velocidade_Raichu = adicionar_Raichu_Player2.get(4);
        pokemon_Defesa_Raichu = adicionar_Raichu_Player2.get(5);
        pokemon_NomeGolpe_Um_Raichu = adicionar_Raichu_Player2.get(6);
        pokemon_DanoGolpe_Um_Raichu= adicionar_Raichu_Player2.get(7);
        pokemon_TipoGolpe_Um_Raichu = adicionar_Raichu_Player2.get(8);
        pokemon_NomeGolpe_Dois_Raichu = adicionar_Raichu_Player2.get(9);
        pokemon_DanoGolpe_Dois_Raichu = adicionar_Raichu_Player2.get(10);
        pokemon_TipoGolpe_Dois_Raichu = adicionar_Raichu_Player2.get(11);

    }

    public static void Bulbasaur_Player2(){

        adicionar_Bulbasaur_Player2.add(Pokemon_Bulbasaur.pokemon_Nome);
        adicionar_Bulbasaur_Player2.add(Pokemon_Bulbasaur.tipo_Pokemon);
        adicionar_Bulbasaur_Player2.add(Pokemon_Bulbasaur.vida_Pokemon);
        adicionar_Bulbasaur_Player2.add(Pokemon_Bulbasaur.forca_Pokemon);
        adicionar_Bulbasaur_Player2.add(Pokemon_Bulbasaur.velocidade_Pokemon);
        adicionar_Bulbasaur_Player2.add(Pokemon_Bulbasaur.defesa_Pokemon);
        adicionar_Bulbasaur_Player2.add(Pokemon_Bulbasaur.golpe_Nome_Seed);
        adicionar_Bulbasaur_Player2.add(Pokemon_Bulbasaur.golpe_Dano_Seed);
        adicionar_Bulbasaur_Player2.add(Pokemon_Bulbasaur.golpe_Tipo_Seed);
        adicionar_Bulbasaur_Player2.add(Pokemon_Bulbasaur.golpe_Nome_PowerWhip);
        adicionar_Bulbasaur_Player2.add(Pokemon_Bulbasaur.golpe_Dano_PowerWhip);
        adicionar_Bulbasaur_Player2.add(Pokemon_Bulbasaur.golpe_Tipo_PowerWhip);

        pokemon_Nome_Bulbasaur = adicionar_Bulbasaur_Player2.get(0).toString();
        pokemon_Tipo_Bulbasaur = adicionar_Bulbasaur_Player2.get(1).toString();
        pokemon_Vida_Bulbasaur = adicionar_Bulbasaur_Player2.get(2);
        pokemon_Forca_Bulbasaur = adicionar_Bulbasaur_Player2.get(3);
        pokemon_Velocidade_Bulbasaur = adicionar_Bulbasaur_Player2.get(4);
        pokemon_Defesa_Bulbasaur = adicionar_Bulbasaur_Player2.get(5);
        pokemon_NomeGolpe_Um_Bulbasaur = adicionar_Bulbasaur_Player2.get(6);
        pokemon_DanoGolpe_Um_Bulbasaur= adicionar_Bulbasaur_Player2.get(7);
        pokemon_TipoGolpe_Um_Bulbasaur = adicionar_Bulbasaur_Player2.get(8);
        pokemon_NomeGolpe_Dois_Bulbasaur = adicionar_Bulbasaur_Player2.get(9);
        pokemon_DanoGolpe_Dois_Bulbasaur = adicionar_Bulbasaur_Player2.get(10);
        pokemon_TipoGolpe_Dois_Bulbasaur = adicionar_Bulbasaur_Player2.get(11);

    }

    public static void Alakazan_Player2(){

        adicionar_Alakazan_Player2.add(Pokemon_Alakazan.pokemon_Nome);
        adicionar_Alakazan_Player2.add(Pokemon_Alakazan.tipo_Pokemon);
        adicionar_Alakazan_Player2.add(Pokemon_Alakazan.vida_Pokemon);
        adicionar_Alakazan_Player2.add(Pokemon_Alakazan.forca_Pokemon);
        adicionar_Alakazan_Player2.add(Pokemon_Alakazan.velocidade_Pokemon);
        adicionar_Alakazan_Player2.add(Pokemon_Alakazan.defesa_Pokemon);
        adicionar_Alakazan_Player2.add(Pokemon_Alakazan.golpe_Nome_Psycho);
        adicionar_Alakazan_Player2.add(Pokemon_Alakazan.golpe_Dano_Psycho);
        adicionar_Alakazan_Player2.add(Pokemon_Alakazan.golpe_Tipo_Psycho);
        adicionar_Alakazan_Player2.add(Pokemon_Alakazan.golpe_Nome_ZenHeadButt);
        adicionar_Alakazan_Player2.add(Pokemon_Alakazan.golpe_Dano_ZenHeadButt);
        adicionar_Alakazan_Player2.add(Pokemon_Alakazan.golpe_Tipo_ZenHeadButt);

        pokemon_Nome_Alakazan = adicionar_Alakazan_Player2.get(0).toString();
        pokemon_Tipo_Alakazan = adicionar_Alakazan_Player2.get(1).toString();
        pokemon_Vida_Alakazan = adicionar_Alakazan_Player2.get(2);
        pokemon_Forca_Alakazan = adicionar_Alakazan_Player2.get(3);
        pokemon_Velocidade_Alakazan = adicionar_Alakazan_Player2.get(4);
        pokemon_Defesa_Alakazan = adicionar_Alakazan_Player2.get(5);
        pokemon_NomeGolpe_Um_Alakazan = adicionar_Alakazan_Player2.get(6);
        pokemon_DanoGolpe_Um_Alakazan= adicionar_Alakazan_Player2.get(7);
        pokemon_TipoGolpe_Um_Alakazan = adicionar_Alakazan_Player2.get(8);
        pokemon_NomeGolpe_Dois_Alakazan = adicionar_Alakazan_Player2.get(9);
        pokemon_DanoGolpe_Dois_Alakazan = adicionar_Alakazan_Player2.get(10);
        pokemon_TipoGolpe_Dois_Alakazan = adicionar_Alakazan_Player2.get(11);



    }

    public static void Slaking_Player2(){

        adicionar_Slaking_Player2.add(Pokemon_Slaking.pokemon_Nome);
        adicionar_Slaking_Player2.add(Pokemon_Slaking.tipo_Pokemon);
        adicionar_Slaking_Player2.add(Pokemon_Slaking.vida_Pokemon);
        adicionar_Slaking_Player2.add(Pokemon_Slaking.forca_Pokemon);
        adicionar_Slaking_Player2.add(Pokemon_Slaking.velocidade_Pokemon);
        adicionar_Slaking_Player2.add(Pokemon_Slaking.defesa_Pokemon);
        adicionar_Slaking_Player2.add(Pokemon_Slaking.golpe_Nome_HornAttack);
        adicionar_Slaking_Player2.add(Pokemon_Slaking.golpe_Dano_HornAttack);
        adicionar_Slaking_Player2.add(Pokemon_Slaking.golpe_Tipo_HornAttack);
        adicionar_Slaking_Player2.add(Pokemon_Slaking.golpe_Nome_BodySlam);
        adicionar_Slaking_Player2.add(Pokemon_Slaking.golpe_Dano_BodySlam);
        adicionar_Slaking_Player2.add(Pokemon_Slaking.golpe_Tipo_BodySlam);

        pokemon_Nome_Slaking = adicionar_Slaking_Player2.get(0).toString();
        pokemon_Tipo_Slaking = adicionar_Slaking_Player2.get(1).toString();
        pokemon_Vida_Slaking = adicionar_Slaking_Player2.get(2);
        pokemon_Forca_Slaking = adicionar_Slaking_Player2.get(3);
        pokemon_Velocidade_Slaking = adicionar_Slaking_Player2.get(4);
        pokemon_Defesa_Slaking = adicionar_Slaking_Player2.get(5);
        pokemon_NomeGolpe_Um_Slaking = adicionar_Slaking_Player2.get(6);
        pokemon_DanoGolpe_Um_Slaking= adicionar_Slaking_Player2.get(7);
        pokemon_TipoGolpe_Um_Slaking = adicionar_Slaking_Player2.get(8);
        pokemon_NomeGolpe_Dois_Slaking = adicionar_Slaking_Player2.get(9);
        pokemon_DanoGolpe_Dois_Slaking = adicionar_Slaking_Player2.get(10);
        pokemon_TipoGolpe_Dois_Slaking = adicionar_Slaking_Player2.get(11);


    }

}
