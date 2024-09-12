public class App {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refOutlet = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet smartPhonPowerOutlet = new SmartphoneAdapter(smartphoneCharger);


        System.out.println(laptopOutlet.plugin());
        System.out.println(refOutlet.plugin());
        System.out.println(smartPhonPowerOutlet.plugin());
    }
}
