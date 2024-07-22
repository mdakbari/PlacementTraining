import java.util.Scanner;

public class Supply{
    private int Code;
    private String FoodName;
    private String Sticker;
    private String FoodType;

    private void GetType() {
        switch (Sticker.toLowerCase()) {
            case "green":
                FoodType = "Vegetarian";
                break;
            case "yellow":
                FoodType = "Contains Egg";
                break;
            case "red":
                FoodType = "Non Vegetarian";
                break;
            default:
                FoodType = "Unknown";
        }
    }

    public void FoodIn() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Code: ");
        Code = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter FoodName: ");
        FoodName = sc.nextLine();

        System.out.print("Enter Sticker (Green/Yellow/Red): ");
        Sticker = sc.nextLine();

        GetType();
        
    }

    public void FoodOut() {
        System.out.println("Code: " + Code);
        System.out.println("FoodName: " + FoodName);
        System.out.println("Sticker: " + Sticker);
        System.out.println("FoodType: " + FoodType);
    }

    public static void main(String[] args) {
        Supply supply = new Supply();

        supply.FoodIn();
        supply.FoodOut();
       
    }

}
