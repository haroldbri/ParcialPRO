package Restaurant;

public class Plato2 extends Class_padre {
    //Atributos 
     protected String Postre;
     protected String Helado;
    //Constructor 
    public Plato2(String Nombre_plato,String Precio,String Tamaño,String Postre, String Helado){
        super(Nombre_plato, Precio, Tamaño);
        this.Postre= Postre;
        this.Helado = Helado;
    }
    //Metodos
    public void MostrarDatos2(){
        System.out.println("Nombre del Plato :"+getNombre_plato()+
                           "\n Precio :"+getPrecio()+
                           "\n Tamaño :"+getTamaño()+"\n Tipo de salsa : "+Postre+"\n Bebida :"+Helado);
    }
    public void CaracEspecialesPla1(){
        System.out.println("Extremadamente delicioso");
    }
    public void CaracEspecialesPla2(){
        System.out.println("Muy buen manjar");
    }
}

