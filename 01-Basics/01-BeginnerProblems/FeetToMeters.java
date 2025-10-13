class ExecutionClass {
    float heightInFeet = 6.0f;
    float meterConversion = 0.3048f;
    double heightInMeters = (double) heightInFeet * meterConversion;

    void display() {
        System.out.printf("The height of a %.1f foot person in meters is %.4f\n",heightInFeet,heightInMeters);
    }
}

public class FeetToMeters{
    public static void main(String[] args){
        ExecutionClass obj = new ExecutionClass();
        obj.display();
    }
}
