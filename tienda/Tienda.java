package tienda;
import javax.swing.JOptionPane;
class Tienda {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        String nombre=JOptionPane.showInputDialog(null,"Ingresa tu nombre");
        JOptionPane.showMessageDialog(null, "Hola mundo" + nombre);
    }
}