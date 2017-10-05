# Database Design for Final Fantasy Football

![Screen Design](images/Screens/index.png)

* Users can have multiple teams

* Teams pull players by ID and fill slots of "player one, player two, etc..." this way

* players populate with lookup tables of player types, this allows for easy querying and organizing

* players will have an enumerated status that can be changed manually or automatically, this will 
then make teams status as valid or invalid, prompting a change in the team