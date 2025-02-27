public class PlacaMae extends PC {
    private String soquete;
 
public PlacaMae() {
}



public PlacaMae(String marca, String modelo, String soquete) {
    super(marca, modelo);
    this.soquete = soquete;
}



public String getSoquete() {
    return soquete;
}

public void setSoquete(String soquete) {
    this.soquete = soquete;
}

@Override
public String toString() {
    return "PlacaMae [marca=" + marca + ", soquete=" + soquete + ", modelo=" + modelo + "]";
}
    
}
