# Zoo Management System

#### A company has bought a Zoo Management System from you.
#### Their secretary will use this system to create and manage multiple Zoo's that they have.

## Task 1 - Model for Zoo System

Make a model for a Zoo System. All Zoo's have this information:
* Zoo name
* Zoo location (country, city, latitude and longitude)
* Zoo size (how many cages)
* Zoo staff (list of people (the person model is given to you))
* List of cages
* Open hours (e.g Mon-Fri 8-17)

Cage information:
* Cage maximum capacity (how many animals fit in it)
* Cage type (bird cage, cage with water, cages without water, ice cage, etc... unlimited options, administrator can add more options)
* Cage location (a number, the company workers know the location based on it)
* Food amount in cage
* Last cage feeding time
* Next cage feeding time
* List of animals inside that cage

Animal information:
* Name, age
* Animal type (dog, cat, etc)
* What cage is it in
* Maximum amount of children possible with 1 breeding
* Animal code (All same zoo animal codes must be unique)
* Birthdate
* Death date
* Death reason
* Hunger level
* Health status (Healthy, sick, dead)
* If animal is sick, sickness type (fever, poisoned, etc, endless possibilities)
* List of children (also animals, must be same type as parent)

* Two animals can breed to make (1 ... x) children
* Animals can die, get hungry, eat (if food in cage)
* We can relocate animal to another cage


## Task 2 - Management System

A secretary can:
* Create new Zoos (new Zoo())
* Create new Cages (new Cage(), zoo.addCage(cage, 5))
  * Modify Cage information (cage.setNextFeedingTime(Tomorrow))
* Modify Zoo information (zoo.setName("Name"))
* Create new Animals (new Animal())
* Move animals between cages or between Zoos (animal.moveTo(zoo2, cage5))
* See animal information by Animal ID (zoo.getAnimalById(355))
* See what animals are in the Cage by Cage location (zoo.getCage(3).getAnimals())
* See how many people are working today (zoo.getWorkingStaff())
* Breed animals (animal1.breed(animal2))
* cure animals (animal1.cure())
* Kill animals (animal1.kill("reason"))
* Etc, etc. Everythink you think the secretary should have access to do, please add it.

# ADD MORE OF YOUR OWN BUSINESS LOGIC TOO!
# THE BETTER THE SYSTEM THE BETTER WE PAY