package enums;

import java.lang.reflect.Type;

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
    BUTTERFREE("Butterfree"),
    WEEDLE("Weedle"),
    KAKUNA("Kakuna"),
    BEEDRILL("Beedrill"),
    PIDGEY("Pidgey"),
    PIDGEOTTO("Pidgeotto"),
    PIDGEOT("Pidgeot"),
    RATTATA("Rattata"),
    RATICATE("Raticate"),
    SPEAROW("Spearow"),
    FEAROW("Fearow"),
    EKANS("Ekans"),
    ARBOK("Arbok"),
    PIKACHU("Pikachu"),
    RAICHU("Raichu"),
    SANDSHREW("Sandshrew"),
    SANDSLASH("Sandslash"),
    NIDORAN_F("Nidoran_F"),
    NIDORINA("Nidorina"),
    NIDOQUEEN("Nidoqueen"),
    NIDORAN_M("Nidoran_M"),
    NIDORINO("Nidorino"),
    NIDOKING("Nidoking"),
    CLEFAIRY("Clefairy"),
    CLEFABLE("Clefable"),
    VULPIX("Vulpix"),
    NINETALES("Ninetales"),
    JIGGLYPUFF("Jigglypuff"),
    WIGGLYTUFF("Wigglytuff"),
    ZUBAT("Zubat"),
    GOLBAT("Golbat"),
    ODDISH("Oddish"),
    GLOOM("Gloom"),
    VILEPLUME("Vileplume"),
    PARAS("Paras"),
    PARASECT("Parasect"),
    VENONAT("Venonat"),
    VENOMOTH("Venomoth"),
    DIGLETT("Diglett"),
    DUGTRIO("Dugtrio"),
    MEOWTH("Meowth"),
    PERSIAN("Persian"),
    PSYDUCK("Psyduck"),
    GOLDUCK("Golduck"),
    MANKEY("Mankey"),
    PRIMEAPE("Primeape"),
    GROWLITHE("Growlithe"),
    ARCANINE("Arcanine"),
    POLIWAG("Poliwag"),
    POLIWHIRL("Poliwhirl"),
    POLIWRATH("Poliwrath"),
    ABRA("Abra"),
    KADABRA("Kadabra"),
    ALAKAZAM("Alakazam"),
    MACHOP("Machop"),
    MACHOKE("Machoke"),
    MACHAMP("Machamp"),
    BELLSPROUT("Bellsprout"),
    WEEPINBELL("Weepinbell"),
    VICTREEBEL("Victreebel"),
    TENTACOOL("Tentacool"),
    TENTACRUEL("Tentacruel"),
    GEODUDE("Geodude"),
    GRAVELER("Graveler"),
    GOLEM("Golem"),
    PONYTA("Ponyta"),
    RAPIDASH("Rapidash"),
    SLOWPOKE("Slowpoke"),
    SLOWBRO("Slowbro"),
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
