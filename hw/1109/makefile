JFLAGS=-g
JC=javac
NAME=milliStrTime06

default: $(NAME).class

$(NAME).class: $(NAME).java
	$(JC) $(JFLAGS) $(NAME).java
	run

run: $(NAME).class
	java $(NAME)
	date +%H:%M:%S

clean:
	rm *.class
