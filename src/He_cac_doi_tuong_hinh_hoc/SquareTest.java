package He_cac_doi_tuong_hinh_hoc;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2);
        System.out.println(square);

        square = new Square(3,"red",true);
        System.out.println(square);
    }
}
