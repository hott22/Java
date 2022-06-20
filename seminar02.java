public class seminar02 {
    public static void main(String[] args) {
//        int start_peg = 1, destination_peg = 2, buffer_peg = 3, plate_quantity = 3;
        hanoiTowers(3 , 1, 2, 3);


    }
    public static void hanoiTowers(int quantity, int from, int to, int buf_peg)	{
        if (quantity != 0)

        {

            hanoiTowers(quantity-1, from, buf_peg, to);

            System.out.println("" + from + " -> " + to );

            hanoiTowers(quantity-1, buf_peg, to, from);

        }

    }
}