package Others;

import GameDataF.GameData;
import GameViewF.GameView;

import java.util.Scanner;

public class GameManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GameData gameData = new GameData();
        GameView gameView = new GameView(gameData);

        BattleEngine battleEngine = new BattleEngine(gameData, gameView);

        while(true){
            gameView.showMainMenu();
            System.out.print("Which one do you prefer: ");
            int number = input.nextInt();
            gameView.chooseFromMenu(number);

            if(number==4){
                break;
            }

        }

        System.out.println("The game is starting\n\n");
        battleEngine.theGame();

    }


}
