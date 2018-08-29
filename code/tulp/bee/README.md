#Bee
**Bee** is a test framework, witch serves to specify created application. 
Bee is similar to Cucumber, xUnit and others, but has more abilities to specify features. 
Bee is used throw all process creating software. In the first stage, it is used as framework to create acceptance test and specify requirements.
On this stage is used Gherkin as language to describe requirements.
Next stage is system architecture specification. Usually the system architect create a vision how system has looks and how modules should be inside.
Bee is used to specify modules and interfaces between them. At this point the architect uses special language which is DSL (Domain-Specific Language) language with elements of Tulp language.
This language is called Stalk. Stalk is easy and can be understand by architects and product owners without technical education.
The last stage is specific for programmers. In this stage a programmer create two types of tests. The first type is integration tests, and second type is unit tests.
The programmer uses Tulp language to create these test types, but for each of these they use different set of tools from Bee framework.

**Bee** - framework for testing and creating specification.

**Gherkin** - language to specify requirements and describing acceptance tests. Is like human language, but uses some specific words and special layout.

**Stalk** - language to describe system architecture.

**Tulp** - language used to create system and tests.

## Requirements
At the beginning customer together with business architect create **features** and **scenarios** presenting how this feature should be realized.
They are using **Gherkin** language. All requirements are located in directory requirements in files with extension feature.
When **Bee** is launched then it browses requirement directory and builds in own data base the set of features and scenarios.
Each feature at the end should be implemented and be functional.
Bee creates report about progress in development of each of requirement element.
Having created features and scenarios, a programmer can start creating acceptance tests. For that they is using **Tulp** language with special annotations which are delivered by **Bee**.
These annotation are: **@Given**, **@When**, **@Then** and **@Bee**. Annotation @Bee is used to mark that this class contains definitions of Gherkin scenario steps.
Bee framework at the begining browses also pointed directory to looking for classes with @Bee annotation and try connect each method with annotation @Given, @When, @Then to scenario steps in data base.
Each step in data base can be in one of states: 
- Ignored - when Bee didn't find connection between scenario step and code;
- Pending - when Bee found connection, but test hasn't yet been implemented
- Failed - when test is implemented, but fails
- Passed - when test is implemented and pass

How is realized fit? Each of ours annotation has parameter which is regular expression. If text in step is compatible with regular expression then the fit is realized.
If more than one regular expression are fitting to one step then Bee immediately reports an error.
Another situation, when Bee is useful is when we creates simple methods without body. Then test theoretically pass, because there are not errors, but in reality they are not use created system. Bee checks, that in each step is called method from creating system. If not then step is marked as pending and all features use this step also.

There are one more annotation **@Step**. Annotation this is used to mark method which calls method in creating system.
When acceptance test is triggered by Bee, then are realized all steps declared in @Given method, next is called step from @When annotation (@When annotation can have only one step). At the end are realized all steps from @Then annotation. 

For example:
in Cucumber is very difficult to specify a state of file system, example files etc.
In Bee it is very simple. Just you must describe the file name and what is inside or when this file exists.
For example that kind of specification:
> Features: 
>
>