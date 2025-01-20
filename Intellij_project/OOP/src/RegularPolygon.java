import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class RegularPolygon {
    public static class regularPolygon{
        private String name;
        private int edgeAmount;//amount of edge
        private double edgeLength;//length of edge
        public regularPolygon(){
            this.name="";
            this.edgeAmount=3;
            this.edgeLength=1;
        }
        public regularPolygon(String name, int edgeAmount,double edgeLength){
            this.name=name;
            this.edgeAmount=edgeAmount;
            this.edgeLength=edgeLength;
        }
        public regularPolygon(String name,int edgeAmount){
            this.name=name;
            this.edgeAmount=edgeAmount;
            this.edgeLength=1;
        }
        public regularPolygon(regularPolygon polygon){
            this.name=polygon.name;
            this.edgeAmount= polygon.edgeAmount;
            this.edgeLength= polygon.edgeLength;
        }

        public String getName() {
            return name;
        }

        public int getEdgeAmount() {
            return edgeAmount;
        }

        public double getEdgeLength() {
            return edgeLength;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEdgeAmount(int edgeAmount) {
            this.edgeAmount = edgeAmount;
        }

        public void setEdgeLength(double edgeLength) {
            this.edgeLength = edgeLength;
        }
        public String getPolygon(){
            if(edgeAmount==3)
                return "Triangle";
            else if(edgeAmount==4)
                return "Quadrangle";
            else if(edgeAmount==5)
                return "Pentagon";
            else if(edgeAmount==6)
                return "Hexagon";
            else if (edgeAmount>6)return "Polygon has the number of edge greater than 6";
            else return "undefined";
        }
        public double getPerimeter(){
            return edgeAmount*edgeLength;
        }
        //double check
        public double getArea(){
            if(edgeAmount==3)
                return Math.pow(edgeLength,2)*0.433;
            else if(edgeAmount==4)
                return Math.pow(edgeLength,2)*1;
            else if(edgeAmount==5)
                return Math.pow(edgeLength,2)*1.72;
            else if(edgeAmount==6)
                return Math.pow(edgeLength,2)*2.595;
            else return -1;
        }
        public String toString(){
            return name+" - "+getPolygon()+" - "+getArea();
        }
    }
    public static void main(String[]args){
        regularPolygon rp=new regularPolygon("q1",4);
        System.out.println(rp);
    }
}
