the keyword "this" in the Bloxburg Business Simulator program is used to reference the current object's variables inside of the constuctor. 
Info that is passed into the constuctor for that value is then set to the variable set by this. For example, this.name sets the business' name using the value passed into the
constructor. 

Method overloading is used mainly within the business constructors inside business.java. It is implemented to avoid ambiguity by utilizing the multiple constructors that a llow a business
to be created with different amounts of information using the same method. Based on the arguments that are provided, java can choose the correct constructor based on the method parameters.

Static fields are used to keep track of how many businesses are created. Static fields make it so that a variable is shared 
between every business object instead of having each business have it's own variables to track.