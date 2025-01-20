public class OOP{
    public static class house{
        private String HouseCode;
        private int numOfBedRooms;
        private boolean hasSwimmingPool;
        private double area;
        private double costPerSquareMeter;
        public house(){
            this.HouseCode="A01";
            this.numOfBedRooms=2;
            this.hasSwimmingPool=false;
            this.area=0;
            this.costPerSquareMeter=0;
        }
        public house(String Housecode,int numOfBedRoom,boolean hasSwimmingPool, double area, double costPerSquareMeter){
            this.HouseCode=Housecode;
            this.numOfBedRooms=numOfBedRoom;
            this.hasSwimmingPool=hasSwimmingPool;
            this.area=area;
            this.costPerSquareMeter=costPerSquareMeter;
        }

        public void setHouseCode(String houseCode) {
            HouseCode = houseCode;
        }
        public void setNumOfBedRooms(int numOfBedRooms) {
            this.numOfBedRooms = numOfBedRooms;
        }
        public void setHasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
        }
        public void setArea(double area) {
            this.area = area;
        }
        public void setCostPerSquareMeter(double costPerSquareMeter) {
            this.costPerSquareMeter = costPerSquareMeter;
        }
        String getHouseCode(){
            return HouseCode;
        }
        int getNumOfBedRoom(){
            return numOfBedRooms;
        }
        public boolean isHasSwimmingPool() {
            return hasSwimmingPool;
        }
        public double getArea() {
            return area;
        }
        public double getCostPerSquareMeter() {
            return costPerSquareMeter;
        }
        public double calculateSellingPrice(){
            double subTotal=area*costPerSquareMeter;
            if(hasSwimmingPool){
                subTotal+=(subTotal*0.1);
            }
            double SellingPrice=subTotal+(subTotal*0.15);
            return SellingPrice;
        }
        public String toString(){
            String format="House["+HouseCode+", "+numOfBedRooms+", "+hasSwimmingPool+", "+calculateSellingPrice()+"]";
            return format;
        }
    }
    public static void main(String[] args){
        house h1=new house("A02",4,true,100,2500000);
        String house1=h1.toString();
        System.out.println(house1);
    }
}