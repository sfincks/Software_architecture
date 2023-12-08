package Hw4;

public class TransportZone {
    private  int id;
    private  String description;

    /**
     гетеры для получения информации и сетер для описания на случай его изменения
     **/

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

}
