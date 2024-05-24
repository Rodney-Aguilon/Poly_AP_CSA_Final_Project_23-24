package com.poly.polyapcsafinalproject23_24;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameAguilonRodney extends GameActivity {
    //instance variables
    //   variables you plan to use throughout the adventure
    private int numLives;
    //private Player player; (optional)

    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3, btn4;
    private boolean isWon;
    private int NumLives;





    public void run()
    {
        setContentView(R.layout.activity_game_4_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);

        tvTitle.setText("Deadly Virus");
        tvSubtitle.setText("High School Edition");

        numLives = 4;
        start();
    }
    //initialize number of lives
    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
    }

        //create a player object (optional)
        //player = new Player(...)

        //display project title and description
        public void start()
        {
            isWon = false;

            ivStory.setImageResource(R.drawable.im_laborday_title);
            playAudio(R.raw.audio_laborday_bass);

         tvStoryText.setText("Welcome to my game and today we will do our best to sirvive in this game live or die by choosing a series of choices Sooooooo Where would you like to start?");
            setAllBtnsVisible();

            btn1.setText("Go to the store");
            btn2.setText("Go to go outside ");
            btn3.setText("stay home");
            btn4.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    goToStore();
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    goOutside();
                }
            });

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) { stayHome();}
            });


        }


    private void goToStore()
    {
        tvStoryText.setText("You hear the alarms the infected are coming!!!!!! What will you like to do at the store? ");

        setAllBtnsVisible();
        btn1.setText("Loot Up And dip");
        btn2.setText("camp up");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {lootAndDip();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                campUp();
            }
        });
    }


    private void lootAndDip()
    {
        tvStoryText.setText("You need to get home, what do you do?");
        System.out.println("1. Go home in a car\n2. Go home on foot running");

        btn1.setText("Go home in a car");
        btn2.setText("Go home on foot running");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

    private void goHomeDriving()
    {
        System.out.println("To many cars in the way and got infected you died YOU LOSE!!!!");
        defeat();
    }
    private void goHomeRunning()
    {
        System.out.println("You made it home and made it through the virus since you had food to last you months YOU WIN!!!!");
        defeat();
    }
    private void campUp()
    {
        System.out.println("You hear the alarms the infected are coming!!!!!!");
        System.out.println(" poeple are breaking in what do you do!!!???");
        System.out.println("1. Fight back to be the only one in\n2. Let people through since you nice");

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
        System.out.println(" You fight people back and you were able to last with the stores food supply YOU WIN!!!!");
        defeat();
    }

    private void letThemIn()
    {
        System.out.println(" One person was infected and you were infected and died YOU LOSE!!!");
        defeat();
    }
    private void goOutside()
    {
        System.out.println(" Plot twist You are infected what will you do");
        System.out.println(" Would you like to do outside?");
        System.out.println("1. Infect large group\n2. Infect small group?");


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
        System.out.println("So you took the large group to and now start plotting the next move");
        System.out.println("Take large group to where?");

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
        System.out.println("You took a large sum of people and built a large army of infected people and nobody could stop you YOU WINN!!!!!");
        defeat();
    }

    private void goToPark()
    {
        System.out.println("Multiple people had spotted your army and alerted the military and your army was shot down YOU LOSE!!!!!");
        defeat();
    }



    private void infectSmallGroup()
    {
        System.out.println("you need to grow stronger where are you going");
        System.out.println("1. Take small group infected people to city\n2. Take small group infected people to neighborhood");

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
        System.out.println("The city started to fight back and you ended up dying YOU LOSE!!!!");
        defeat();
    }

    private void goToNeighborhood()
    {
        System.out.println("You ended up sneaking up on unsuspecting people and grew bigger well done YOU WIN!!!!!");
        defeat();
    }



    private void stayHome()
    {
        System.out.println("You are scared and unable to think of what to do so you stay home");
        System.out.println("1. Set up defence to prevent looters\n2. Use what you have hide in basement");

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
        System.out.println("Take large group to mall");

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
        System.out.println("You had no power to do anything but was able to live but had lost everything you owned an won't be able to recover from this You lose!!!!");
        defeat();
    }
    private void putTraps()
    {
        System.out.println("You were able to keep yourself save You defeat!!!!");
        defeat();
    }
    private void hideInBasement()
    {
        System.out.println("1.Take food and clothes\n2.Take Water and meds");

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
        System.out.println("Since you had no water you died in three days soo YOU LOSE!!!");
        defeat();
    }
    private void waterAndMeds()
    {
        System.out.println("You live since you can only live on water for 3 day had enough water for rescuers to make it to YOU WIN!!!!!!");
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
            start();

        }
        else
        {
            //print game over message
            System.out.println("GAME OVER");
        }
    }
