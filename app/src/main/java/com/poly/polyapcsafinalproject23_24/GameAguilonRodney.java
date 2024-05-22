package com.poly.polyapcsafinalproject23_24;

import java.util.Scanner;
public class GameAguilonRodney extends GameActivity {
    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    //private Player player; (optional)

    public void run()
    {
        //initialize number of lives
        numLives = 5;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        //create a player object (optional)
        //player = new Player(...)

        //display project title and description
        Util.clearConsole();
        System.out.println("\nDeadly Virus Disaster Survival - Student Edition");

        System.out.println("Welcome to my game and today we will do our best to servive in this game live or die by choosing a serise of choices");
        Util.pauseConsole();
        System.out.println();
        Util.clearConsole();
        start();
    }
    private void start()
    {
        //start adventure here

        //create an Adventure object

        Util.pauseConsole();
        System.out.println("\nWhere would you like to go?");
        System.out.println("1. Go to the store\n2. Go to go outside\n3. stay home");
        int choice = Util.enterInt(1,3);

        if (choice == 1)
        {
            goToStore();
        }
        else if (choice == 2)
        {
            goOutside();
        }
        else if (choice == 3)
        {
            stayHome();
        }

    }


    private void goToStore()
    {
        Util.clearConsole();
        System.out.println("You hear the alarms the infected are coming!!!!!!");
        System.out.println("\nWhat will you like to do at the store?");
        System.out.println("1. Loot Up And dip\n2. camp up");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            lootAndDip();
        }
        else if (choice == 2)
        {
            campUp();
        }
    }



    private void lootAndDip()
    {
        Util.clearConsole();
        System.out.println("\nYou need to get home, what do you do?");
        System.out.println("1. Go home in a car\n2. Go home on foot running");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            goHomeDriving();
        }
        else if (choice == 2)
        {
            goHomeRunning();
        }
    }

    private void goHomeDriving()
    {
        Util.clearConsole();
        System.out.println("To many cars in the way and got infected you died YOU LOSE!!!!");
        Util.pauseConsole();
        defeat();
    }
    private void goHomeRunning()
    {
        Util.clearConsole();
        System.out.println("You made it home and made it through the virus since you had food to last you months YOU WIN!!!!");
        Util.pauseConsole();
        defeat();
    }
    private void campUp()
    {
        Util.clearConsole();
        System.out.println("You hear the alarms the infected are coming!!!!!!");
        System.out.println(" poeple are breaking in what do you do!!!???");
        System.out.println("1. Fight back to be the only one in\n2. Let people through since you nice");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            fightBack();
        }
        else if (choice == 2)
        {
            letThemIn();
        }
    }
    private void fightBack()
    {
        Util.clearConsole();
        System.out.println(" You fight people back and you were able to last with the stores food supply YOU WIN!!!!");
        Util.pauseConsole();
        defeat();
    }

    private void letThemIn()
    {
        Util.clearConsole();
        System.out.println(" One person was infected and you were infected and died YOU LOSE!!!");
        Util.pauseConsole();
        defeat();
    }
    private void goOutside()
    {
        Util.clearConsole();
        System.out.println(" Plot twist You are infected what will you do");
        System.out.println(" Would you like to do outside?");
        System.out.println("1. Infect large group\n2. Infect small group?");

        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            infectLargeGroup();
        }
        else if (choice == 2)
        {
            infectSmallGroup();
        }
    }



    private void infectLargeGroup()
    {
        Util.clearConsole();
        System.out.println("So you took the large group to and now start plotting the next move");
        System.out.println("Take large group to where?");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            goToMall();
        }
        else if (choice == 2)
        {
            goToPark();
        }
    }
    private void goToMall()
    {
        Util.clearConsole();
        System.out.println("You took a large sum of people and built a large army of infected people and nobody could stop you YOU WINN!!!!!");
        Util.pauseConsole();
        defeat();
    }

    private void goToPark()
    {
        Util.clearConsole();
        System.out.println("Multiple people had spotted your army and alerted the military and your army was shot down YOU LOSE!!!!!");
        Util.pauseConsole();
        defeat();
    }



    private void infectSmallGroup()
    {
        Util.clearConsole();
        System.out.println("you need to grow stronger where are you going");
        System.out.println("1. Take small group infected people to city\n2. Take small group infected people to neighborhood");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            goToCity();
        }
        else if (choice == 2)
        {
            goToNeighborhood();
        }
    }
    private void goToCity()
    {
        Util.clearConsole();
        System.out.println("The city started to fight back and you ended up dying YOU LOSE!!!!");
        Util.pauseConsole();
        defeat();
    }

    private void goToNeighborhood()
    {
        Util.clearConsole();
        System.out.println("You ended up sneaking up on unsuspecting people and grew bigger well done YOU WIN!!!!!");
        Util.pauseConsole();
        defeat();
    }



    private void stayHome()
    {
        Util.clearConsole();
        System.out.println("You are scared and unable to think of what to do so you stay home");
        System.out.println("1. Set up defence to prevent looters\n2. Use what you have hide in basement");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            setUpLooter();
        }
        else if (choice == 2)
        {
            hideInBasement();
        }
    }
    private void setUpLooter()
    {
        Util.clearConsole();
        System.out.println("Take large group to mall");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            videoCams();
        }
        else if (choice == 2)
        {
            putTraps();
        }
    }
    private void videoCams()
    {
        Util.clearConsole();
        System.out.println("You had no power to do anything but was able to live but had lost everything you owned an won't be able to recover from this You lose!!!!");
        Util.pauseConsole();
        defeat();
    }
    private void putTraps()
    {
        Util.clearConsole();
        System.out.println("You were able to keep yourself save You defeat!!!!");
        Util.pauseConsole();
        defeat();
    }
    private void hideInBasement()
    {
        Util.clearConsole();
        System.out.println("1.Take food and clothes\n2.Take Water and meds");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            foodAndClothes();
        }
        else if (choice == 2)
        {
            waterAndMeds();
        }
    }

    private void foodAndClothes()
    {
        Util.clearConsole();
        System.out.println("Since you had no water you died in three days soo YOU LOSE!!!");
        Util.pauseConsole();
        defeat();
    }
    private void waterAndMeds()
    {
        Util.clearConsole();
        System.out.println("You live since you can only live on water for 3 day had enough water for rescuers to make it to YOU WIN!!!!!!");
        Util.pauseConsole();
        defeat();
    }



    private void defeat()
    {
        //run method when defeated



        //lose a life
        numLives--;


        //clear console, display text, etc
        System.out.println("Are you gonna give up that easy well too bad cause you getting up cause i said so come on!!!!!");

        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            Util.clearConsole();
            start();

        }
        else
        {
            //print game over message
            System.out.println("GAME OVER");
        }
    }
}import java.util.Scanner;
public class Adventure{
    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    //private Player player; (optional)

