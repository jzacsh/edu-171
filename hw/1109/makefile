JFLAGS=-g
JC=javac
NAME=milliStrTime06

default: run

$(NAME).class: $(NAME).java
	$(JC) $(JFLAGS) $(NAME).java

run: $(NAME).class
	java $(NAME)
	date +%H:%M:%S
	date +%s

clean:
	rm *.class
