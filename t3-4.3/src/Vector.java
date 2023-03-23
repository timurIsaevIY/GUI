import java.util.Arrays;
public class Vector {
    private int[] location;

    public Vector(int[] location) {
        this.location = location;
    }

    public int scalarMultiplication(Vector vector) {
        if (this.location.length == vector.location.length) {
            int sum = 0;
            for (int i = 0; i < this.location.length; i++) {
                sum += this.location[i] * vector.location[i];
            }
            return sum;
        } else {
            throw new IllegalArgumentException("different dimensions of spaces");
        }
    }

    public int[] sum(Vector vector) {
        if (this.location.length == vector.location.length) {
            int[] res = new int[this.location.length];
            for (int i = 0; i < this.location.length; i++) {
                res[i] = this.location[i] + vector.location[i];
            }
            return res;
        } else {
            throw new IllegalArgumentException("different dimensions of spaces");
        }
    }
    public int[] difference(Vector vector) {
        if (this.location.length == vector.location.length) {
            int[] res = new int[this.location.length];
            for (int i = 0; i < this.location.length; i++) {
                res[i] = this.location[i] - vector.location[i];
            }
            return res;
        } else {
            throw new IllegalArgumentException("different dimensions of spaces");
        }
    }
    public int[] multiplication(Vector vector) {
        if (this.location.length == vector.location.length) {
            int[] res = new int[this.location.length];
            for (int i = 0; i < this.location.length; i++) {
                res[i] = this.location[i] * vector.location[i];
            }
            return res;
        } else {
            throw new IllegalArgumentException("different dimensions of spaces");
        }
    }
    public double Length(){
        double l=0;
        for (int i: this.location){
            l+=i*i;
        }
        return Math.sqrt(l);
    }
    public double corner(Vector vector){
        if (this.location.length == vector.location.length) {
            return Math.acos(this.scalarMultiplication(vector) / (this.Length() * vector.Length()));
        }
        else{
            throw new IllegalArgumentException("different dimensions of spaces");
        }
    }
    public double square(Vector vector){
        if (this.location.length == vector.location.length) {
        return this.Length()*vector.Length()*Math.sin(this.corner(vector));
        }
        else{
            throw new IllegalArgumentException("different dimensions of spaces");
        }
    }
}