    public void run()
    {
        //initialize number of lives
        numLives = 5;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        //create a player object (optional)
        //player = new Player(...)

        //display project title and description
        Util.clearConsole();
        System.out.println("\nDeadly Virus Disaster Survival - Student Edition");

        System.out.println("Welcome to my game and today we will do our best to servive in this game live or die by choosing a serise of choices");
        Util.pauseConsole();
        System.out.println();
        Util.clearConsole();
        start();
    }
    private void start()
    {
        //start adventure here

        //create an Adventure object

        Util.pauseConsole();
        System.out.println("\nWhere would you like to go?");
        System.out.println("1. Go to the store\n2. Go to go outside\n3. stay home");
        int choice = Util.enterInt(1,3);

        if (choice == 1)
        {
            goToStore();
        }
        else if (choice == 2)
        {
            goOutside();
        }
        else if (choice == 3)
        {
            stayHome();
        }

    }


    private void goToStore()
    {
        Util.clearConsole();
        System.out.println("You hear the alarms the infected are coming!!!!!!");
        System.out.println("\nWhat will you like to do at the store?");
        System.out.println("1. Loot Up And dip\n2. camp up");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            lootAndDip();
        }
        else if (choice == 2)
        {
            campUp();
        }
    }



    private void lootAndDip()
    {
        Util.clearConsole();
        System.out.println("\nYou need to get home, what do you do?");
        System.out.println("1. Go home in a car\n2. Go home on foot running");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            goHomeDriving();
        }
        else if (choice == 2)
        {
            goHomeRunning();
        }
    }

    private void goHomeDriving()
    {
        Util.clearConsole();
        System.out.println("To many cars in the way and got infected you died YOU LOSE!!!!");
        Util.pauseConsole();
        defeat();
    }
    private void goHomeRunning()
    {
        Util.clearConsole();
        System.out.println("You made it home and made it through the virus since you had food to last you months YOU WIN!!!!");
        Util.pauseConsole();
        defeat();
    }
    private void campUp()
    {
        Util.clearConsole();
        System.out.println("You hear the alarms the infected are coming!!!!!!");
        System.out.println(" poeple are breaking in what do you do!!!???");
        System.out.println("1. Fight back to be the only one in\n2. Let people through since you nice");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            fightBack();
        }
        else if (choice == 2)
        {
            letThemIn();
        }
    }
    private void fightBack()
    {
        Util.clearConsole();
        System.out.println(" You fight people back and you were able to last with the stores food supply YOU WIN!!!!");
        Util.pauseConsole();
        defeat();
    }

    private void letThemIn()
    {
        Util.clearConsole();
        System.out.println(" One person was infected and you were infected and died YOU LOSE!!!");
        Util.pauseConsole();
        defeat();
    }
    private void goOutside()
    {
        Util.clearConsole();
        System.out.println(" Plot twist You are infected what will you do");
        System.out.println(" Would you like to do outside?");
        System.out.println("1. Infect large group\n2. Infect small group?");

        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            infectLargeGroup();
        }
        else if (choice == 2)
        {
            infectSmallGroup();
        }
    }



    private void infectLargeGroup()
    {
        Util.clearConsole();
        System.out.println("So you took the large group to and now start plotting the next move");
        System.out.println("Take large group to where?");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            goToMall();
        }
        else if (choice == 2)
        {
            goToPark();
        }
    }
    private void goToMall()
    {
        Util.clearConsole();
        System.out.println("You took a large sum of people and built a large army of infected people and nobody could stop you YOU WINN!!!!!");
        Util.pauseConsole();
        defeat();
    }

    private void goToPark()
    {
        Util.clearConsole();
        System.out.println("Multiple people had spotted your army and alerted the military and your army was shot down YOU LOSE!!!!!");
        Util.pauseConsole();
        defeat();
    }



    private void infectSmallGroup()
    {
        Util.clearConsole();
        System.out.println("you need to grow stronger where are you going");
        System.out.println("1. Take small group infected people to city\n2. Take small group infected people to neighborhood");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            goToCity();
        }
        else if (choice == 2)
        {
            goToNeighborhood();
        }
    }
    private void goToCity()
    {
        Util.clearConsole();
        System.out.println("The city started to fight back and you ended up dying YOU LOSE!!!!");
        Util.pauseConsole();
        defeat();
    }

    private void goToNeighborhood()
    {
        Util.clearConsole();
        System.out.println("You ended up sneaking up on unsuspecting people and grew bigger well done YOU WIN!!!!!");
        Util.pauseConsole();
        defeat();
    }



    private void stayHome()
    {
        Util.clearConsole();
        System.out.println("You are scared and unable to think of what to do so you stay home");
        System.out.println("1. Set up defence to prevent looters\n2. Use what you have hide in basement");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            setUpLooter();
        }
        else if (choice == 2)
        {
            hideInBasement();
        }
    }
    private void setUpLooter()
    {
        Util.clearConsole();
        System.out.println("Take large group to mall");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            videoCams();
        }
        else if (choice == 2)
        {
            putTraps();
        }
    }
    private void videoCams()
    {
        Util.clearConsole();
        System.out.println("You had no power to do anything but was able to live but had lost everything you owned an won't be able to recover from this You lose!!!!");
        Util.pauseConsole();
        defeat();
    }
    private void putTraps()
    {
        Util.clearConsole();
        System.out.println("You were able to keep yourself save You defeat!!!!");
        Util.pauseConsole();
        defeat();
    }
    private void hideInBasement()
    {
        Util.clearConsole();
        System.out.println("1.Take food and clothes\n2.Take Water and meds");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            foodAndClothes();
        }
        else if (choice == 2)
        {
            waterAndMeds();
        }
    }

    private void foodAndClothes()
    {
        Util.clearConsole();
        System.out.println("Since you had no water you died in three days soo YOU LOSE!!!");
        Util.pauseConsole();
        defeat();
    }
    private void waterAndMeds()
    {
        Util.clearConsole();
        System.out.println("You live since you can only live on water for 3 day had enough water for rescuers to make it to YOU WIN!!!!!!");
        Util.pauseConsole();
        defeat();
    }



    private void defeat()
    {
        //run method when defeated



        //lose a life
        numLives--;


        //clear console, display text, etc
        System.out.println("Are you gonna give up that easy well too bad cause you getting up cause i said so come on!!!!!");

        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            Util.clearConsole();
            start();

        }
        else
        {
            //print game over message
            System.out.println("GAME OVER");
        }
    }
}