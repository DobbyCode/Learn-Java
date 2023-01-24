public class Mappa {

    public int mappaPublic;
    int mappaDefault;
    protected int mappaProtected;
    private int mappaPrivate;
    
    public Mappa(int mappaPublic, int mappaDefault, int mappaProtected, int mappaPrivate) {
        this.mappaPublic = mappaPublic;
        this.mappaDefault = mappaDefault;
        this.mappaProtected = mappaProtected;
        this.mappaPrivate = mappaPrivate;
    }

    public int getMappaPublic() {
        return mappaPublic;
    }
    public void setMappaPublic(int mappaPublic) {
        this.mappaPublic = mappaPublic;
    }
    public int getMappaDefault() {
        return mappaDefault;
    }
    public void setMappaDefault(int mappaDefault) {
        this.mappaDefault = mappaDefault;
    }
    public int getMappaProtected() {
        return mappaProtected;
    }
    public void setMappaProtected(int mappaProtected) {
        this.mappaProtected = mappaProtected;
    }
    public int getMappaPrivate() {
        return mappaPrivate;
    }
    public void setMappaPrivate(int mappaPrivate) {
        this.mappaPrivate = mappaPrivate;
    }
    
    
    public void printMappa() {
        System.out.println("printMappa metódus");
    }
}
