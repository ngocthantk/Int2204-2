
package lap52;


public class Circle extends Shape{
        protected double radius = 1.0;
        public final float PI = (float) 3.14;
        Circle(){}
        Circle(double radius){
            this.radius = radius;
        }
        Circle(double radius, String color, boolean filled){
            super(color,filled); 
             this.radius = radius ;
        }
        public double getRadius(){
            return radius;
        }
        public void setRadius(double radius){
            this.radius = radius;
        }
        public double getArea(){
            double area = PI*radius*radius;
            return area;
        }
        public double getPerimeter(){
            double perimeter = 2*PI*radius;
            return perimeter;
        }
        
 
        @Override
        public String toString(){ 
            
            return super.toString() + "\n -Radius: "+ getRadius()
                    +"\n -Area: " +getArea()+"\n -Perimeter: "+ getPerimeter();
        }      
        
}