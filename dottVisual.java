import javax.swing.JLabel;

public class dottVisual{

  int positionX,
  positionY;

  public dottVisual(){
    JLabel punto = new JLabel();
    punto.setText("Hola Lemon");
    punto.setBounds(0, 0, 20, 20);

    iniciarComponentes();

  }

  public void setPositions(int setPositionX, int setPositionY){
    positionX = setPositionX;
    positionY = setPositionY;
  }

}
