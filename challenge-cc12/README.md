# Animal Shelter Queue

This Java program implements an Animal Shelter that holds dogs and cats and operates on a first-in, first-out basis. 
It provides the following functionality:

- `enqueue`: Adds an animal (either a dog or a cat) to the shelter.
- `dequeue`: Removes and returns an animal based on preference (either "dog" or "cat").

## Approach & Efficiency 

- Method enqueue(String species, String name): Time Complexity: O(1) because it adds an animal to the end of the queue
                                               (.add())
- Method dequeue(String pref): Time Complexity: O(n) because it may need to iterate through all animals in the queue,
                                                to search for an animal with the specified preference (species).


- The space complexity is O(n) due to the space required to store the animals in the queue.




## Usage

1. Create an instance of the `AnimalShelter` class.
2. Use the `enqueue` method to add animals to the shelter, specifying their species ("dog" or "cat") and name.
3. Use the `dequeue` method to retrieve an animal based on preference ("dog" or "cat").

## WhiteBoard 

![Whiteboard](app/src/main/resources/cc12whiteboardnew.png)

## Solution 
![Output](app/src/main/resources/cc12output.png)