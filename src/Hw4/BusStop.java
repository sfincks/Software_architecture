package Hw4;

public class BusStop {
    private int id;
    private String name;
    private double attitude;
    private double latitude;

    /**
     ����� ����� ������� ������ ��� ���� ���������� � ������ name,attitude,latitude ������ ��� �������� � ����� ��������� ����� ����������
     **/

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAttitude() {
        return attitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttitude(double attitude) {
        this.attitude = attitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
