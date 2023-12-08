package Hw4;

import java.util.List;

public class BusRoute {
    private int id;
    private String description;
    private int capacity;
    private List<BusStop> busStops;

    /**
     ��� ���� ���������� ������ ������ ����� ���� ����������� �������� ���������� � ���
     �� �������, ��� �� ����������� � ����� ��� �����, �� ��������, ��� ����� ���������� ��� �� ��� � ��������, ��� ��� ������� ������
     **/

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<BusStop> getBusStops() {
        return busStops;
    }
}
