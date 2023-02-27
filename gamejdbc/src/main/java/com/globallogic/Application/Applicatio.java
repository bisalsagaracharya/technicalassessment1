package com.globallogic.Application;

import com.globallogic.Entity.Game;
import com.globallogic.service.GameService;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Applicatio {
    public static void main(String[] args) throws SQLException {
        GameService service = new GameService();
        Scanner sc = new Scanner(System.in);
        boolean isExists = true;


        while (isExists) {
            System.out.println("------Game------- ");
            System.out.println(" 1. Add game \n" +
                    " 2. Find game by id \n" +
                    " 3. Update game  \n" +
                    " 4. Find allgame \n");

            System.out.print(" Enter your choise what you want : ");
            int input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case 1:
                    Game game = new Game();

                    System.out.println("Enter game id : ");
                    game.setGameId(input);

                    System.out.println("Enter game name : ");
                    game.setGame_name(sc.nextLine());

                    System.out.println("Enter player no : ");
                    game.setNo_of_players(sc.nextInt());


                    try {
                       // service.addStudent(student);
                        service.addGame(game);
                        System.out.println("add successfully:");
                    } catch (Exception ex) {
                        System.out.println("Error : "+ ex.getMessage());
                    }
                    sc.nextLine();
                    break;
                case 2:
                    System.out.print(" Enter gameId : ");
                    try {

                        Game game2=service.findGame(sc.nextInt());

                        System.out.println(game2);

                    } catch (Exception ex){
                        System.out.println("Error : "+ ex.getMessage());
                    }
                    sc.nextLine();
                    break;
                case 3:
                    System.out.print("Enter game id : ");
                    String studentId = sc.nextLine();
                    System.out.print("Enter updated name: ");
                    String name = sc.nextLine();

                    try {
                       // service.updateStudent();
                        service.updateGame();
                        System.out.println( "Successfully updated !!!");
                    } catch (Exception ex) {
                        System.out.println("Error : "+ ex.getMessage());
                    }
                    sc.nextLine();
                    break;
                case 4:
                    System.out.println("all game details:");
                    Game game1 = new Game();
                  //  List<Game> studet2 = service.findAllStudent(student2);
                    List<Game>games2=service.findAllGame(game1);
                    System.out.println(games2);
                    break;
                default:
                    break;
            }


            System.out.println(" Do you want to continue or exist ? Y or N !!!");
            String option = sc.nextLine();
            if (option.equalsIgnoreCase("Y")) {
                isExists = false;
            }
        }


        System.out.println( "welcome" );

    }
}
