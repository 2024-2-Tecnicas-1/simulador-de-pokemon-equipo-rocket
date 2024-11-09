package simulador.pokemon;

abstract public class Pokemon {

    private String nombre;
    private int salud;
    private int puntosDeAtaque;
    private TipoPokemon tipo;
    private String estado;

    public Pokemon(String nombre, int salud, int puntosDeAtaque, TipoPokemon tipo, String estado) {
        this.nombre = nombre;
        this.salud = salud;
        this.puntosDeAtaque = puntosDeAtaque;
        this.tipo= tipo;
        this.estado= estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getPuntosDeAtaque() {
        return puntosDeAtaque;
    }

    public void setPuntosDeAtaque(int puntosDeAtaque) {
        this.puntosDeAtaque = puntosDeAtaque;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }

    public void setTipo(TipoPokemon tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    public void atacar (Pokemon oponente){  
        double ataque= tipo.obtenerMultiplicadorDeDaño(this.tipo, oponente.tipo);
        
    }
    
    public void recibirDaño(int daño){
        
    }
    public void entrenar(){
        
    }
    }

