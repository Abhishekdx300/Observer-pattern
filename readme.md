# Observer Pattern

### Poll vs. Push

- let's assume there are multiple observers who are interested <br>
  in the frequently changing data of an observant.
- Now what they can do is, at the interval of a certain timeframe, <br>
  they call the observant to check if the data has changed. This is <br>
  called Polling.
- Polling isn't practical as the no. of observer grows, the no. of network <br>
  request to the observer increases, so much overhead.
- Instead, the observant can notify all its observer when its data is <br>
  updated. It is Pushing. (pushing the notification)

- The **Observer Pattern** implements the pushing the functionality.

#### Push-Push vs Push-Pull

- Here the first common "push" is for the notify method.
- Push-push signifies the observant notifies and also sends the data to observer. <br>
  This is implemented by passing its own instance to the observer via its (observer) <br>
  update() method.
- Push-pull signifies the observant has only one task, which is to notify the observers.<br>
  The observer must "pull" the data from the observant. It's implemented by dependency injection <br>
  of observant instance into the observant instance via its (observer) constructor.



