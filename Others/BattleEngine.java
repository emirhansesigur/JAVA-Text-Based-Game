package Others;

import CharacterF.Foe;
import CharacterF.Knight;
import GameDataF.GameData;
import GameViewF.GameView;

import java.util.ArrayList;
import java.util.Scanner;

public class BattleEngine {


    private ArrayList<Knight> knights = new ArrayList<>();
    private ArrayList<Foe> foes = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    GameData gameData;
    GameView gameView;

    public BattleEngine(GameData gameData, GameView gameView) {
        this.gameData = gameData;
        this.gameView = gameView;
    }

    public void theGame(){

            knights = gameData.getActiveKnights();
            foes = gameData.getActiveFoes();

            int i=0;
            while (true){
                // Everything is going to be here. :)
                if(knights.size()>= foes.size()){

                    gameView.showActivatedKnights();
                    System.out.println("--**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
                    gameView.showActivatedFoes();


                    System.out.println("Which Knight do you want to choose : ");
                    int knightNumb = scanner.nextInt()-1;
                    scanner.nextLine();
                    System.out.println("Which foe would you like to attack : ");
                    int foeNumb = scanner.nextInt()-1;
                    scanner.nextLine();



                    if(knights.get(knightNumb).getId() == 1 &&( foes.get(foeNumb).getId() == 1 || foes.get(foeNumb).getId() == 2)){
                        if(!knights.get(knightNumb).getChance().Luck()){ // if Knight is unlucky, it cant kill.

                            // remove the knight
                            knights.remove(knightNumb);
                                System.out.println("This Strong Knight is unlucky");
                                System.out.println("Unlucky Knights connot kill any Foe");
                                System.out.println("The foe was not destroyed");

                        }
                        else{
                            // the foe is killed
                            foes.remove(foeNumb);
                            // remove the knight
                            knights.remove(knightNumb);
                                System.out.println("The foe was destroyed.");

                        }

                    }

                    else if(knights.get(knightNumb).getId() == 2 && foes.get(foeNumb).getId() == 2){
                        // the foe is killed

                        knights.remove(knightNumb);

                        foes.remove(foeNumb);
                            System.out.println("The foe was destroyed.");
                    }

                    else if(knights.get(knightNumb).getId() == 2 && foes.get(foeNumb).getId() == 1){
                        if(knights.get(knightNumb).getRestHitNumber()==3){
                            // the foe is killed
                            knights.remove(knightNumb);

                            foes.remove(foeNumb);
                                System.out.println("Weak Knight is lucky");
                                System.out.println("The Knight had 3 hit change And killed the Strong foe.");
                                System.out.println("The foe was destroyed.");
                        }
                        else{
                            knights.remove(knightNumb);
                            System.out.println("Weak Knight cannot kill a Strong Foe");
                            System.out.println("The foe was not destroyed.");
                        }
                    }

                }

                else{
                    //gameover
                    //lose the game
                    System.out.println("You lose the game :( ");
                    break;
                }


                if(foes.size()==0){
                    System.out.println("Congratulations !!! ");
                    System.out.println("All the Foes were killed.");
                    break;
                }



            }

        }

}
