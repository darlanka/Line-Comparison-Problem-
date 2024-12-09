public class distance {
    public double dis(int px1,int py1,int px2,int py2){
        double ans = Math.sqrt((px2-px1) *(px2-px1) + (py2-py1)*(py2-py1));
        return ans;
    }
}
