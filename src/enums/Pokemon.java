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
    WARTORTLE,
    BLASTOISE,
    CATERPIE,
    METAPOD,
    BUTTERFREE,
    WEEDLE,
    KAKUNA,
    BEEDRILL,
    PIDGEY,
    PIDGEOTTO,
    PIDGEOT,
    RATTATA,
    RATICATE,
    SPEAROW,
    FEAROW,
    EKANS,
    ARBOK,
    PIKACHU,
    RAICHU,
    SANDSHREW,
    SANDSLASH,
    NIDORAN_F,
    NIDORINA,
    NIDOQUEEN,
    NIDORAN_M,
    NIDORINO,
    NIDOKING,
    CLEFAIRY,
    CLEFABLE,
    VULPIX,
    NINETALES,
    JIGGLYPUFF,
    WIGGLYTUFF,
    ZUBAT,
    GOLBAT,
    ODDISH,
    GLOOM,
    VILEPLUME,
    PARAS,
    PARASECT,
    VENONAT,
    VENOMOTH,
    DIGLETT,
    DUGTRIO,
    MEOWTH,
    PERSIAN,
    PSYDUCK,
    GOLDUCK,
    MANKEY,
    PRIMEAPE,
    GROWLITHE,
    ARCANINE,
    POLIWAG,
    POLIWHIRL,
    POLIWRATH,
    ABRA,
    KADABRA,
    ALAKAZAM,
    MACHOP,
    MACHOKE,
    MACHAMP,
    BELLSPROUT,
    WEEPINBELL,
    VICTREEBEL,
    TENTACOOL,
    TENTACRUEL,
    GEODUDE,
    GRAVELER,
    GOLEM,
    PONYTA,
    RAPIDASH,
    SLOWPOKE,
    SLOWBRO,
    MAGNEMITE,
    MAGNETON,
    FARFETCHD,
    DODUO,
    DODRIO,
    SEEL,
    DEWGONG,
    GRIMER,
    MUK,
    SHELLDER,
    CLOYSTER,
    GASTLY,
    HAUNTER,
    GENGAR,
    ONIX,
    DROWZEE,
    HYPNO,
    KRABBY,
    KINGLER,
    VOLTORB,
    ELECTRODE,
    EXEGGCUTE,
    EXEGGUTOR,
    CUBONE,
    MAROWAK,
    HITMONLEE,
    HITMONCHAN,
    LICKITUNG,
    KOFFING,
    WEEZING,
    RHYHORN,
    RHYDON,
    CHANSEY,
    TANGELA,
    KANGASKHAN,
    HORSEA,
    SEADRA,
    GOLDEEN,
    SEAKING,
    STARYU,
    STARMIE,
    MR_MIME,
    SCYTHER,
    JYNX,
    ELECTABUZZ,
    MAGMAR,
    PINSIR,
    TAUROS,
    MAGIKARP,
    GYARADOS,
    LAPRAS,
    DITTO,
    EEVEE,
    VAPOREON,
    JOLTEON,
    FLAREON,
    PORYGON,
    OMANYTE,
    OMASTAR,
    KABUTO,
    KABUTOPS,
    AERODACTYL,
    SNORLAX,
    ARTICUNO,
    ZAPDOS,
    MOLTRES,
    DRATINI,
    DRAGONAIR,
    DRAGONITE,
    MEWTWO,
    MEW;

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
