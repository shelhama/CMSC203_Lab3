import java.util.Scanner;

public class MovieDriver {


	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		while (true) {
				Movie movie = new Movie ();
		System.out.println ("Enter the title of the movie:  ");
		movie.setTitle(scanner.nextLine());	
		
		System.out.println ("Enter the rating of the movie:");
		movie.setRating(scanner.nextLine());
		
		System.out.println("Enter the number of tickets sold: ");
		 movie.setSoldTickets(scanner.nextInt());
		
		scanner.nextLine();
		System.out.println(movie);
		System.out.println("Do you want to enter another movie? (y/n) :");
		
		if (!scanner.nextLine().equalsIgnoreCase("y")) {
          System.out.println(" ");
          break;
		}
		}
		
    System.out.println("Goodbye");
	}

}
