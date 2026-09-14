# Journal
## Phase 1
Direct access could let other parts of the game change a Guardian's defense rating to an invalid value.
For example, a player could set the rating to a negative number or an unfairly high number.
Since the field is public, the class cannot control or validate the change.
This could cause bugs or cheating in game.

## Phase 2
When I made the fields private, the direct field access in main stopped working.
I had to use getter and setter methods to read and change the values.
This is better because the class can control how its data is changed.
The setter also allows me to reject invalid defense ratings.
