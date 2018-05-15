-- HEADER --
God’s Plan - By William Hu, Shaunak Bhandarkar, Navaneet Kadaba
05-15-18




-- DESCRIPTION --
You are just an ordinary guy, or so you think… maybe you have done something wrong, or not been the nicest person on Earth, but God resents your actions. One day, you are walking down the street, on your way to work, jamming to that new hit single by Drake, God’s Plan, when all of a sudden, God unleashes his plan… on YOU. You are unwillingly whisked into a world of dangers, filled with obstacles such as walls, turrets, spikes, and lightning bolts, with the objective of getting to work (the end zone) intact. Be careful though! If you even touch or get hit by one of God’s obstacles, there is no second life for sinners! This whimsical world is the ultimate testament of your faith as well as your persistence. Can you get to work on time… alive?
Maybe you’ve shown your faith, or proven yourself, and passed God’s test. Now, get together with your friends, and YOU can be God in the sizzling multiplayer mode. This is your opportunity to be an immortal, and unleash your wrath on sinful mortals! Experience the fun as your friends run through your rat-race, where only one winner can reach eternal glory. 








--------------------------------------
--INSTRUCTIONS--
Keyboard Actions:
        Up Arrow - Character jumps
        Left Arrow - Moves character left 
        Right Arrow - Moves character right
        Spacebar or p - Pauses the game
        A - Scrolls the screen left in God mode
        D - Scrolls the screen right in God mode




Mouse Actions:
        Click and Drag: to place objects throughout the level (For God only)




-- FEATURE LIST --
Must have:
* Local multiplayer between god and player
* 5 obstacles that the god can place
* Ability to choose difficulty (for player)
* Ability to choose base level (for god)
* Single Player option (god is computer that places using a simple AI)
* Collision detection between traps and player


Want to have:
* Cool cinematic intro
* Collision detection between players
* Background music
* Player/god customizations
* Themes
* Networked multiplayer


Stretch features:
* Adding cheat codes so the player can get hidden abilities
* Saving levels that god has made
* Ability to add your own music
* Player emotes
* In game chat
* Ability to change controls




-- CLASS LIST --
Menu - is all the panels
* DeathMenu 
* PauseMenu 
* StartMenu
* DifficultyMenu
* FinishedLevelMenu
* GodScreen
* LevelMenu
* MultiplayerMenu
Button - Represents a clickable button
        * ClickableObstacle - A Button that represents an Obstacle
GameScreen - has the game
Sound - does sound for the game
Server - makes the server for multiplayer
Player - represents each player
God - Keeps track of how many obstacles God has placed
ImageLoader - Stores all images used to increase efficiency
Main - Runs the program
Obstacle (abstract) - represents all obstacles. Inherited by:
* Spikes
* Glue
* Turrets
        * Bullet
* Block
* LandMine
* FinishHouse



-- RESPONSIBILITY LIST --
Navaneet - in charge of menu, buttons, and the game screen
Shaunak - God of making obstacles, javadoc-ing, and READMe's
William - in charge of creating God, Player, and the UML
