# Perfect Numbers

## Examples
- 6 = 1+2+3 = 6
- 28 = 1+2+4+7+14 = 28
- 496
- 8128

## Algorithm
- Find all the factors
  - Ignore the number itself
  - How would I implement it?
    - I will divide the number by every number from 1 till less than that number.
    - For ex, If my number is 6 then I will divide it by every number from 1 till 5.
    - If remainder is 0 then, that number is a factor, I need to somehow store and add these factors.
    - I don't know how to store so many numbers. So I need to find a way to directly add them and produce a result.
    - Problem with adding numbers
      - Initially, We have no factors, so when we find the first factor, we don't know in which number it should be added.
      - APPROACH: Start by creating a variable and set its value to 0. This variable will keep track of the total sum of factors. When we find the first factor, we add it to this variable. Since the variable starts at 0, adding the first factor will directly give us the correct total. This ensures the addition works properly right from the start.
      - Now we have to check whether the addition of the factors is equal to the number. 
    