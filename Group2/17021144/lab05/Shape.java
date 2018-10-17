<<<<<<< HEAD

package lap52;


public class Shape{
        protected String color = "red";
        protected boolean filled = true;
        
        Shape(){}
        Shape(String color, boolean filled){
            this.color = color;
            this.filled = filled;
        }
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color = color;
        }       
        public boolean isFilled(){
            return filled;
        }
        public void setFilled(boolean filled){
            this.filled = filled;
        }       
        @Override
        public String toString(){
            return "\n -Color: "+getColor()+"\n -Filled: "+ isFilled();
                    
        }
=======

package lap52;


public class Shape{
        protected String color = "red";
        protected boolean filled = true;
        
        Shape(){}
        Shape(String color, boolean filled){
            this.color = color;
            this.filled = filled;
        }
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color = color;
        }       
        public boolean isFilled(){
            return filled;
        }
        public void setFilled(boolean filled){
            this.filled = filled;
        }       
        @Override
        public String toString(){
            return "\n -Color: "+getColor()+"\n -Filled: "+ isFilled();
                    
        }
>>>>>>> 8698251a186993be093e172d03823408519eb608
    }