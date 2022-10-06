import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;

public class Window extends JFrame{ //Herencia entre clases, Window hereda de JFrame
  JPanel panel = new JPanel();
  private int sizeX=600, sizeY=600;

  public Window(){
    setSize(sizeX,sizeY);//x, y
    setTitle("Voronoi");//Titulo de la ventana
    setResizable(false);//Estableze si la ventana es resizable
    setLocationRelativeTo(null);//Ubica la pantalla siempre en el centro
    setDefaultCloseOperation(EXIT_ON_CLOSE);//Termina el programa cuando se cierra el programa

    iniciarComponentes();
  }

  private void iniciarComponentes(){
    ponerPanel();
    //crearEtiqueta(puntoA.getPositionX(),20);
    crearPuntos();


  }

  public void ponerPanel(){
    panel.setLayout(null);//Desactiva el layout (Diseño por defecto) del panel
    panel.setBounds(0,0,200,200);
    //panel.setBackground(Color.BLACK);

    this.getContentPane().add(panel);//Agrega el panel a la ventana
  }

  public int getWindowSizeX(){
    return sizeX;
  }
  public int getWindowSizeY(){
    return sizeY;
  }

public void crearPuntos(){
  dott puntoA = new dott();
  puntoA.setRandomPosition(getWindowSizeX(), getWindowSizeY());
  crearEtiqueta(puntoA.getPositionX(),puntoA.getPositionY());
  System.out.println("Position X = " + puntoA.getPositionX() + "\n Position Y = " + puntoA.getPositionY());
}

  public void crearEtiqueta(int setPositionX, int setPositionY){
    JLabel punto = new JLabel();
    punto.setText("Hola Lemon");
    punto.setBounds(setPositionX, setPositionY, 20,20);
    panel.add(punto);
  }

}
