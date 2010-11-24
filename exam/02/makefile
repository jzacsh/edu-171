JFLAGS=-g
JC=javac
NAME=BowlingCalc

default: $(NAME).class

$(NAME).class: $(NAME).java
	$(JC) $(JFLAGS) $(NAME).java
	java $(NAME)

clean:
	rm *.class
