package com.poly.polyapcsafinalproject23_24;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameAguilonRodney extends GameActivity {
    //instance variables
    //   variables you plan to use throughout the adventure

    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3, btn4;
    private boolean isWon;
    private int numLives;





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

         tvStoryText.setText("Welcome to my game and today we will do our best to survive in this game live or die by choosing a series of choices Sooooooo Where would you like to start?");
            setAllBtnsVisible();

            btn1.setText("Go to the store");
            btn2.setText("Go outside ");
            btn3.setText("stay home");
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    goToStore();
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) { goOutSide(); }
            });

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) { stayHome(); }
            });





    private void goToStore()
    {
        tvStoryText.setText("You hear the alarms the infected are coming!!!!!! What will you like to do at the store? ");

        setAllBtnsVisible();
        btn1.setText("Loot Up And dip");
        btn2.setText("camp up");
        btn3.setVisibility(View.INVISIBLE);

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

        btn1.setText("Go home in a car");
        btn2.setText("Go home on foot running");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

    private void goHomeDriving()
    {
        tvStoryText.setText("To many cars in the way and got infected you died YOU LOSE!!!!");
        end();
    }
    private void goHomeRunning()
    {
        tvStoryText.setText("You made it home and made it through the virus since you had food to last you months YOU WIN!!!!");
        end();
    }
    private void campUp()
    {
        tvStoryText.setText("You hear the alarms the infected are coming!!!!!! poeple are breaking in what do you do!!!???");
        btn1.setText("Fight back to be the only one in")
        btn2.setText("Let people through since you nice");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fightBack();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { letThemIn();
            }
        });
    }
    private void fightBack()
    {
        tvStoryText.setText(" You fight people back and you were able to last with the stores food supply YOU WIN!!!!");
        end();
    }

    private void letThemIn()
    {
        tvStoryText.setText(" One person was infected and you were infected and died YOU LOSE!!!");
        defeat();
    }

    private void goOutSide()
    {
        tvStoryText.setText (" Plot twist You are infected what will you do, Would you like to do outside?");

        btn1.setText("Infect large group");
        btn2.setText("Infect small group?");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infectLargeGroup();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { infectSmallGroup(); }
        });
    }




        private void infectLargeGroup()
    {
        System.out.println("So you took the large group to and now start plotting the next move");
        System.out.println("Take large group to where?");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMall();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goToPark(); }
        });
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
        haveWon();
    }





    private void end()
    {
        if (isWon)
        {
            tvStoryText.setText("You had enough water for rescuers to find and resue you....so YOU WIN!!!!!!\"");

            ivStory.setImageResource(R.drawable.im_laborday_miracle);---------------------
                 -------------------------------------
        }
        else
        {
            numLives--;
            String text = "You wasted a life with that decision. You have " + numLives + " years remaining";
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
            tvStoryText.setText("everything has died. Permenant Game over.");
            btn1.setText("Back to menu");

            ivStory.setImageResource(R.drawable.im_laborday_high_school_over);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(GameAguilonRodney.this, MainActivity.class));
                }
            });
        }
    }


}