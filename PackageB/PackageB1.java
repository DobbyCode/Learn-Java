package PackageB;

public class PackageB1 {

    public int packageB1Public;
    int packageB1Default;
    protected int packageB1Protected;
    private int packageB1Private;
    
    public PackageB1(int packageB1Public, int packageB1Default, int packageB1Protected, int packageB1Private) {
        this.packageB1Public = packageB1Public;
        this.packageB1Default = packageB1Default;
        this.packageB1Protected = packageB1Protected;
        this.packageB1Private = packageB1Private;
    }

    public int getPackageB1Public() {
        return packageB1Public;
    }
    public void setPackageB1Public(int packageB1Public) {
        this.packageB1Public = packageB1Public;
    }
    public int getPackageB1Default() {
        return packageB1Default;
    }
    public void setPackageB1Default(int packageB1Default) {
        this.packageB1Default = packageB1Default;
    }
    public int getPackageB1Protected() {
        return packageB1Protected;
    }
    public void setPackageB1Protected(int packageB1Protected) {
        this.packageB1Protected = packageB1Protected;
    }
    public int getPackageB1Private() {
        return packageB1Private;
    }
    public void setPackageB1Private(int packageB1Private) {
        this.packageB1Private = packageB1Private;
    }
    
    
    public static void printPackageB1() {
        System.out.println("printPackageB1 metódus");
    }
}
