package generics;

public class CaixaTeste<TIPO>{
    private Object coisa;

    public void aguardar(TIPO coisa){
        this.coisa = coisa;
    }

    public TIPO abrir(){
        return (TIPO) coisa;
    }
    
    public String toString(){
        return (String) this.coisa;
    }
    
}