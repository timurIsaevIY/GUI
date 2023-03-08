import java.util.Arrays;
public class Vector {
    private int[] location;

    public Vector(int[] location) {
        this.location = location;
    }

    public String scalarMultiplication(Vector vector) {
        if (this.location.length == vector.location.length) {
            int sum = 0;
            for (int i = 0; i < this.location.length; i++) {
                sum += this.location[i] * vector.location[i];
            }
            return Integer.toString(sum);
        } else {
            return "different dimensions of spaces";
        }
    }

    public String sum(Vector vector) {
        if (this.location.length == vector.location.length) {
            int[] res = new int[this.location.length];
            for (int i = 0; i < this.location.length; i++) {
                res[i] = this.location[i] + vector.location[i];
            }
            return Arrays.toString(res);
        } else {
            return "different dimensions of spaces";
        }
    }
    public String difference(Vector vector) {
        if (this.location.length == vector.location.length) {
            int[] res = new int[this.location.length];
            for (int i = 0; i < this.location.length; i++) {
                res[i] = this.location[i] - vector.location[i];
            }
            return Arrays.toString(res);
        } else {
            return "different dimensions of spaces";
        }
    }
    public String multiplication(Vector vector) {
        if (this.location.length == vector.location.length) {
            int[] res = new int[this.location.length];
            for (int i = 0; i < this.location.length; i++) {
                res[i] = this.location[i] * vector.location[i];
            }
            return Arrays.toString(res);
        } else {
            return "different dimensions of spaces";
        }
    }
    public double Length(){
        double l=0;
        for (int i: this.location){
            l+=i*i;
        }
        return Math.sqrt(l);
    }
    public Double corner(Vector vector){
        return Math.acos(Integer.parseInt(sum(vector))/(this.Length()*vector.Length()));
    }
    public double square(Vector vector){
        return this.Length()*vector.Length()*Math.sin(this.corner(vector));
    }
}
