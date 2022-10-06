import java.util.Random;

public class dott{

  private int positionX;
  private int positionY;
  private String color;
  private String nombre;
  //visibles

  Random rand = new Random();

  private void setPositionX(int newPositionX){
    positionX = newPositionX;
  }
  private void setPositionY(int newPositionY){
    positionY = newPositionY;
  }
  private void setColor(String newColor){
    color = newColor;
  }
  public void setRandomPosition(int windowXSize, int windowYSize){
    positionX = rand.nextInt(windowXSize);
    positionY = rand.nextInt(windowYSize);
    //Window.etiqueta();
  }
  public void setNombre(String setNombre){
    nombre = setNombre;
  }
  public int getPositionX(){
    return positionX;
  }
  public int getPositionY(){
    return positionY;
  }
  public String getColor(){
    return color;
  }
  public String getNombre(){
    return nombre;
  }

}
