public class demovechicle {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        obj.setcompany("Toyota");
        obj.setcolor("Red");
        obj.setfule("Petrol");
        System.out.println("Company: " + obj.getcompany());
        System.out.println("Color: " + obj.getcolor());
        System.out.println("Fuel: " + obj.getfule());
        System.out.println(obj);
    }
}
