package Restaurant;

public class Plato1 extends Class_padre {
    //Atributos
    protected String Tipo_salsa;
    protected String Bebida;
    //Constructor
    public Plato1(String Nombre_plato,String Precio,String Tamaño,String Tipo_salsa, String Bebida){
        super(Nombre_plato, Precio, Tamaño);
        this.Bebida = Bebida;
        this.Tipo_salsa = Tipo_salsa;
    }
    //Metodos
    public void MostrarDatos(){
        System.out.println("Nombre del Plato :"+getNombre_plato()+
                           "\n Precio :"+getPrecio()+
                           "\n Tamaño :"+getTamaño()+"\n Tipo de salsa : "+Tipo_salsa+"\n Bebida :"+Bebida);
    }
    public void CaracEspeciales1pla1(){
        System.out.println("Como para chuparse los dedos");
    }
    public void CaracEspeciales1pla2(){
        System.out.println("Como para que vuelas pronto a nuestro negocio");
    }
}
