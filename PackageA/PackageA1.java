package PackageA;

public class PackageA1 {

    public int packageA1Public;
    int packageA1Default;
    protected int packageA1Protected;
    private int packageA1Private;

    public PackageA1(int packageA1Public, int packageA1Default, int packageA1Protected, int packageA1Private) {
        this.packageA1Public = packageA1Public;
        this.packageA1Default = packageA1Default;
        this.packageA1Protected = packageA1Protected;
        this.packageA1Private = packageA1Private;
    }

    public int getPackageA1Public() {
        return packageA1Public;
    }
    public void setPackageA1Public(int packageA1Public) {
        this.packageA1Public = packageA1Public;
    }
    public int getPackageA1Default() {
        return packageA1Default;
    }
    public void setPackageA1Default(int packageA1Default) {
        this.packageA1Default = packageA1Default;
    }
    public int getPackageA1Protected() {
        return packageA1Protected;
    }
    public void setPackageA1Protected(int packageA1Protected) {
        this.packageA1Protected = packageA1Protected;
    }
    public int getPackageA1Private() {
        return packageA1Private;
    }
    public void setPackageA1Private(int packageA1Private) {
        this.packageA1Private = packageA1Private;
    }


    public void printPackageA1() {
        System.out.println("printPackageA1 metódus");
    }    
}
