#Logical Operators 


##Logical AND  ( && )

cond1 && cond2    both must be true for expression value true

```
if cond1 is true we check cond2
	if cond2 is true 	expression value true
	if cond2 is false 	expression value false
```
```
if cond1 is false   expression value is false  
```

##Logical OR  ( || )
cond1 || cond2    both must be false for expression value false 

```
if cond1 is true expression value is true
```

```
if cond1 is false 
	if cond2 is true   expression value is true
	if cond2 is false expression value is false
```
	
##Logical NOT ( ! )  aka bang
```
boolean cond1 = true;
boolean cond2 = false;
```

!cond1  expression value is false  
!cond2  expression value is true

!(cond1 && cond2)     expression value is true

cond1 && cond2       expression value is false

!false					expression value is true

!cond1 && cond2       expression value is false  

cond1 && !cond2 		expression value is true 
