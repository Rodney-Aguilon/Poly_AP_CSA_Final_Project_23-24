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
        tvSubtitle.setText("choose your OWN FATE!!!!");

        numLives = 4;
        start();
    }
    //initialize number of lives
    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.INVISIBLE);
    }

        //create a player object (optional)
        //player = new Player(...)

        //display project title and description
        public void start()
        {
            isWon = false;

            ivStory.setImageResource(R.drawable.deadly_zombie_virus_high_school_edition);
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
                public void onClick(View v) {goOutSide();}
            });

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {stayHome();}
            });
        }





    private void goToStore()
    {
        ivStory.setImageResource(R.drawable.you_hear_the_alarms_the_infected_are_coming);

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
            public void onClick(View v) {campUp();}
        });
    }


    private void lootAndDip()
    {
        ivStory.setImageResource(R.drawable.you_need_to_get_home_before_the_infected_go_home_on_foot_running_or_go_home_in_a_car);
        tvStoryText.setText("You need to get home, what do you do?");
        setAllBtnsVisible();
        btn1.setText("Go home in a car");
        btn2.setText("Go home on foot running");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {goHomeDriving();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {goHomeRunning();}
        });
    }

    private void goHomeDriving()
    {
        ivStory.setImageResource(R.drawable.to_many_cars_in_the_way_and_got_infected_you_died_you_lose);
        tvStoryText.setText("To many cars in the way and got infected you died YOU LOSE!!!!");
        end();
    }
    private void goHomeRunning()
    {
        ivStory.setImageResource(R.drawable.you_made_it_home_and_made_it_through_the_virus_since_you_had_food_to_last_you_months_you_win);
        tvStoryText.setText("You made it home and made it through the virus since you had food to last you months YOU WIN!!!!");
        end();
    }

    private void campUp()
    {
        ivStory.setImageResource(R.drawable.you_hear_the_alarms_the_infected_are_coming_people_are_breaking_in_what_do_you_do);
        tvStoryText.setText("You hear the alarms the infected are coming!!!!!! people are breaking in what do you do!!!???");
        btn1.setText("Fight back to be the only one in");
        btn2.setText("Let people through since you nice");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fightBack();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {letThemIn();}
        });
    }
    private void fightBack()
    {
        ivStory.setImageResource(R.drawable.you_fight_people_back_and_you_were_able_to_last_with_the_stores_food_supply_you_win);
        tvStoryText.setText(" You fight people back and you were able to last with the stores food supply YOU WIN!!!!");
        end();
    }

    private void letThemIn()
    {
        ivStory.setImageResource(R.drawable.one_infected);
        tvStoryText.setText(" One person was infected and you were infected and died YOU LOSE!!!");
        end();
    }

    private void goOutSide()
    {
        ivStory.setImageResource(R.drawable.plot_twist_you_are_infected_what_will_you_do_would_you_like_to_do_outside);
        tvStoryText.setText(" Plot twist You are infected what will you do, Would you like to do outside?");
        setAllBtnsVisible();
        btn1.setText("Infect large group");
        btn2.setText("Infect small group?");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infectLargeGroup();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {infectSmallGroup();}
        });
    }


    private void infectLargeGroup()
    {
        ivStory.setImageResource(R.drawable.so_you_took_the_large_group_of_infected_zombies_with_you_and_now_start_plotting_the_next_move);
        tvStoryText.setText("So you took the large group with you and now start plotting the next move\nTake large group to where?");
        setAllBtnsVisible();
        btn1.setText("Go to the mall");
        btn2.setText("Go to the Park");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {goToMall();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {goToPark();}
        });
    }

    private void goToMall()
    {
        ivStory.setImageResource(R.drawable.you_took_on_a_large_sum_of_people_and_built_a_large_army_of_infected_zombies_and_nobody_could_stop_you);
        tvStoryText.setText("You took a large sum of people and built a large army of infected people and nobody could stop you YOU WINN!!!!!");
        end();
    }

    private void goToPark()
    {
        ivStory.setImageResource(R.drawable.multiple_people_had_spotted_your_army_and_alerted_the_military_and_your_army_was_shot_down_by_infected_zombies);
        tvStoryText.setText("Multiple people had spotted your army and alerted the military and your army was shot down YOU LOSE!!!!!");
        end();
    }


    private void infectSmallGroup()
    {
        ivStory.setImageResource(R.drawable.you_need_to_grow_stronger_as_an_infected_zombie);
        tvStoryText.setText("you need to grow stronger where are you going?\nTake small group infected people to city\nTake small group infected people to neighborhood");

        setAllBtnsVisible();
        btn1.setText("Go to the city");
        btn2.setText("Go to the Neighborhood");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCity();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {goToNeighborhood();}
        });
    }
    private void goToCity()
    {
        ivStory.setImageResource(R.drawable.the_city_started_to_fight_back_the_infected_and_you_ended_up_dying);
        tvStoryText.setText("The city started to fight back and you ended up dying YOU LOSE!!!!");
        end();
    }

    private void goToNeighborhood()
    {
        ivStory.setImageResource(R.drawable.you_ended_up_sneaking_up_on_unsuspecting_people_with_your_infected_zombies_and_grew_bigger_well_done);
        tvStoryText.setText("You ended up sneaking up on unsuspecting people and grew bigger well done YOU WIN!!!!!");
        end();
    }


    private void stayHome ()
    {
        ivStory.setImageResource(R.drawable.imagine_you_are_scared_and_unable_to_think_of_what_to_do_so_you_stay_home_set_up_defence_to_prevent_looters_or_use_what_you_have_hide_in_basement);
        tvStoryText.setText("You are scared and unable to think of what to do so you stay home\nSet up defence to prevent looters or Use what you have hide in basement");

        setAllBtnsVisible();
        btn1.setText("set Up Looter");
        btn2.setText("Go to the Park");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setUpLooter();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {hideInBasement();}
        });
    }
    private void setUpLooter()
    {
        ivStory.setImageResource(R.drawable.imagine_you_are_scared_and_unable_to_think_of_what_to_do_so_you_stay_home_set_up_defence_to_prevent_looters_or_use_what_you_have_hide_in_basement);
        tvStoryText.setText("you dont have much time\nwill you choose to put video-cams\nwill you set up traps to protect yourself hope to god you live");
        setAllBtnsVisible();
        btn1.setText("Put videoCams");
        btn2.setText("Put Traps");
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoCams();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                putTraps();
            }
        });
    }
    private void videoCams ()
    {
        ivStory.setImageResource(R.drawable.imagine_you_had_no_power_to_do_anything_but_were_able_to_live_but_had_lost_everything_you_owned_and_won_t_be_able_to_recover_from_this);
        tvStoryText.setText("You had no power to do anything but was able to live but had lost everything you owned an won't be able to recover from this You lose!!!!");
        end();
    }
    private void putTraps ()
    {
        ivStory.setImageResource(R.drawable.you_were_able_to_keep_yourself_save_you_live_another_day);
        tvStoryText.setText("You were able to keep yourself save You live another day!!!!");
        end();
    }
    private void hideInBasement ()
    {
        ivStory.setImageResource(R.drawable.imagine_you_need_to_stay_chilly_but_theres_only_two_thing_you_can_take_food_and_clothes_or_water_and_meds);
        tvStoryText.setText("you need to stay chilly but theres only two thing you can take food and clothes or water and meds");
        setAllBtnsVisible();
        btn1.setText("Take food and clothes");
        btn2.setText("Take Water and meds");
        btn3.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodAndClothes();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {waterAndMeds();}
        });
    }

    private void foodAndClothes()
    {
        ivStory.setImageResource(R.drawable.hiding_in_a_basement_you_had_no_water_you_sleep_in_three_days);
        tvStoryText.setText("Since you had no water you died in three days soo YOU LOSE!!!");
        end();
    }
    private void waterAndMeds()
    {
        ivStory.setImageResource(R.drawable.rescuers_came_to_save_you_out_of_a_basement);
        tvStoryText.setText("You live since you can only live on water for 3 day and no need for food up since you can not eat up to three weeks you had enough water for rescuers to make it to YOU WIN!!!!!!");
        end();
    }


    private void end()
    {
        if (isWon) {
            tvStoryText.setText("You finally beat the game so now carry this knowledge to the real world buddy Goodluck");

            ivStory.setImageResource(R.drawable.im_laborday_miracle);
        }
        else
        {
            numLives--;
            String text = "You wasted a life with that decision. You have " + numLives + " years remaining";
            tvStoryText.setText(text);
        }

        if (numLives > 0) {
            btn1.setText("Play again!");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    start();
                }
            });
        } else {
            ivStory.setImageResource(R.drawable.permanent_game_over);
            tvStoryText.setText("everything has died. Permanent Game over.");
            btn1.setText("Back to menu");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

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