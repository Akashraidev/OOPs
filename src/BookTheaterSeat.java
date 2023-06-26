import java.lang.*;
public class BookTheaterSeat {
    int total_seat=10;
    void bookseat(int seat)
    {
        if (total_seat>=seat)
        {
            System.out.println("Seat booked");
            total_seat=total_seat-seat;
            System.out.println("seat left"+total_seat);
        }
        else
        {
            System.out.println("seat cannt be booked");
            System.out.println("sest left"+total_seat);
        }
    }
}
class MovieBookApp extends Thread
{
    static BookTheaterSeat b;
    int seat;
    public void run()
    {
      b.bookseat(seat);
    }

    public static void main(String[] args) {
        b =new BookTheaterSeat();
        MovieBookApp deepak = new MovieBookApp();
        deepak.seat=7;
        deepak.start();

        MovieBookApp amit = new MovieBookApp();
        amit.seat=6;
        amit.start();

    }
}


