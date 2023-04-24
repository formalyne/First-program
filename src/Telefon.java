public class Telefon {
    private String telefontype;
    private String telefonmodel ="11ProMax";
    private Integer memorytelefon = 16000;
    private Float screenresolution = 15.3F;
    private Integer battery = 5000;

    Telefon(String nameoftelefonebrand){
       this.telefontype = nameoftelefonebrand;
    }



    public void makeapicture() {
        System.out.println("Picture taken");

    }
    public void callsfor(String contact) {
        System.out.println("calling " +contact);
    }
    public void receivesmessage(String Abonement, String text) {
        System.out.println("Message received from " +Abonement);
        System.out.println(text);


    }
    public String getTelefontype() {
        return telefontype;
    }

    public void setTelefontype(String telefontype) {
        this.telefontype = telefontype;
    }

    public String getTelefonmodel() {
        return telefonmodel;
    }

    public void setTelefonmodel(String telefonmodel) {
        this.telefonmodel = telefonmodel;
    }

    public String getMemorytelefon() {
        return memorytelefon.toString();
    }

    public void setMemorytelefon(Integer memorytelefon) {
        this.memorytelefon = memorytelefon;
    }

    public Float getScreenresolution() {
        return screenresolution;
    }

    public void setScreenresolution(Float screenresolution) {
        this.screenresolution = screenresolution;
    }

    public Integer getBattery() {
        return battery;
    }

    public void setBattery(Integer battery) {
        this.battery = battery;
    }


}