public class Adventure{
    //instance variables
    //   variables you plan to use throughout the adventure
    private int numLives;
    //private Player player; (optional)

    public void run()
    {
        //initialize number of lives
        numLives = 5;

        //create a player object (optional)
        //player = new Player(...)

        //display project title and description
        System.out.println("\nDeadly Virus Disaster Survival - Student Edition");

        System.out.println("Welcome to my game and today we will do our best to servive in this game live or die by choosing a serise of choices");
        System.out.println();
        start();
    }
    private void start()
    {
        //start adventure here

        //create an Adventure object

        System.out.println("\nWhere would you like to go?");
        System.out.println("1. Go to the store\n2. Go to go outside\n3. stay home");

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
        System.out.println("You hear the alarms the infected are coming!!!!!!");
        System.out.println("\nWhat will you like to do at the store?");
        System.out.println("1. Loot Up And dip\n2. camp up");

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
        System.out.println("\nYou need to get home, what do you do?");
        System.out.println("1. Go home in a car\n2. Go home on foot running");

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
        System.out.println("To many cars in the way and got infected you died YOU LOSE!!!!");
        defeat();
    }
    private void goHomeRunning()
    {
        System.out.println("You made it home and made it through the virus since you had food to last you months YOU WIN!!!!");
        defeat();
    }
    private void campUp()
    {
        System.out.println("You hear the alarms the infected are coming!!!!!!");
        System.out.println(" poeple are breaking in what do you do!!!???");
        System.out.println("1. Fight back to be the only one in\n2. Let people through since you nice");

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
        System.out.println(" You fight people back and you were able to last with the stores food supply YOU WIN!!!!");
        defeat();
    }

    private void letThemIn()
    {
        System.out.println(" One person was infected and you were infected and died YOU LOSE!!!");
        defeat();
    }
    private void goOutside()
    {
        System.out.println(" Plot twist You are infected what will you do");
        System.out.println(" Would you like to do outside?");
        System.out.println("1. Infect large group\n2. Infect small group?");


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
        System.out.println("So you took the large group to and now start plotting the next move");
        System.out.println("Take large group to where?");

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
        System.out.println("You took a large sum of people and built a large army of infected people and nobody could stop you YOU WINN!!!!!");
        defeat();
    }

    private void goToPark()
    {
        System.out.println("Multiple people had spotted your army and alerted the military and your army was shot down YOU LOSE!!!!!");
        defeat();
    }



    private void infectSmallGroup()
    {
        System.out.println("you need to grow stronger where are you going");
        System.out.println("1. Take small group infected people to city\n2. Take small group infected people to neighborhood");

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
        System.out.println("The city started to fight back and you ended up dying YOU LOSE!!!!");
        defeat();
    }

    private void goToNeighborhood()
    {
        System.out.println("You ended up sneaking up on unsuspecting people and grew bigger well done YOU WIN!!!!!");
        defeat();
    }



    private void stayHome()
    {
        System.out.println("You are scared and unable to think of what to do so you stay home");
        System.out.println("1. Set up defence to prevent looters\n2. Use what you have hide in basement");

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
        System.out.println("Take large group to mall");

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
        System.out.println("You had no power to do anything but was able to live but had lost everything you owned an won't be able to recover from this You lose!!!!");
        defeat();
    }
    private void putTraps()
    {
        System.out.println("You were able to keep yourself save You defeat!!!!");
        defeat();
    }
    private void hideInBasement()
    {
        System.out.println("1.Take food and clothes\n2.Take Water and meds");

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
        System.out.println("Since you had no water you died in three days soo YOU LOSE!!!");
        defeat();
    }
    private void waterAndMeds()
    {
        System.out.println("You live since you can only live on water for 3 day had enough water for rescuers to make it to YOU WIN!!!!!!");
        defeat();
    }



    private void end()
    {
        if (isWon)
        {
            tvStoryText.setText("You had enough water for rescuers to find and resue you....so YOU WIN!!!!!!\"");

            ivStory.setImageResource(R.drawable.im_laborday_miracle);
        }
        else
        {
            numLives--;
            String text = "You wasted a life with that dicision. You have " + numLives + " years remaining";
            tvStoryText.setText(text);
        }

        if (numLives > 0)
        {
            btn1.setText("Play again!");
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    start();
                }
            });
        }
        else
        {
            tvStoryText.setText("High school is over. Permenant Game over.");
            btn1.setText("Back to menu");

            ivStory.setImageResource(R.drawable.im_laborday_high_school_over);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(GameLaborDayAdventure.this, MainActivity.class));
                }
            });
        }
    }


}