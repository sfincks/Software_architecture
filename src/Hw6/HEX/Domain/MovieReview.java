package Hw6.HEX.Domain;

public class MovieReview {
    String movieName;
    double movieScore;
    String remark;

    public MovieReview(String s, double v, String excellent) {
        this.movieName = s;
        this.movieScore = v;
        this.remark = excellent;
    }
    // закрепляется система отзывов
    @Override
    public String toString() {
        return  " " +movieScore +" "+ remark;
    }
    // и переписывается печать отзыва
}
