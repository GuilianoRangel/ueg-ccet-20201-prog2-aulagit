package controlador;

public class FuncionalidadeB {
    public FuncionalidadeB(){
        System.out.println("Funcionalidade B - ok");
    }
    public String getCoisa(){
        return utils.UtilidadeB.utilidadeFazCoisa("Coisa obtida!");
    }
}
