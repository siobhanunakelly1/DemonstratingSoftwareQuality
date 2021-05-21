# DemonstratingSoftwareQuality

## Sprint Backlog

1. Plan Class Structure **3**
2. Create Rubric Class **1**
3. Create Criterion Class **1**
4. Create Controller Class including functionality to: **5**
 - create a rubric
 - add a criterion
 - get all rubrics
 - get rubric by name
5. Create StudentGrade Class **1**
6. Create Grade Class **1**
7. Add Student grade functionality to Controller Class including: **5**
 - create a grade
 - add a score
 - get all rubrics
 - get Rubric by name 
8. Average, standard deviation, minimum and maximum calculations for Rubric **5**
9. Average, standard deviation, minimum and maximum calculations for Criterion **2**
10. Create validation for maximum number of criteria per Rubric and possible scores for Criterion **3**

### Estimation Explanation
I gave each task story points using fibonacci sequence based on difficulty and time I think they I think they will take to complete.

I gave planning class structure a 3 I think it is important to spend a good amount of time planning this as there is complexity in deciding how many classes are required, what they are, what the relationships between them will be and how they will interact with eachother.

Creation of classes like Rubric, Criterion, Student etc I gave a low esitmates as they are plain java classes which dont have much complexity in their functionality and having spent time planning relationships should make creation easier.

I gave creation of the Controller class and its functionality much higher points than creation of plain java classes as there will be more complexity in its methods and therefore will require more testing which needs to be factored in to the estimate. 

Calculations for the Rubric I gave a 5 as I am not yet sure how to calculate the standard deviation and will have to research this before I begin and again this will involve a lot of testing.

Calculations for specific Criterion I have given a lower estimate in comparison to calculations for Rubric as the research will already be completed and hopefully I will be able to reuse some of the functionaility from the previous task.

The validation for scores and number of criteria I have given a 3 as I think the functionality will be relatively straight forward but will involve a number of test cases.

### Velocity Metric

Velocity is used to estimate how much work a team is capable of completing per sprint. The velocity metric is calculated based on how many story points were completed in previous sprints. The story points from all fully-completed tasks in each sprint are added up and the average of these is the team's velocity. The team must also decide on their Definition of Done - a list of criteria that must be met before task can be marked as complete e.g. full test coverage. So for example, even if all coding is completed for a task it cannot be marked as done and its points cannot be included in the total unless the testing is complete too. The velocity is then used when planning future sprints to decide how many stories should be pulled in based on their points. Generally velocity should not be exceeded and in a case where a developer might be free they should first offer to help others with large stories rather than pulling in new ones. This will help to stop points being carried over to the next sprint.


## Test-Driven Development

## Code Coverage Tool

## Version-Control

## Code-Review Checklist

When reviewing someone else's code, there are a few questions to ask:
 - Do the changes match the intent?
 - Is the code easy to understand?
 - Is there any duplication of code/could functionality be reused anywhere?
 - What is the level of test coverage? Also review the quality of the tests, are they passing for the right reasons? Are they testing what they are supposed to be testing?

Code-review through pull requests:
 - Read the pull request description and start a coversation from there
 - Leave a comment with any questions or notes you have
 - Always direct the comments at the code and not the author
 - If there is too much back and forth in the comments, maybe it is time to organise a meeting to clear up outstanding queries

