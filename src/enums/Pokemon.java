package enums;

import java.lang.reflect.Type;
import java.util.PropertyPermission;

public enum Pokemon {
    BULBASAUR("Bulbasaur", PokemonType.GRASS, PokemonType.POISON, 45, 49, 49, 65, 45),
    IVYSAUR("Ivysaur", PokemonType.GRASS, PokemonType.POISON, 60, 62, 63, 80, 60),
    VENUSAUR("Venusaur", PokemonType.GRASS, PokemonType.POISON, 80, 82, 83, 100, 80),
    CHARMANDER("Charmander", PokemonType.FIRE, PokemonType.NONE, 39, 52, 43, 50, 65),
    CHARMELEON("Charmeleon", PokemonType.FIRE, PokemonType.NONE, 58, 64, 58, 65, 80),
    CHARIZARD("Charizard", PokemonType.FIRE, PokemonType.FLYING, 78, 84, 78, 85, 100),
    SQUIRTLE("Squirtle", PokemonType.WATER, PokemonType.NONE, 44, 48, 65, 50, 43),
    WARTORTLE("Wartortle", PokemonType.WATER, PokemonType.NONE, 59, 63, 80, 65, 58),
    BLASTOISE("Blastoise", PokemonType.WATER, PokemonType.NONE, 79, 83, 100, 85, 78),
    CATERPIE("Caterpie", PokemonType.BUG, PokemonType.NONE, 45, 30, 35, 20, 45),
    METAPOD("Metapod", PokemonType.BUG, PokemonType.NONE, 50, 20, 55, 25, 30),
    BUTTERFREE("Butterfree", PokemonType.FLYING, PokemonType.BUG, 60, 45, 50, 80, 70),
    WEEDLE("Weedle", PokemonType.POISON, PokemonType.BUG, 40, 35, 30, 20, 50),
    KAKUNA("Kakuna", PokemonType.POISON, PokemonType.BUG, 45, 25, 50, 25, 35),
    BEEDRILL("Beedrill", PokemonType.POISON, PokemonType.BUG, 65, 80, 40, 45, 75),
    PIDGEY("Pidgey", PokemonType.FLYING, PokemonType.NORMAL, 40, 45, 40, 35, 56),
    PIDGEOTTO("Pidgeotto", PokemonType.FLYING, PokemonType.NORMAL, 63, 60, 55, 50, 71),
    PIDGEOT("Pidgeot", PokemonType.FLYING, PokemonType.NORMAL, 83, 80, 75, 70, 91),
    RATTATA("Rattata", PokemonType.NORMAL, PokemonType.NONE, 30, 56, 35, 25, 72),
    RATICATE("Raticate", PokemonType.NORMAL, PokemonType.NONE, 55, 81, 60, 50, 97),
    SPEAROW("Spearow", PokemonType.FLYING, PokemonType.NONE, 40, 60, 30, 31, 70),
    FEAROW("Fearow", PokemonType.FLYING, PokemonType.NONE, 65, 90, 65, 61, 100),
    EKANS("Ekans", PokemonType.POISON, PokemonType.NONE, 35, 60, 44, 40, 55),
    ARBOK("Arbok", PokemonType.POISON,PokemonType.NONE, 60, 85, 69, 65, 80),
    PIKACHU("Pikachu", PokemonType.ELECTRIC, PokemonType.NONE, 35, 55, 30, 50, 90),
    RAICHU("Raichu", PokemonType.ELECTRIC, PokemonType.NONE, 60, 90, 55, 90, 100),
    SANDSHREW("Sandshrew", PokemonType.GROUND, PokemonType.NONE, 50, 75, 85, 30, 40),
    SANDSLASH("Sandslash", PokemonType.GROUND, PokemonType.NONE, 75, 100, 110, 55, 65),
    NIDORAN_F("Nidoran_F", PokemonType.POISON, PokemonType.NONE, 55, 47, 52, 40, 41),
    NIDORINA("Nidorina", PokemonType.POISON, PokemonType.NONE, 70, 62,67, 55, 56),
    NIDOQUEEN("Nidoqueen", PokemonType.POISON, PokemonType.GROUND, 90, 82, 87, 75, 76),
    NIDORAN_M("Nidoran_M", PokemonType.POISON, PokemonType.NONE, 46, 57, 40, 40, 50),
    NIDORINO("Nidorino", PokemonType.POISON, PokemonType.NONE, 61, 72, 57, 55, 65),
    NIDOKING("Nidoking", PokemonType.POISON, PokemonType.NONE, 81, 92, 77, 75, 85),
    CLEFAIRY("Clefairy", PokemonType.NORMAL, PokemonType.NONE, 70, 45, 48, 60, 35),
    CLEFABLE("Clefable", PokemonType.NORMAL, PokemonType.NONE, 95, 70, 73, 85, 60),
    VULPIX("Vulpix", PokemonType.FIRE, PokemonType.NONE, 38, 41, 40, 65, 65),
    NINETALES("Ninetales", PokemonType.FIRE, PokemonType.NONE, 73, 76, 75, 100, 100),
    JIGGLYPUFF("Jigglypuff", PokemonType.NORMAL, PokemonType.NONE, 115, 45, 20, 25, 20),
    WIGGLYTUFF("Wigglytuff", PokemonType.NORMAL, PokemonType.NONE, 140, 70, 45, 50, 45),
    ZUBAT("Zubat", PokemonType.POISON, PokemonType.FLYING, 40, 45, 35, 40, 55),
    GOLBAT("Golbat", PokemonType.POISON, PokemonType.FIGHTING, 75, 80, 70, 75, 90),
    ODDISH("Oddish", PokemonType.GRASS, PokemonType.POISON, 45, 50, 55, 75, 30),
    GLOOM("Gloom", PokemonType.GRASS, PokemonType.POISON, 60, 65, 70, 85, 40),
    VILEPLUME("Vileplume", PokemonType.GRASS, PokemonType.POISON, 75, 80, 85, 100, 50),
    PARAS("Paras", PokemonType.BUG, PokemonType.GRASS, 35, 70, 55, 55, 25),
    PARASECT("Parasect", PokemonType.GRASS, PokemonType.BUG,60, 95, 80, 80, 30),
    VENONAT("Venonat", PokemonType.POISON, PokemonType.BUG, 60, 55, 50, 40, 45),
    VENOMOTH("Venomoth", PokemonType.POISON, PokemonType.BUG, 70, 65, 60, 90,90),
    DIGLETT("Diglett", PokemonType.GROUND, PokemonType.NONE, 10, 55, 25, 45, 95),
    DUGTRIO("Dugtrio", PokemonType.GROUND, PokemonType.NONE, 35, 80, 50, 70, 120),
    MEOWTH("Meowth", PokemonType.NORMAL, PokemonType.NONE, 40, 45, 35, 40, 90),
    PERSIAN("Persian", PokemonType.NORMAL, PokemonType.NONE, 65, 70, 60, 65, 115),
    PSYDUCK("Psyduck", PokemonType.WATER, PokemonType.NONE, 50, 52, 48, 50, 55),
    GOLDUCK("Golduck", PokemonType.WATER, PokemonType.NONE, 80, 82, 78, 80, 85),
    MANKEY("Mankey", PokemonType.FIGHTING, PokemonType.NONE, 40, 80, 35, 35, 70),
    PRIMEAPE("Primeape", PokemonType.FIGHTING, PokemonType.NONE, 65, 105, 60, 60, 95),
    GROWLITHE("Growlithe", PokemonType.FIRE, PokemonType.NONE, 55, 70, 45, 50, 60),
    ARCANINE("Arcanine", PokemonType.FIRE, PokemonType.NONE, 90, 110, 80, 80, 95),
    POLIWAG("Poliwag", PokemonType.WATER, PokemonType.NONE, 40, 50, 40, 40, 90),
    POLIWHIRL("Poliwhirl", PokemonType.WATER, PokemonType.NONE, 65, 65, 65, 50, 90),
    POLIWRATH("Poliwrath", PokemonType.WATER, PokemonType.FIGHTING, 90, 85, 95, 70, 70),
    ABRA("Abra", PokemonType.PSYCHIC, PokemonType.NONE, 25, 20, 15, 105, 90),
    KADABRA("Kadabra", PokemonType.PSYCHIC, PokemonType.NONE, 40, 35, 30, 120, 105),
    ALAKAZAM("Alakazam", PokemonType.PSYCHIC, PokemonType.NONE, 55, 50, 45, 135, 120),
    MACHOP("Machop", PokemonType.FIGHTING, PokemonType.NONE, 70, 80, 50, 35, 35),
    MACHOKE("Machoke", PokemonType.FIGHTING, PokemonType.NONE, 80, 100, 70, 50, 45),
    MACHAMP("Machamp", PokemonType.FIGHTING, PokemonType.NONE, 90, 130, 80, 65, 55),
    BELLSPROUT("Bellsprout", PokemonType.GRASS, PokemonType.POISON, 50, 75, 35, 70, 40),
    WEEPINBELL("Weepinbell", PokemonType.GRASS, PokemonType.POISON, 65, 90, 50, 85, 55),
    VICTREEBEL("Victreebel", PokemonType.GRASS, PokemonType.POISON, 80, 105, 65, 100, 70),
    TENTACOOL("Tentacool", PokemonType.POISON, PokemonType.WATER, 40, 40, 35, 100, 70),
    TENTACRUEL("Tentacruel", PokemonType.POISON, PokemonType.WATER, 80, 70, 65, 120, 100),
    GEODUDE("Geodude", PokemonType.GROUND, PokemonType.ROCK, 40, 80, 100, 30, 20),
    GRAVELER("Graveler", PokemonType.GROUND, PokemonType.ROCK, 55, 95, 115, 45, 35),
    GOLEM("Golem", PokemonType.GROUND, PokemonType.ROCK, 80, 110, 130, 55, 45),
    PONYTA("Ponyta", PokemonType.FIRE, PokemonType.NONE, 50, 85, 55, 65, 90),
    RAPIDASH("Rapidash", PokemonType.FIRE, PokemonType.NONE, 65, 100, 70, 80, 105),
    SLOWPOKE("Slowpoke", PokemonType.WATER, PokemonType.PSYCHIC, 90, 65, 65, 40, 15),
    SLOWBRO("Slowbro", PokemonType.WATER, PokemonType.PSYCHIC, 95, 75, 110, 80, 30),
    MAGNEMITE("Magnemite"),
    MAGNETON("Magneton"),
    FARFETCHD("Farfetchd"),
    DODUO("Doduo"),
    DODRIO("Dodrio"),
    SEEL("Seel"),
    DEWGONG("Dewgong"),
    GRIMER("Grimer"),
    MUK("Muk"),
    SHELLDER("Shellder"),
    CLOYSTER("Cloyster"),
    GASTLY("Gastly"),
    HAUNTER("Haunter"),
    GENGAR("Gengar"),
    ONIX("Onix"),
    DROWZEE("Drowzee"),
    HYPNO("Hypno"),
    KRABBY("Krabby"),
    KINGLER("Kingler"),
    VOLTORB("Voltorb"),
    ELECTRODE("Electrode"),
    EXEGGCUTE("Exeggcute"),
    EXEGGUTOR("Exeggutor"),
    CUBONE("Cubone"),
    MAROWAK("Marowak"),
    HITMONLEE("Hitmonlee"),
    HITMONCHAN("Hitmonchan"),
    LICKITUNG("Lickitung"),
    KOFFING("Koffing"),
    WEEZING("Weezing"),
    RHYHORN("Rhyhorn"),
    RHYDON("Rhydon"),
    CHANSEY("Chansey"),
    TANGELA("Tangela"),
    KANGASKHAN("Kangaskhan"),
    HORSEA("Horsea"),
    SEADRA("Seadra"),
    GOLDEEN("Goldeen"),
    SEAKING("Seaking"),
    STARYU("Staryu"),
    STARMIE("Starmie"),
    MR_MIME("Mr.Mime"),
    SCYTHER("Scyther"),
    JYNX("Jynx"),
    ELECTABUZZ("Electabuzz"),
    MAGMAR("Magmar"),
    PINSIR("Pinsir"),
    TAUROS("Tauros"),
    MAGIKARP("Magikarp"),
    GYARADOS("Gyarados"),
    LAPRAS("Lapras"),
    DITTO("Ditto"),
    EEVEE("Eevee"),
    VAPOREON("Vaporeon"),
    JOLTEON("Jolteon"),
    FLAREON("Flareon"),
    PORYGON("Porygon"),
    OMANYTE("Omanyte"),
    OMASTAR("Omastar"),
    KABUTO("Kabuto"),
    KABUTOPS("Kabutops"),
    AERODACTYL("Aerodactyl"),
    SNORLAX("Snorlax"),
    ARTICUNO("Articuno"),
    ZAPDOS("Zapdos"),
    MOLTRES("Moltres"),
    DRATINI("Dratini"),
    DRAGONAIR("Dragonair"),
    DRAGONITE("Dragonite"),
    MEWTWO("Mewtwo"),
    MEW("Mew");

    private final String name;
    private final PokemonType firstType;
    private final PokemonType secondType;
    private final int hp;
    private final int attack;
    private final int defense;
    private final int special;
    private final int speed;

    Pokemon(String name, PokemonType firstType, PokemonType secondType, int hp, int attack, int defense, int special, int speed) {
        this.name = name;
        this.firstType = firstType;
        this.secondType = secondType;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.special = special;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public PokemonType getFirstType() {
        return firstType;
    }

    public PokemonType getSecondType() {
        return secondType;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpecial() {
        return special;
    }

    public int getSpeed() {
        return speed;
    }
}
