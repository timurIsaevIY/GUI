public class Point {
    private int x;
    private int y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public double DistanceTo(Point point){
        return Math.sqrt(Math.pow(this.x-point.x,2)+Math.pow(this.y-point.y,2));
    }
    @Override
    public String toString(){
    return "("+x+","+y+")";
    }
}
