
package castingobjetos2;

public class main {
    public static void main(String[]args)
    {
        animal a1= new herbivoro();//Upcasting
        a1.MensajeAnimal();
        herbivoro a2 = (herbivoro)a1;//Downcasting
        a2.MensajeAnimal();
        a2.Mensajehervivoro();
    }
    
}
