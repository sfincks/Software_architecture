package Hw4;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

public class Ticket {
    private BigDecimal price;
    private GregorianCalendar date;
    private int startZone;
    private int finishZone;
    private boolean isLuggage;
    private int place;
    private int roadNumber;

    /**
     всем гетеров за мой счёт!
     и сетеров заодно! очень уж изменчивыее данные могут быть указаны в билете, поэтому оставляем за собой возможность менять некоторые параметры
     */

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public void setFinishZone(int finishZone) {
        this.finishZone = finishZone;
    }

    public void setLuggage(boolean luggage) {
        isLuggage = luggage;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public void setRoadNumber(int roadNumber) {
        this.roadNumber = roadNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public int getStartZone() {
        return startZone;
    }

    public int getFinishZone() {
        return finishZone;
    }

    public boolean isLuggage() {
        return isLuggage;
    }

    public int getPlace() {
        return place;
    }

    public int getRoadNumber() {
        return roadNumber;
    }
}
