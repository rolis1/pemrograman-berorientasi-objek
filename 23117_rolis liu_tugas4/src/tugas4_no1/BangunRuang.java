
package tugas4_no1;

/**
 *
 * @author rolis
 */
public class BangunRuang {
    double x, y, z;
    
    public BangunRuang(double x) {
        this.x = x;
    }
    
    public BangunRuang(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public double luasKubus() {
        return 6 * (x * x);
    }
    
    public double volumeKubus() {
        return x * x * x;
    }
    
    public double luasBalok() {
        return 2 * (x * y + x * z + y * z);
    }
    
    public double volumeBalok() {
        return x * y * z;
    }
}
