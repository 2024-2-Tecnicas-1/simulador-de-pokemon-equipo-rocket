package simulador.pokemon;

public enum TipoPokemon {

    FUEGO,
    AGUA,
    BICHO,
    ELECTRICO,
    TIERRA,
    VOLADOR,
    NORMAL,
    LUCHA,
    VENENO,
    BICHO_PLANTA,
    NORMAL_VOLADOR;

    public double obtenerMultiplicadorDeDaño(TipoPokemon atacante, TipoPokemon defensor) {
        switch (atacante) {
            case FUEGO:
                switch (defensor) {
                    case AGUA:
                        return 0.5;
                    case FUEGO:
                        return 1;
                    case ELECTRICO:
                        return 1;
                    case VOLADOR:
                        return 1;
                    case TIERRA:
                        return 1;
                    case LUCHA:
                        return 1;
                    case VENENO:
                        return 1;
                    case NORMAL:
                        return 1;
                    case NORMAL_VOLADOR:
                        return 1;
                    case BICHO_PLANTA:
                        return 2;
                    default:
                        return 1;
                }
            case AGUA:
                switch (defensor) {
                    case AGUA:
                        return 1;
                    case ELECTRICO:
                        return 1;
                    case VOLADOR:
                        return 1;
                    case TIERRA:
                        return 1;
                    case LUCHA:
                        return 1;
                    case VENENO:
                        return 1;
                    case NORMAL:
                        return 1;
                    case NORMAL_VOLADOR:
                        return 1;
                    case BICHO_PLANTA:
                        return 1;
                    case FUEGO:
                        return 2;
                    default:
                        return 1;
                }
            case BICHO_PLANTA:
                switch (defensor) {
                    case AGUA:
                        return 1;
                    case ELECTRICO:
                        return 1;
                    case VOLADOR:
                        return 2;
                    case TIERRA:
                        return 1;
                    case LUCHA:
                        return 1;
                    case VENENO:
                        return 1;
                    case NORMAL:
                        return 1;
                    case NORMAL_VOLADOR:
                        return 1;
                    case BICHO_PLANTA:
                        return 1;
                    case FUEGO:
                        return 1;
                    default:
                        return 1;
                }
            case ELECTRICO:    
                switch (defensor) {
                    case AGUA:
                        return 2;
                    case ELECTRICO:
                        return 1;
                    case VOLADOR:
                        return 2;
                    case TIERRA:
                        return 0;
                    case LUCHA:
                        return 1;
                    case VENENO:
                        return 1;
                    case NORMAL:
                        return 1;
                    case NORMAL_VOLADOR:
                        return 1;
                    case BICHO_PLANTA:
                        return 1;
                    case FUEGO:
                        return 1;
                    default:
                        return 1;
                }
            case TIERRA:    
                switch (defensor) {
                    case AGUA:
                        return 1;
                    case ELECTRICO:
                        return 0;
                    case VOLADOR:
                        return 0.5;
                    case TIERRA:
                        return 1;
                    case LUCHA:
                        return 1;
                    case VENENO:
                        return 2;
                    case NORMAL:
                        return 1;
                    case NORMAL_VOLADOR:
                        return 1;
                    case BICHO_PLANTA:
                        return 1;
                    case FUEGO:
                        return 2;
                    default:
                        return 1;    
        }
                case VOLADOR:    
                switch (defensor) {
                    case AGUA:
                        return 1;
                    case ELECTRICO:
                        return 2;
                    case VOLADOR:
                        return 1;
                    case TIERRA:
                        return 1;
                    case LUCHA:
                        return 1;
                    case VENENO:
                        return 1;
                    case NORMAL:
                        return 1;
                    case NORMAL_VOLADOR:
                        return 1;
                    case BICHO_PLANTA:
                        return 2;
                    case FUEGO:
                        return 1;
                    default:
                        return 1;    
        }
                case LUCHA:    
                switch (defensor) {
                    case AGUA:
                        return 1;
                    case ELECTRICO:
                        return 1;
                    case VOLADOR:
                        return 1;
                    case TIERRA:
                        return 1;
                    case LUCHA:
                        return 1;
                    case VENENO:
                        return 1;
                    case NORMAL:
                        return 2;
                    case NORMAL_VOLADOR:
                        return 2;
                    case BICHO_PLANTA:
                        return 1;
                    case FUEGO:
                        return 1;
                    default:
                        return 1;    
        }
                case VENENO:    
                switch (defensor) {
                    case AGUA:
                        return 1;
                    case ELECTRICO:
                        return 1;
                    case VOLADOR:
                        return 1;
                    case TIERRA:
                        return 1;
                    case LUCHA:
                        return 1;
                    case VENENO:
                        return 1;
                    case NORMAL:
                        return 1;
                    case NORMAL_VOLADOR:
                        return 1;
                    case BICHO_PLANTA:
                        return 1;
                    case FUEGO:
                        return 1;
                    default:
                        return 1;    
        }
                case NORMAL:    
                switch (defensor) {
                    case AGUA:
                        return 1;
                    case ELECTRICO:
                        return 1;
                    case VOLADOR:
                        return 1;
                    case TIERRA:
                        return 1;
                    case LUCHA:
                        return 1;
                    case VENENO:
                        return 1;
                    case NORMAL:
                        return 1;
                    case NORMAL_VOLADOR:
                        return 1;
                    case BICHO_PLANTA:
                        return 1;
                    case FUEGO:
                        return 1;
                    default:
                        return 1;    
        }
        }
