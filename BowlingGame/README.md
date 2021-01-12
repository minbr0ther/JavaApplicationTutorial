# Bowling Game Demo (TDD test project)

## 1. Rule

- The bowling game consists of 10 frames.
- Each frame usually has 2 rolls (two chances to knock over 10 bowling pins)
- **Spare**: 10 + number of pins knocked over in the next one roll
- **Strike**: 10 + number of pins knocked over in the next two roll
- 10th frame is special. You can roll 3 times if you do spare.

## 2. Design

![image](https://user-images.githubusercontent.com/24728385/104207851-c8b1cd80-5473-11eb-9b85-441fdbc83a4b.png)

* A class called `Game` has two methds: `roll(pins: int)`, `score(): int`
  * The `roll (pins: int)` method is called each time the ball is rolled. 
  * `pins` is argument of `Roll` and it has count of knoking over pins.
  * The `score()` method is called only after the game is over and returns the **score of the game**.
    * it must iterate through all the frames, and calculate all their scores.

* `Game` has 10 frames

* `Frame` has 1 or 2 Rolls

* `Tenth Frame` is exceptional because it has **2 or 3 rolls **

* `nextFrame` is the necessary argument for spare and strike



### >> Sample Score Board to calculate score and total

![image](https://user-images.githubusercontent.com/24728385/104304531-d5373400-550e-11eb-902c-027f7a90336d.png)

![image](https://user-images.githubusercontent.com/24728385/104303880-fc413600-550d-11eb-9047-347f130ca5f1.png)



### 3. Goal (just one player)

![image](https://user-images.githubusercontent.com/24728385/104298167-027fe400-5507-11eb-85bf-ca87bb195f8d.png)



### 4. Advanced Goal (player VS another player)

![image-20210112185342887](/Users/jeongminhyeong/Library/Application Support/typora-user-images/image-20210112185342887.png)



