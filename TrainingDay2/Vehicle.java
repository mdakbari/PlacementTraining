public class Vehicle {
    private String company, color, fuel;
    
    public void setcompany(String company){
        this.company = company;
    }

    public void setcolor(String color){
        this.color = color;
    }

    public void setfule(String fuel){
        this.fuel = fuel;
    }

    public String getcompany(){
        return company;
    }

    public String getcolor(){
        return color;
    }

    public String getfule(){
        return fuel;
    }

    @Override
    public String toString() {
        return "Vehicle [color=" + color + ", company=" + company + ", fuel=" + fuel + "]";
    }
       
}
