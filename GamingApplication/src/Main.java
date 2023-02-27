import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc=new Scanner(System.in);
        GameService gameService=new GameService();
        while(true) {
            System.out.println("*****************Welcome to Glo Gaming Application*******************");
            System.out.println("Enter the input for required operation: ");
            System.out.println("1. Insert the data in game_Table ");
            System.out.println("2. Update the data in game_Table");
            System.out.println("3. Delete the data in game_Table");
            System.out.println("4. findById the data in game_Table");
            System.out.println("5. Display the data in game_Table");
            System.out.println("6. Exit");
            int choice=sc.nextInt();
            if(choice==6)
                break;
            switch (choice) {
                case 1:
                    System.out.println("Enter the gameId");
                    String id = sc.next();
                    System.out.println("Enter the gameName");
                    String name = sc.next();
                    System.out.println("Enter the noOfPlayers");
                    int no = sc.nextInt();
                    gameService.insertData(Integer.parseInt(id), name, no);
                    break;
                case 2:
                    System.out.println("Enter the gameId");
                    id = sc.next();
                    System.out.println("Enter the gameName");
                    name = sc.next();
                    System.out.println("Enter the noOfPlayers");
                    no = sc.nextInt();
                    gameService.updateData(Integer.parseInt(id), name, no);
                    break;
                case 3:
                    System.out.println("Enter the gameId");
                    id = sc.next();
                    gameService.deleteData(Integer.parseInt(id));
                    break;
                case 4:
                    System.out.println("Enter the gameId");
                    id = sc.next();
                    gameService.findByGameId(Integer.parseInt(id));
                case 5:
                    gameService.displayData();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}