package Restaurant;

public class Class_padre {
    //Atributos 
    protected String Nombre_plato;
    protected String Precio;
    protected String Tamaño;
   
    //Contructor
    public Class_padre(String Nombre_plato,String Precio,String Tamaño){
        this.Nombre_plato = Nombre_plato;
        this.Precio = Precio;
        this.Tamaño = Tamaño;
    }
    public String getNombre_plato(){
        return Nombre_plato;
    }
    public String getPrecio(){
        return Precio;
    }
    public String getTamaño(){
        return Tamaño;
    }
}
