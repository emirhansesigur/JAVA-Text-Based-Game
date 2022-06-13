package GameViewF;

import CharacterF.Knight;
import GameDataF.GameData;
import Others.BattleEngine;

import java.util.ArrayList;

public class GameView {

    GameData gameData;


    public GameView(GameData gameData) {
        this.gameData = gameData;

    }


    public void showKnights(){
        for(int i=0;i<gameData.getKnights().size();i++){
            System.out.print((i+1)+" :");
            System.out.println(gameData.getKnights().get(i).toString());

        }
    }

    public void showActivatedKnights(){


        for(int i = 0; i<gameData.getActiveKnights().size(); i++){
            System.out.print(i+1+"] ");
            System.out.println("Knight Name: "+ gameData.getActiveKnights().get(i).getName());
            System.out.println("   Knight Type: "+ gameData.getActiveKnights().get(i).getKnightType());
            System.out.println("   Knight ID: "+ gameData.getActiveKnights().get(i).getId());
            System.out.println("   Knight Rest Hit Number: "+ gameData.getActiveKnights().get(i).getRestHitNumber());
            System.out.println("   **********************************");
        }


    }

    public void showActivatedFoes(){

        for(int i = 0; i<gameData.getActiveFoes().size(); i++){
            System.out.print(i+1+"] ");
            System.out.println("Foe Name: "+ gameData.getActiveFoes().get(i).getName());
            System.out.println("   **********************************");

        }
    }


    public void showMainMenu(){
        System.out.println("MAIN MENU\n"+
                "1. Show all Knights\n" +
                "2. Show Acvite Knights\n" +
                "3. Help:\n" +
                "4. Start the Game\n");

    }

    public void help() {
        System.out.println("How to play the game: ......\n" +
                "In order to learn how to play the game\n" +
                "please connect me on github.com/emirhansesigur");
    }



    public void chooseFromMenu(int a){
        switch (a){
            case 1:
                showKnights();
                break;
            case 2:
                showActivatedKnights();
                break;
            case 3:
                help();
                break;
            default:
        }

    }




}
