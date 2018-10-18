package lab6;

public class Square extends Rectangle {
	
        
        @Override
	public boolean check() {
         if(A.vuongGoc(B, C) && B.vuongGoc(C, A) && C.vuongGoc(B, D)){
             return A.length(B) == A.length(C);
         }
         return false;
	}
        
}