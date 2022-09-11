The QuestionBuffer class is used by two threads. 
The TeacherThread writes some questions to the QuestionBuffer at a random interval. 
The StudentThread reads the Buffer whenever there are new values and prints those questions. 
If the Buffer is empty, the StudentThread goes to a suspended state. Whenever a new question is inserted, the TeacherThread gives the suspended StudentThread a wake-up call.
You only need to modify the QuestionBuffer class and print the buffer pointer at the end of the main method.