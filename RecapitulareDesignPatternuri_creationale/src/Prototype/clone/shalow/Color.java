package Prototype.clone.shalow;

 abstract class Color implements Cloneable{
     private String colorName;
     abstract void addColor();

     public String getColorName() {
         return colorName;
     }

     @Override
     public Object clone()  {
         Object clone=null;
         try {
             clone=super.clone();
         }
         catch (CloneNotSupportedException e){
             e.printStackTrace();
         }
         return clone;
     }
 }
