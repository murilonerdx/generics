package generics;

public class Par<C, V> { //Metodo de fazer com que ele fica generico

    private C chave;
    private V valor;

    public Par(){

    }

    public Par(C chave, V valor){
        super();
        this.chave = chave;
        this.valor = valor;
    }

    public C getChave() {
        return chave;
    }

    public V getValor() {
        return valor;
    }

    public void setChave(C chave) {
        this.chave = chave;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }
    @Override
    public boolean equals(Object obj) { //Para não repetir valores
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Par<?, ?> other = (Par<?, ?>) obj;
        if(chave ==null){
            if(other.chave != null)
                return false;
        }else if(!chave.equals(other.chave))
            return false;
        return true;
    }
}
