package Hw4;

public class Person {
    private int id;
    private String FIO;
    private Long cardNumber;
    private Long hashPass;
    private String login;

    /**
     �������� ��� ������, �� ��������� ����� ������ ������ ������ ������������, ��������� �� �����
     **/

    public int getId() {
        return id;
    }

    public String getFIO() {
        return FIO;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public Long getHashPass() {
        return hashPass;
    }

    public String getLogin() {
        return login;
    }

    public void setHashPass(Long hashPass) {
        this.hashPass = hashPass;
    }
}
