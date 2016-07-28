public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        
        int area = (C - A) * (D - B) + (G - E) * (H - F);
        
        int x1_max = Math.max(A,E);
        int y1_max = Math.max(B,F);
        
        int x2_min = Math.min(C,G);
        int y2_min = Math.min(D,H);
        
        if(x1_max >= x2_min || y1_max >= y2_min) return area;
        
        return area - (x2_min - x1_max) * (y2_min - y1_max);
    }
}