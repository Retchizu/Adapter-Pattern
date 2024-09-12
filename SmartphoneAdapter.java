public class SmartphoneAdapter implements PowerOutlet {

    SmartphoneCharger smartphoneCharger;

    public SmartphoneAdapter(SmartphoneCharger smartphoneCharger) {
        this.smartphoneCharger = smartphoneCharger;
    }

    @Override
    public String plugin() {
      return smartphoneCharger.chargePhone();
    }
    
}
