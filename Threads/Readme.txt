Task 1

Write a java program where you will create 5 threads named:

1. add

2. sub

3. mul

4. div

5. oth

Whenever add, sub, mul and div will be executed they will take 2 integers as user inputs and add, subtract, multiply and divide them respectively and show the result as output. For execution of any other named threads "No valid operation" output will be provided.

Hint: You can either extend the "Thread" or implement from "Runnable" class. But you have to define the required operations or instructions using only one class. You can't define different classes for different threads.



Task 2

Write a java program, that creates five child thread with names:

1.    House Stark

2.    House Targaryen

3.    House Lannister

4.    House Bolton

5.    House Tyrell

‘House Stark’ will get the highest priority and ‘House Bolton’ will get the lowest priority. The run method of your custom thread class should print “The house is : [name of the house]”.

Run ‘House Stark’, ‘House Targaryen’, ‘House Lannister’, ‘House Bolton’ in single threaded mode and ‘House Stark’, ‘House Tyrell’, ‘House Lannister’, ‘House Bolton’ in multi-threaded mode. After finishing the task of ‘House Stark’, ‘House Lannister’ and ‘House Bolton’, if ‘House Stark’ thread is alive print “Not Today!” and if the ‘House Bolton’ thread is dead print “You know nothing!”.



Task 2 (Bonus)

Bonus part: The thread stays idle for 1 second after printing if it is “House Stark” or “House Targaryen”, 3 second after printing if it is “House Lannister” or “House Bolton” and 5 seconds for all the other threads.



Task 3

Assume that you are stuck in a room and it requires a pin that is an integer but not a usual one. It needs to be extracted from a Fibonacci series.

Write a java program that will find a special integer using 5 Thread from the first 50th term of the Fibonacci series. (Hint: you need to use 'long' dataType)

To find the special integer:

1. First, calculate the Mean from the odd numbers of the first half of the series using one thread. 

2. Second, calculate the Mean from the even numbers of the first half of the series using another thread.

3. Thirdly, calculate the Mean from the odd numbers of the second half of the series using one more thread.

4. Then,  calculate the Mean from the even numbers of the second half of the series using another thread.

5. Finally, calculate the average of those 4 Mean that you calculated so far using another thread.

Hint: You may use loop statement to iterate over each half of the Fibonacci series