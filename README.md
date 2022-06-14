***JAVA-Text-Based-Game***

**This project's aim was practicing the subjects I have learnt in OOP.**

## Characters:
There are 10 inactive knights. In the beginning of the game, 5 Knights will be activated randomly. 1 or 2 of them are going to be Strong Knight.
You have 10 inactive enemies as well. 3, 4 or 5 of them (randomly depends on your luck) are activated, 1 or 2 Foes become strong Foe.

## Fight rules:
|               | Strong Foe | Weak Foe |
| ------------- | ---------- | -------- |   
| Strong Knight | Can Beat   |   Can Beat      |
| Weak Knight   | Can't Beat   |  Can beat   |

In the table you can see who can beat the other. However, the game is not that much basic. Knights have good luck and bad luck.

## Luck:
Strong Foe: Normally, Strong Knight can beat both Foes however, if bad luck hits the Strong Knight, he can beat none (%33 chance)

Weak Foe: The situation is different for Weak Knight. In the game, each Knight have hit number. 
And weak Knight’s hit number is determined when you start the game randomly. If weak Knight hits Strong Foe 3 time (If this weak knight’s hit number is assigned 3), the Foe will be beaten(%33 change).

## How to attack a Foe:
Each round, you choose a Knight and Foe. If your Knight can beat the Foe that you have chosen, the foe and the knight are removed from their list however, if your knight cannot beat the foe, just your Knight is removed from the activated Knights list.

## How does the game end?
If you can beat all the Foes, you win the game. While playing the game, if your activated knights number became less than activated foes number, you suddenly lose the game.



## Here is the UML Diagram I used
![NYP_Proje_UML_2022 (1)](https://user-images.githubusercontent.com/78687359/173394032-8d54fd06-6e9d-43f3-a2dd-3b91558a7b43.png)

I made this game for my Object-Oriented Programming lesson that I took in 1. class.

Run it from *GameManager.java*
